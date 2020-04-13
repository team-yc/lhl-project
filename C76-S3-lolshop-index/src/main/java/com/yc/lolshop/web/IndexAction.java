package com.yc.lolshop.web;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.yc.lolshop.vo.Result;
import com.yc.lolshop.bean.CartitemExample;
import com.yc.lolshop.bean.User;
import com.yc.lolshop.biz.BizException;
import com.yc.lolshop.biz.UserBiz;
import com.yc.lolshop.dao.CartitemMapper;
import com.yc.lolshop.dao.CategoryMapper;

@RestController
@SessionAttributes("loginedUser")
public class IndexAction {
	@Resource
	UserBiz ubiz;
	@Resource
	IlolshopBackAction ilba;
	
	@Resource
	lolshopBackAction lba;
	
	@Resource
	private CategoryMapper cgm;

	@ModelAttribute
	public void init(ModelAndView mav) {
		mav.addObject("cclist", ilba.getCc());
		mav.addObject("links", ilba.getlinks());
		mav.addObject("advs", ilba.getadvs());
	}

	@GetMapping({ "/", "index", "index.html" })
	public ModelAndView index(ModelAndView mav) {
		// 通过远程服务调用方式获取分类信息
		if (mav.getViewName() == null) {
			mav.setViewName("index");
		}
		System.out.println("===ViewName" + mav.getViewName());
		return mav;
	}
	

	@GetMapping("clist")
	public ModelAndView clist(int id, ModelAndView mav) {
		mav.addObject("csnlist",ilba.getPc(id) );
		mav.addObject("cclist2",ilba.getCc().get(id-1));
		//mav.addObject("pclist",ilba.getShop(id));
		mav.addObject("shopImg", ilba.getShopImg(id));
		mav.setViewName("clist");
		return mav;
	}
	
	@GetMapping({ "tologin", "login.html" })
	public ModelAndView tologin(ModelAndView mav) {
		mav.setViewName("login");
		return mav;
	}

	@PostMapping("login")
	public ModelAndView login(User user, ModelAndView mav, @SessionAttribute(name = "uri", required = false) String uri,
			HttpSession session) {
		try {
			User dbuser = ubiz.login(user);
			session.setAttribute("loginedUser", dbuser);
			if (uri != null) {
				// 这是拦截登录的情况
				mav.setViewName("redirect:http://127.0.0.1" + uri);
			} else {
				// 这是用户的主动登录
				mav.setViewName("index");
			}
			return index(mav);
		} catch (BizException e) {
			e.printStackTrace();
			mav.addObject("msg", e.getMessage());
			mav.setViewName("login");
		}
		return mav;
	}

	@GetMapping("toforget")
	public ModelAndView toforget(ModelAndView mav) {
		mav.setViewName("forget");
		return mav;
	}

	@GetMapping("out")
	public ModelAndView out(ModelAndView mav, SessionStatus sessionStatus, HttpSession session) {
		// spring mvc 移除会话
		sessionStatus.setComplete();
		return index(mav);
	}

	@PostMapping("sendVcode")
	@ResponseBody
	public Result sendVcode(String username, HttpSession session) {
		try {
			String vcode = ubiz.forget(username);
			session.setAttribute("vcode", vcode);
			return new Result(0, "验证码发送成功！");
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(1, e.getMessage());
		} catch (RuntimeException e) {
			return new Result(1, "邮件发送失败，请联系客服！");
		}
	}

	@PostMapping("changePwd")
	@ResponseBody
	public Result changePwd(@Valid User user, Errors errors, String repwd, String vcode,
			@SessionAttribute(value = "vcode", required = false) String sessionVcode, HttpSession session) {
		if (sessionVcode == null) {
			return new Result(1, "请发送邮件获取验证码！");
		}
		if (errors.hasFieldErrors("password")) {
			return new Result(1, errors.getFieldError("password").getDefaultMessage());
		}
		if (sessionVcode.equals(vcode) == false) {
			return new Result(1, "验证码输入错误！");
		} else {
			try {
				ubiz.savePwd(user, repwd);
			} catch (BizException e) {
				e.printStackTrace();
				return new Result(e.getCode(), e.getMessage());
			}
			session.setAttribute("vcode", null);
			return new Result(0, "修改成功！");
		}
	}

	@GetMapping("toreg")
	public ModelAndView toreg(ModelAndView mav) {
		mav.setViewName("reg");
		return mav;
	}

	@PostMapping("reg")
	@ResponseBody
	public Result reg(@Valid User user, Errors errors, String repassword, ModelAndView mav) {
		if (errors.hasFieldErrors()) {
			return new Result(1, "注册失败", errors.getFieldErrors());
		}
		try {
			ubiz.reg(user, repassword);
			return new Result(0, "用户注册成功");
		} catch (BizException e) {
			e.printStackTrace();
			// 拒绝输入值
			errors.rejectValue(e.getName(), "" + e.getCode(), e.getMessage());
			return new Result(e.getCode(), "用户注册失败", errors.getFieldErrors());
		}

	}

	@GetMapping("myinfo.html")
	public ModelAndView myinfo(ModelAndView mav) {
		mav.setViewName("myinfo");
		return mav;
	}
	
	@Resource
	private CartitemMapper cm;

	@GetMapping("toCart")
	public ModelAndView toCart(ModelAndView mav,
			@SessionAttribute("loginedUser") User user) {
		CartitemExample cie = new CartitemExample();
		cie.createCriteria().andUidEqualTo(user.getId());
		mav.addObject("clist", cm.selectByExample(cie));
		//mav.addObject("total",cm.total(user.getId()));
		mav.setViewName("cart");
		return mav;
	}
	@GetMapping("advertising.html")
	public ModelAndView toCart(ModelAndView mav) {
		mav.setViewName("advertising");
		return mav;
	}
}