package vn.amabuy.models;

import org.apache.commons.lang3.RandomStringUtils;

public class Account {
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCfPwd() {
		return cfPwd;
	}
	public void setCfPwd(String cfPwd) {
		this.cfPwd = cfPwd;
	}
	public Account(String fullName, String email, String phone, String pwd, String cfPwd) {
		this.fullName = fullName;
		this.email = String.format("%s_%s", RandomStringUtils.randomAlphanumeric(10), email);
		this.phone = phone;
		this.pwd = pwd;
		this.cfPwd = cfPwd;
	}
	private String fullName;
	private String email;
	private String phone;
	private String pwd;
	private String cfPwd;

}
