package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoimpl;
import com.auction.exception.SellerException;
import com.auction.model.SellerBean;

public class LoginSeller {
	
	
public static boolean main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	
	SellerBean sb = new SellerBean();
 
	
	System.out.println("Enter Email ");
 String email=sc.next();
	
	System.out.println("Enter password");
	 String pass=sc.next();
	
	SellerDao dao =new SellerDaoimpl();
	try {
		String msg=dao. loginSeller(email, pass);
		 
		if(msg.equalsIgnoreCase("Welcome")) {
			return true;
		}else {
			return false;
		}
		
	} catch (SellerException e) {
		e.printStackTrace();
	}
	
	return false;
	
}
}
