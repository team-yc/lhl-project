package com.yc.lolshop.bean;

public class Cart {
    private Integer id;

    private Integer uid;

    private Integer ciid;

    private Double total;

    private Cartitem cartitem;

	public Cartitem getCartitem() {
		return cartitem;
	}

	public void setCartitem(Cartitem cartitem) {
		this.cartitem = cartitem;
	}
    
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

    public Integer getCiid() {
        return ciid;
    }

    public void setCiid(Integer ciid) {
        this.ciid = ciid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}