package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.AdminDao;
import com.auction.dao.AdminDaoimpl;
import com.auction.dao.BuyerDao;
import com.auction.dao.BuyerDaoimpl;
import com.auction.exception.AdminException;
import com.auction.exception.BuyerException;
import com.auction.model.SellerBean;

public class LoginAdmin {
	
	public static  boolean main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
		
		SellerBean sb = new SellerBean();
	 
		
		System.out.println("Enter Email ");
	 String email=sc.next();
		
		System.out.println("Enter password");
		 String pass=sc.next();
		
	  AdminDao dao=new AdminDaoimpl();
	 
	  try {
		  
		String msg=dao.loginAdmin(email, pass);
	 
		if(msg.equalsIgnoreCase("Welcome")) {
			return true;
		}else {
			return false;
		}
		
	} catch (AdminException e) {
		// TODO Auto-generated catch block
	 System.out.println(e.getMessage());
	}
	  return false;
	 
		
	}

}
