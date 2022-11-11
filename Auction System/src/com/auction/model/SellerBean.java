package com.auction.model;

public class SellerBean {

	private int sid;
	private String sname;
	private String email;
	private String password;
	private String Status;
	public SellerBean(int sid, String sname, String email, String password, String status) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.password = password;
		this.Status = status;
	}
	public SellerBean(  String sname, String email, String password, String status) {
		super();
		this.sname = sname;
		this.email = email;
		this.password = password;
		this.Status = status;
	}
	public SellerBean(  String sname, String email, String password ) {
		super();
		this.sname = sname;
		this.email = email;
		this.password = password;
	 
	}
	public SellerBean() {
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "SellerBean [sid=" + sid + ", sname=" + sname + ", email=" + email + ", password=" + password
				+ ", Status=" + Status + "]";
	}
}
