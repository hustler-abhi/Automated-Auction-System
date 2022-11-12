package com.auction.usecase;

import java.util.List;

import com.auction.dao.AdminDao;
import com.auction.dao.AdminDaoimpl;
import com.auction.exception.BuyerException;
import com.auction.model.BuyerBean;

public class GetBuyerdetails {
	
	
	
	public static void main(String[] args) {
		
		
		  AdminDao dao=new AdminDaoimpl();
		  
		  try {
			  
	List<BuyerBean>list= dao.getbuyerlist();
	
	list.forEach(s->{
		System.out.println("Buyer_id is "+s.getBID());
		System.out.println("Buyer_Name is "+s.getBuyer_Name());
		System.out.println("Buyer_email is "+s.getEmail());
		 
		System.out.println("==============================");
		
	});
			
			
		} catch (BuyerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
