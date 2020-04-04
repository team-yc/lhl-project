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
import org.springframework.web.servlet.ModelAndView;

<<<<<<< HEAD
import com.yc.lolshop.bean.CartExample;
import com.yc.lolshop.bean.User;
import com.yc.lolshop.biz.BizException;
import com.yc.lolshop.biz.IEbuyBackAction;
import com.yc.lolshop.biz.UserBiz;
import com.yc.lolshop.dao.CartMapper;
import com.yc.lolshop.dao.CategoryMapper;
import com.yc.lolshop.vo.Result;
=======
import com.yc.lolshop.vo.Result;
import com.yc.lolshop.bean.User;
import com.yc.lolshop.biz.BizException;
import com.yc.lolshop.biz.UserBiz;
>>>>>>> branch 'master' of https://github.com/team-yc/lhl-project.git

@RestController
@SessionAttributes("loginedUser")
public class IndexAction {
<<<<<<< HEAD

	@Resource
	IEbuyBackAction eba;

	@Resource
	private CategoryMapper cgm;
	@Resource
	UserBiz ubiz;

	
	 @ModelAttribute
	 public void init(ModelAndView mav) {
		 mav.addObject("cclist", eba.getCc());
	 }
	 

=======
	@Resource
	UserBiz ubiz;
	
>>>>>>> branch 'master' of https://github.com/team-yc/lhl-project.git
	@GetMapping({ "/", "index", "index.html" })
	public ModelAndView index(ModelAndView mav) {
		// 通过远程服务调用方式获取分类信息

		
		if (mav.getViewName() == null) {
			mav.setViewName("index");
		}
		System.out.println("===ViewName"+mav.getViewName());
		return mav;
	}

	@GetMapping("tologin")
	public ModelAndView tologin(ModelAndView mav) {
		mav.setViewName("login");
		return mav;
	}
<<<<<<< HEAD

	@PostMapping("login")
	public ModelAndView login(User user, ModelAndView mav, @SessionAttribute(name = "uri", required = false) String uri,
			HttpSession session) {
		try {
			User dbuser = ubiz.login(user);
			// mav.addObject("loginedUser", dbuser);

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
=======
	
	@PostMapping("login")
	public ModelAndView login(User user, ModelAndView mav, 
			@SessionAttribute(name="uri",required=false) String uri,
			HttpSession session) {
		try {
			User dbuser = ubiz.login(user);
			//mav.addObject("loginedUser", dbuser);
			
			session.setAttribute("loginedUser", dbuser);
			if(uri != null) {
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
	public ModelAndView out(ModelAndView mav,@SessionAttribute("loginedUser") HttpSession session) {
		session.setAttribute("loginedUser", null);
		return index(mav);
	}
	
	@PostMapping("sendVcode")
	@ResponseBody
	public Result sendVcode(String username,HttpSession session) {
		try {
			String vcode = ubiz.forget(username);
			session.setAttribute("vcode", vcode);
			return new Result(0,"验证码发送成功！");
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(1,e.getMessage());
		} catch(RuntimeException e) {
			return new Result(1,"邮件发送失败，请联系客服！");
		}
	}
	@PostMapping("changePwd")
	@ResponseBody
	public Result changePwd(@Valid User user,Errors errors,String repwd,String vcode,@SessionAttribute(value = "vcode",required = false) String sessionVcode,HttpSession session) {
		if(sessionVcode == null) {
			return new Result(1,"请发送邮件获取验证码！");
		}
		if(errors.hasFieldErrors("password")) {
			return new Result(1,errors.getFieldError("password").getDefaultMessage());
		}
		if(sessionVcode.equals(vcode) == false) {
			return new Result(1,"验证码输入错误！");
		}else {
			try {
				ubiz.savePwd(user,repwd);
			} catch (BizException e) {
				e.printStackTrace();
				return new Result(e.getCode(),e.getMessage());
			}
			session.setAttribute("vcode", null);
			return new Result(0,"修改成功！");
		}
	}
	
	
	@GetMapping("toreg")
	public ModelAndView toreg(ModelAndView mav) {
		mav.setViewName("reg");
		return mav;
	}
	
	@PostMapping("reg")
	public ModelAndView reg(User user,String repassword,ModelAndView mav) {
		//ubiz.reg(user,repassword);
		
>>>>>>> branch 'master' of https://github.com/team-yc/lhl-project.git
		return mav;
	}

	@Resource
	private CartMapper cm;

	@GetMapping("toCart")
	public ModelAndView toCart(ModelAndView mav, @SessionAttribute("loginedUser") User user) {
		CartExample ce = new CartExample();
		ce.createCriteria().andUidEqualTo(user.getId());

		mav.addObject("clist", cm.selectByExample(ce));

		mav.setViewName("cart");
		return mav;
	}

	@GetMapping("toforget")
	public ModelAndView toforget(ModelAndView mav) {
		mav.setViewName("forget");
		return mav;
	}

	@GetMapping("out")
	public ModelAndView out(ModelAndView mav, HttpSession session) {
		session.setAttribute("loginedUser", null);
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
	public ModelAndView reg(User user, String repassword, ModelAndView mav) {
		// ubiz.reg(user,repassword);

		return mav;
	}
}