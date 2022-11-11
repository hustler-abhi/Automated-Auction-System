package com.auction.usecase;

import com.auction.dao.AdminDao;
import com.auction.dao.AdminDaoimpl;
import com.auction.exception.BuyerException;

public class GetBuyerdetails {
	
	
	
	public static void main(String[] args) {
		
		
		  AdminDao dao=new AdminDaoimpl();
		  
		  try {
			  
			System.out.println(dao.getbuyerlist());
			
			
		} catch (BuyerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
