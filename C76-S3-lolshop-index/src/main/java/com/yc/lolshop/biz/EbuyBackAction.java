package com.yc.lolshop.biz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yc.lolshop.bean.Category;



@Component
public class EbuyBackAction implements IEbuyBackAction {

	@Override
	public List<Category> getCc() {
		
		List<Category> list = new ArrayList<>();
		/*
		 * list.add(new Category(1, "化妆品")); list.add(new Category(2, "箱包"));
		 * list.add(new Category(3, "保健食品")); list.add(new Category(4, "电子商品"));
		 * list.add(new Category(5, "进口食品,生鲜"));
		 */
		return list;
	}


}