package com.yc.lolshop.bean;

import java.util.List;

public class Category {
	private Integer id;

	private String cname;

	private String cimg;

	private List<Product> product;

	public Category(int id, String cname) {
		this.id = id;
		this.cname = cname;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname == null ? null : cname.trim();
	}

	public String getCimg() {
		return cimg;
	}

	public void setCimg(String cimg) {
		this.cimg = cimg == null ? null : cimg.trim();
	}
}