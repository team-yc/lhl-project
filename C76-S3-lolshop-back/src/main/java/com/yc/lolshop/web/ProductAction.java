package com.yc.lolshop.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.lolshop.bean.Categorysecond;
import com.yc.lolshop.bean.CategorysecondExample;
import com.yc.lolshop.bean.Product;
import com.yc.lolshop.dao.CategorysecondMapper;
import com.yc.lolshop.dao.ProductMapper;

@RestController
public class ProductAction {

	@Resource
	private ProductMapper pm;
	
	@Resource
	private CategorysecondMapper csm;

	/**
	 * 查询所有的商品分类信息 // 127.0.0.1:8002/getPc
	 */

	@GetMapping("clist")
	public List<Categorysecond> getPc(int id) {
		//ProductExample pe = new ProductExample();
		CategorysecondExample cse = new CategorysecondExample();
		cse.or().andCidEqualTo(id);
		List<Categorysecond> list = csm.selectByExample(cse);
		//pe.or().andCsidIn(list);
		//PageHelper.startPage(1, 3);
		return list;
	}
	

	/*
	 * @GetMapping("product") public Product product(int id){ return
	 * pm.selectByPrimaryKey(id); }
	 */

}