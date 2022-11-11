package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.SellerDao;
import com.auction.dao.SellerDaoimpl;
import com.auction.exception.ItemException;

public class RemoveItembyid {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter item_id");
		int id=sc.nextInt();
		
		
		SellerDao dao =new SellerDaoimpl();
		
		try {
			System.out.println(dao.removefromProduct(id));
		} catch (ItemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
