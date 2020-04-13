package com.yc.lolshop.bean;


public class Img {
    private Integer id;

    private Integer pid;

    private String url;
    

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

	@Override
	public String toString() {
		return "Img [id=" + id + ", pid=" + pid + ", url=" + url + "]";
	}
    
    
}