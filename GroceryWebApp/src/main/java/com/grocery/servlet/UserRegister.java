package com.grocery.servlet;

public class UserRegister {
	
	int userid;
	String name;
	String email;
	String mobile;
	String password;
	String confirmpassword;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
	public UserRegister() {
		super();
	}
	public UserRegister(int userid, String name, String email, String mobile, String password, String confirmpassword) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "UserRegister [userid=" + userid + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", password=" + password + ", confirmpassword=" + confirmpassword + "]";
	}
	
}
