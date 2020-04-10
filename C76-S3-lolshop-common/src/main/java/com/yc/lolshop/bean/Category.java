package com.yc.lolshop.bean;

import java.util.List;

public class Category {
    private Integer id;

    private String cname;

    private String cimg;
    
    /**
     * 	子类集合Category
     */
    private List<Category> children;

    public Category(int id, String cname) {
		this.id = id;
		this.cname = cname;
	}

	public List<Category> getChildren() {
		return children;
	}

	public void setChildren(List<Category> children) {
		this.children = children;
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