package com.auction.usecase;

import java.util.List;
import java.util.Scanner;

import com.auction.dao.BuyerDao;
import com.auction.dao.BuyerDaoimpl;
import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoimpl;
import com.auction.exception.ItemException;
import com.auction.model.ItemBean;

public class GetProductDetailsbyCategory {
	
	
	
	public static void main(String[] args) {
		
		
	Scanner sc=new Scanner(System.in);
		
		System.out.println("enter item_Category");
		String str=sc.next();
		
		
		 BuyerDao dao=new BuyerDaoimpl();
		
		try {
		List<ItemBean> list =dao.getProductDetailsByCategory(str);
		
		list.forEach(s->{
			System.out.println("Item_name is "+s.getItem_name());
			System.out.println("Item_price is " +s.getPrice());
			System.out.println("Item_quantity is "+s.getQuantity());
			System.out.println("Itrm_Ctegory is " +s.getCategory());
			
			
		});
		} catch (ItemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
