package com.auction.usecase;

import java.util.Scanner;

import com.auction.dao.BuyerDao;
import com.auction.dao.BuyerDaoimpl;
import com.auction.exception.ItemException;

public class SelectItemToBuy {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter item name");
		
		String item=sc.next();
		
		BuyerDao b=new BuyerDaoimpl();
		
		try {
			System.out.println(b.selectItemtoBuy(item));
		} catch (ItemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
