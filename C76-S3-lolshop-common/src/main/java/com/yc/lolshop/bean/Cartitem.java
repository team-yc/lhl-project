package com.yc.lolshop.bean;

import java.io.Serializable;
import java.util.List;

public class Cartitem implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer uid;

    private Integer pid;

    private Integer count;
    
    private Product product;
    
    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Cartitem> getChildren() {
		return children;
	}

	public void setChildren(List<Cartitem> children) {
		this.children = children;
	}

	/**
     * 子类集合 Cartitem
     */
    
    private List<Cartitem> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}