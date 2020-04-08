package com.yc.lolshop.bean;

public class Category {
    private Integer id;

    private String cname;

    private String cimg;

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