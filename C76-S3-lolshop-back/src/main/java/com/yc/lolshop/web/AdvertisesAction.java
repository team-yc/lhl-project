package com.yc.lolshop.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.lolshop.bean.Advertises;
import com.yc.lolshop.dao.AdvertisesMapper;

@RestController
public class AdvertisesAction {
	
	@Resource
	private AdvertisesMapper am;
	
	@GetMapping("getadvs")
	public List<Advertises> getadvs(){
		return am.selectByExample(null);
	}
	
}
