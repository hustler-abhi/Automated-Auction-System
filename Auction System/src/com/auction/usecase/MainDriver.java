package com.auction.usecase;

import java.sql.DriverManager;
import java.util.Scanner;

import com.auction.appflow.AdminFlow;
import com.auction.dao.AdminDao;
import com.auction.dao.AdminDaoimpl;

public class MainDriver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Automated Auction System");
		
  
	              AdminFlow.HomePage();
	 
		
		
		
	}
	
 
}
