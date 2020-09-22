package com.yc.sujian.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SessionAttributes("loginedUser")
public class IndexAction {

	@ModelAttribute
	public void init(ModelAndView mav) {
		
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
}
