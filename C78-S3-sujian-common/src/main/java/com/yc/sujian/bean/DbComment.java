package com.yc.sujian.bean;

import java.util.Date;

public class DbComment {
    private Integer id;

    private Integer aId;

    private Date aCreatetime;

    private String cContents;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Date getaCreatetime() {
        return aCreatetime;
    }

    public void setaCreatetime(Date aCreatetime) {
        this.aCreatetime = aCreatetime;
    }

    public String getcContents() {
        return cContents;
    }

    public void setcContents(String cContents) {
        this.cContents = cContents == null ? null : cContents.trim();
    }
}