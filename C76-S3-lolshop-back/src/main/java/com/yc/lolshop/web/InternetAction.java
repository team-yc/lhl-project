package com.yc.lolshop.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.lolshop.bean.Internet;
import com.yc.lolshop.dao.InternetMapper;

@RestController
public class InternetAction {

	@Resource
	private InternetMapper im;
	
	@GetMapping("getlinks")
	public List<Internet> getlinks(){
		List<Internet> list = im.selectByExample(null);
		return list;
	}
	
}
