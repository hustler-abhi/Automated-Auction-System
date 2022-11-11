package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoimpl;
import com.auction.exception.ItemException;
import com.auction.exception.SellerException;
import com.auction.model.ItemBean;
import com.auction.model.SellerBean;

public class InsertIntoItem {

	public static void main(String[] args) throws ItemException {
		
		Scanner sc =new Scanner(System.in);
		
		 
		
		System.out.println("Enter item_id");
		 int id=sc.nextInt();
		
		System.out.println("Enter item_name ");
		String name=sc.next();
		
		System.out.println("Enter price ");
	     int p=sc.nextInt();
		
	     System.out.println("Enter quantity ");
	     int q=sc.nextInt();
	     
	     System.out.println("Enter category ");
	     String catg=sc.next();
	     
	     System.out.println("Enter seller_id ");
	     int s_id=sc.nextInt();
		
		SellerDao dao =new SellerDaoimpl();
		try {
			System.out.println(dao.insertintoProduct(new ItemBean(id, name, p, q, catg, s_id)));
		} catch (ItemException  e) {
			e.printStackTrace();
		}
		
	}
}
