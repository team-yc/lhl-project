package com.yc.lolshop.biz;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.yc.lolshop.bean.Category;


@FeignClient(name = "lolshop-back", fallback = EbuyBackAction.class)
public interface IEbuyBackAction {
	/**
	 * http://ebuy-back/getPc
	 * @return
	 */
	@GetMapping("getCc")
	public List<Category> getCc();
	
}