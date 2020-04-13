package com.yc.lolshop.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.lolshop.bean.Category;
import com.yc.lolshop.bean.Product;
import com.yc.lolshop.dao.CategoryMapper;
import com.yc.lolshop.dao.ProductMapper;

@RestController
public class ImgAction {

	@Resource
	private CategoryMapper cgm;

	@Resource
	private ProductMapper pm;

	@GetMapping("getShopImg")
	public List<Product> getShopImg(int id) {
		System.out.println("==============");
		Category c = cgm.selectByPrimaryKey(id);
		List<Product> ps = c.getProduct();

		// List<Product> p = null;
		Product p2 = new Product();
		List<Product> p = new ArrayList<Product>();
		for (int i = 0; i < ps.size(); i++) {
			int ii = ps.get(i).getId();
			p2 = pm.selectByPrimaryKey(ii);
			p.add(p2);
		}
		return p;
	}

}
