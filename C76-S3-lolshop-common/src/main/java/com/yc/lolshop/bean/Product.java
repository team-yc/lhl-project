package com.yc.lolshop.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Product implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Integer uid;

	private Integer csid;

	private String pname;

	private Double price;

	private Integer pnum;

	private String pdesc;

	private Date pdate;
	
	private List<Img> imgs;

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

	public Integer getCsid() {
		return csid;
	}

	public void setCsid(Integer csid) {
		this.csid = csid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname == null ? null : pname.trim();
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getPnum() {
		return pnum;
	}

	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc == null ? null : pdesc.trim();
	}

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public List<Img> getImgs() {
		return imgs;
	}

	public void setImgs(List<Img> imgs) {
		this.imgs = imgs;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", uid=" + uid + ", csid=" + csid + ", pname=" + pname + ", price=" + price
				+ ", pnum=" + pnum + ", pdesc=" + pdesc + ", pdate=" + pdate + ", imgs=" + imgs + "]";
	}

	

	
}