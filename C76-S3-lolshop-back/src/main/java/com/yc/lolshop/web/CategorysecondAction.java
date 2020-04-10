package com.yc.lolshop.web;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.lolshop.bean.Categorysecond;
import com.yc.lolshop.bean.CategorysecondExample;
import com.yc.lolshop.dao.CategorysecondMapper;

@RestController
public class CategorysecondAction {
	@Resource
	private CategorysecondMapper cgsm;
	
	@PostMapping("clist")
	public List<Categorysecond> getCsn(int id){
		CategorysecondExample cse = new CategorysecondExample();
		cse.or().andCidEqualTo(id);
		return cgsm.selectByExample(cse);
	}
}
