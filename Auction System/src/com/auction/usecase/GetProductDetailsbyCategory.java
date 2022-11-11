package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.BuyerDao;
import com.auction.dao.BuyerDaoimpl;
import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoimpl;
import com.auction.exception.ItemException;

public class GetProductDetailsbyCategory {
	
	
	
	public static void main(String[] args) {
		
		
	Scanner sc=new Scanner(System.in);
		
		System.out.println("enter item_Category");
		String str=sc.next();
		
		
		 BuyerDao dao=new BuyerDaoimpl();
		
		try {
			System.out.println(dao.getProductDetailsByCategory(str));
		} catch (ItemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
