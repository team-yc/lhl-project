package com.yc.lolshop.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yc.lolshop.bean.Advertises;
import com.yc.lolshop.bean.Category;
import com.yc.lolshop.bean.Categorysecond;
import com.yc.lolshop.bean.Internet;
import com.yc.lolshop.bean.Product;



@Component
public class lolshopBackAction implements IlolshopBackAction {

	@Override
	public List<Category> getCc() {
		List<Category> list = new ArrayList<>();
		/*
		 * list.add(new Category(1, "雕塑手办")); list.add(new Category(2, "毛绒玩偶"));
		 * list.add(new Category(3, "男女服饰")); list.add(new Category(4, "珠宝首饰"));
		 * list.add(new Category(5, "数码电子")); list.add(new Category(6, "海报艺术"));
		 */
		return list;
	}

	@Override
	public List<Internet> getlinks() {
		return null;
	}

	@Override
	public List<Advertises> getadvs() {
		return null;
	}
	

	@Override
	public List<Categorysecond> getPc(int id) {
		return null;
	}

	@Override
	public List<Product> getShop(int id) {
		return null;
	}

	@Override
	public List<Product> getShopImg(int id) {
		return null;
	}


}