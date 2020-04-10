package com.yc.lolshop.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.yc.lolshop.bean.Category;
import com.yc.lolshop.bean.Product;
import com.yc.lolshop.dao.CategoryMapper;

@RestController
public class CategoryAction {

	@Resource
	private CategoryMapper cgm;

	/**
	 * 查询所有的商品分类信息 // 127.0.0.1:8002/getCc
	 */

	@GetMapping("getCc")
	public List<Category> getCc() {
		List<Category> list = cgm.selectByExample(null);

		return list;
	}
	
	@GetMapping("getShop")
	public List<Product> getShop(int id){
		PageHelper.startPage(1, 3);
		Category c = cgm.selectByPrimaryKey(id);
		return c.getProduct();
	}

}
