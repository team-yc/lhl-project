package com.yc.sujian.bean;

import java.util.Date;

public class DbArticle {
    private Integer id;

    private Date aCreatetime;

    private String aContent;

    private Integer aComments;

    private String aLabel;

    private Integer aAgreecnt;

    private String aTitle;

    private Integer cId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getaCreatetime() {
        return aCreatetime;
    }

    public void setaCreatetime(Date aCreatetime) {
        this.aCreatetime = aCreatetime;
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent == null ? null : aContent.trim();
    }

    public Integer getaComments() {
        return aComments;
    }

    public void setaComments(Integer aComments) {
        this.aComments = aComments;
    }

    public String getaLabel() {
        return aLabel;
    }

    public void setaLabel(String aLabel) {
        this.aLabel = aLabel == null ? null : aLabel.trim();
    }

    public Integer getaAgreecnt() {
        return aAgreecnt;
    }

    public void setaAgreecnt(Integer aAgreecnt) {
        this.aAgreecnt = aAgreecnt;
    }

    public String getaTitle() {
        return aTitle;
    }

    public void setaTitle(String aTitle) {
        this.aTitle = aTitle == null ? null : aTitle.trim();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}