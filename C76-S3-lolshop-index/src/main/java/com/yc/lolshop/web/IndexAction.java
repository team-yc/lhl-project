package com.yc.lolshop.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.yc.lolshop.bean.User;
import com.yc.lolshop.biz.BizException;
import com.yc.lolshop.biz.UserBiz;

@RestController
@SessionAttributes("loginedUser")
public class IndexAction {
	@Resource
	UserBiz ubiz;
	
	@GetMapping({ "/", "index", "index.html" })
	public ModelAndView index(ModelAndView mav) {
		// 通过远程服务调用方式获取分类信息
		/*
		 * mav.addObject("pclist", eba.getPc()); mav.addObject("hplist", eba.getHotP());
		 * mav.addObject("nlist", eba.getNews());
		 */
		if (mav.getViewName() == null) {
			mav.setViewName("index");
		}
		return mav;
	}

	@GetMapping("tologin")
	public ModelAndView tologin(ModelAndView mav) {
		mav.setViewName("login");
		return mav;
	}
	
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

}