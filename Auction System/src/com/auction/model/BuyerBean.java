package com.auction.model;

public class BuyerBean {
	private	int BID  ;  
	private String 	Buyer_Name; 
	private String 	email; 
  private String password;  
	private String 	status;

public BuyerBean(int bID, String buyer_Name, String email, String password, String status) {
		super();
		BID = bID;
		Buyer_Name = buyer_Name;
		this.email = email;
		this.password = password;
		this.status = status;
	}
public BuyerBean(  String buyer_Name, String email, String password ) {
	super();
	 
	this.Buyer_Name = buyer_Name;
	this.email = email;
	this.password = password;
 
}
public BuyerBean( ) {
 
}


public int getBID() {
	return BID;
}
public void setBID(int bID) {
	BID = bID;
}
public String getBuyer_Name() {
	return Buyer_Name;
}
public void setBuyer_Name(String buyer_Name) {
	Buyer_Name = buyer_Name;
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
	return "BuyerBean [BID=" + BID + ", Buyer_Name=" + Buyer_Name + ", email=" + email + ", password=" + password
			+ ", status=" + status + "]";
}
	

}
