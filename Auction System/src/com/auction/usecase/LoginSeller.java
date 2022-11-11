package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoimpl;
import com.auction.exception.SellerException;
import com.auction.model.SellerBean;

public class LoginSeller {
	
	
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	
	SellerBean sb = new SellerBean();
 
	
	System.out.println("Enter Email ");
 String email=sc.next();
	
	System.out.println("Enter password");
	 String pass=sc.next();
	
	SellerDao dao =new SellerDaoimpl();
	try {
		System.out.println(dao. loginSeller(email, pass));
	} catch (SellerException e) {
		e.printStackTrace();
	}
	
}
}
