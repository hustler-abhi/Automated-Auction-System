package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoimpl;
import com.auction.exception.SellerException;
import com.auction.model.SellerBean;

public class Signupseller {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		SellerBean sb = new SellerBean();
		
		System.out.println("Enter Name of the Seller");
		sb.setSname(sc.nextLine());
		
		System.out.println("Enter Email ");
		sb.setEmail(sc.next());
		
		System.out.println("Enter password");
		sb.setPassword(sc.next());
		
		SellerDao dao =new SellerDaoimpl();
		try {
			System.out.println(dao.signupSeller(sb));
		} catch (SellerException e) {
			e.printStackTrace();
		}
		
	}

}
