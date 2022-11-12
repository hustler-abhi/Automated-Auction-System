package com.auction.model;

public class AdminBean {
	

	private	int aID  ;  
	private String 	admin_Name; 
	private String 	email; 
  private String password;  
	private String 	status;
	
	public AdminBean(int aID, String admin_Name, String email, String password, String status) {
		super();
		this.aID = aID;
		this.admin_Name = admin_Name;
		this.email = email;
		this.password = password;
		this.status = status;
	}
	public AdminBean(  String admin_Name, String email, String password ) {
		super();
	 
		this.admin_Name = admin_Name;
		this.email = email;
		this.password = password;
		 
	}
	public AdminBean() {
		
		super();
	  
		 
	}
	
	
	
	public int getaID() {
		return aID;
	}
	public void setaID(int aID) {
		this.aID = aID;
	}
	public String getAdmin_Name() {
		return admin_Name;
	}
	public void setAdmin_Name(String admin_Name) {
		this.admin_Name = admin_Name;
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
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AdminBean [aID=" + aID + ", admin_Name=" + admin_Name + ", email=" + email + ", password=" + password
				+ ", status=" + status + "]";
	}
	
	
	
	

}
