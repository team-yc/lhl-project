package com.yc.lolshop.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderAction {
	
	@GetMapping("test")
	public String test() {
		return "back test";
	}
	
}
