package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.AdminDao;
import com.auction.dao.AdminDaoimpl;
import com.auction.dao.BuyerDao;
import com.auction.dao.BuyerDaoimpl;
import com.auction.exception.AdminException;
import com.auction.exception.BuyerException;
import com.auction.model.AdminBean;
import com.auction.model.BuyerBean;

public class SignupAdmin {
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		AdminBean sb=new AdminBean();
		
		System.out.println("Enter Your Name ");
		sb.setAdmin_Name(sc.nextLine());
		
		System.out.println("Enter Your Email ");
		sb.setEmail(sc.next());
		
		System.out.println("Enter New Password");
		sb.setPassword(sc.next());
		
		AdminDao dao =new  AdminDaoimpl();
		
	 
			try {
				System.out.println(dao.insertintoAdmin(sb));
			} catch (AdminException e) {
				e.printStackTrace();
			}
		 
		
	}

}
