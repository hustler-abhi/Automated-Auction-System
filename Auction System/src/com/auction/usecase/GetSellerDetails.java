package com.auction.usecase;

import com.auction.dao.AdminDao;
import com.auction.dao.AdminDaoimpl;
import com.auction.exception.BuyerException;
import com.auction.exception.SellerException;

public class GetSellerDetails {
	
	
	
	public static void main(String[] args) {
		
		
		  AdminDao dao=new AdminDaoimpl();
		  
		  
			try {
				System.out.println(dao.getsellerlist());
			} catch (SellerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
	}

}
