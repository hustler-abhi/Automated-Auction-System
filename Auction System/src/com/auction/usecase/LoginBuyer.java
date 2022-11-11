package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.BuyerDao;
import com.auction.dao.BuyerDaoimpl;
import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoimpl;
import com.auction.exception.BuyerException;
import com.auction.exception.SellerException;
import com.auction.model.SellerBean;

public class LoginBuyer {
	
	
	public static boolean main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		SellerBean sb = new SellerBean();
	 
		
		System.out.println("Enter Email ");
	 String email=sc.next();
		
		System.out.println("Enter password");
		 String pass=sc.next();
		
	 BuyerDao dao=new BuyerDaoimpl();
	 
	 try {
		 
		String msg=dao.loginBuyer(email, pass);
		if(msg.equalsIgnoreCase("Welcome")) {
			return true;
		}else {
			return false;
		}
	} catch (BuyerException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return false;
		
	}

}
