package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoimpl;
import com.auction.exception.SellerException;
import com.auction.model.SellerBean;

public class UpdateItem {
	
	public static void main(String[] args) {
		
Scanner sc =new Scanner(System.in);
		
		SellerBean sb = new SellerBean();
		
		System.out.println("Enter new price");
	 int p=sc.nextInt();
		
		System.out.println("Enter new quantity ");
		int q=sc.nextInt() ;
		
		System.out.println("Enter buyer id");
		int b=sc.nextInt();
		System.out.println("Enter item id");
		 int i_id=sc.nextInt();
		
		SellerDao dao =new SellerDaoimpl();
		try {
			System.out.println( dao.updateItem(i_id, p, b, q));
		} catch (SellerException e) {
			e.printStackTrace();
		}
		
		
	}

}
