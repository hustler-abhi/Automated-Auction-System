package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.BuyerDao;
import com.auction.dao.BuyerDaoimpl;
import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoimpl;
import com.auction.exception.BuyerException;
import com.auction.exception.SellerException;
import com.auction.model.BuyerBean;
import com.auction.model.SellerBean;

public class SignupBuyer {
	
	
	
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
		
		 BuyerBean sb=new BuyerBean();
		
		System.out.println("Enter Name of the Buyer");
		sb.setBuyer_Name(sc.nextLine());
		
		System.out.println("Enter Email ");
		sb.setEmail(sc.next());
		
		System.out.println("Enter password");
		sb.setPassword(sc.next());
		
		BuyerDao dao =new  BuyerDaoimpl();
		
		try {
			System.out.println(dao.insertintoBuyer(sb));
		} catch (BuyerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
