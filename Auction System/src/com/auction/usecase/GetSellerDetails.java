package com.auction.usecase;

import java.util.List;

import com.auction.dao.AdminDao;
import com.auction.dao.AdminDaoimpl;
import com.auction.exception.BuyerException;
import com.auction.exception.SellerException;
import com.auction.model.SellerBean;

public class GetSellerDetails {
	
	
	
	public static void main(String[] args) {
		
		
		  AdminDao dao=new AdminDaoimpl();
		  
		  
			try {
				
			List<SellerBean>list=dao.getsellerlist();
			System.out.println("Detalis of  Availabe   Seller!");
			list.forEach(s->{
				System.out.println("Seller_id is "+s.getSid());
				System.out.println("Seller_Name is "+s.getSname());
				System.out.println("Seller_email is "+s.getEmail());
				 
				System.out.println("==============================");
				
			});
			} catch (SellerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
	}

}
