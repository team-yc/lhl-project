package com.yc.lolshop.web;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yc.lolshop.bean.Category;
import com.yc.lolshop.bean.Categorysecond;
import com.yc.lolshop.bean.Internet;
import com.yc.lolshop.bean.Product;


@FeignClient(name = "lolshop-back", fallback = lolshopBackAction.class)
public interface IlolshopBackAction {

	@GetMapping("getCc")
	public List<Category> getCc();
	
	@GetMapping("getlinks")
	public List<Internet> getlinks();
	
	
	@GetMapping("clist")
	public List<Categorysecond> getPc(@RequestParam("id")int id);
	
	@GetMapping("getShop")
	public List<Product> getShop(@RequestParam("id")int id);
}