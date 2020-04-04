package com.yc.lolshop.bean;

<<<<<<< HEAD
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
=======
import java.io.Serializable;
>>>>>>> branch 'master' of https://github.com/team-yc/lhl-project.git

<<<<<<< HEAD
import org.hibernate.validator.constraints.Length;

public class User implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;

=======
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	
>>>>>>> branch 'master' of https://github.com/team-yc/lhl-project.git
	@NotEmpty
    @Length(max=16,min=4)
    private String username;
	
	@NotEmpty
    @Length(max=12,min=6,message="密码长度必须在6~12位之间")
    private String password;
	
    private String name;
<<<<<<< HEAD

=======
    
>>>>>>> branch 'master' of https://github.com/team-yc/lhl-project.git
    @NotEmpty
    @Email()
    private String email;
<<<<<<< HEAD

=======
    
>>>>>>> branch 'master' of https://github.com/team-yc/lhl-project.git
    @Length(min = 11,max = 11,message="电话号码必须11位")
    private String phone;

    private String sex;

    private Integer state;

    private String code;

    private String addr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }
}