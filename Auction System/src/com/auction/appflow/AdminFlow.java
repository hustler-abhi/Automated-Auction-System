package com.auction.appflow;

import java.sql.DriverManager;
import java.util.Scanner;

import com.auction.dao.AdminDao;
import com.auction.dao.AdminDaoimpl;
import com.auction.usecase.GetBuyerdetails;
import com.auction.usecase.GetSellerDetails;
import com.auction.usecase.LoginAdmin;
import com.auction.usecase.SignupAdmin;

public class AdminFlow {
	
	 
	
	
	public static void HomePage() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(" Enter Your Choice : ");
			System.out.println(  "+---------------------------+" + "\n"
					   + "| 1. Use As Administrator   |" + "\n"
					   + "| 2. Use As Buyer           |" + "\n"
					   + "| 3. Use as Seller          |" + "\n"
					   + "| 4. Exit!        	    |" + "\n"
					   + "+---------------------------+"  );
			
			int x = sc.nextInt();
			if(x==1) {
				AdminFlow.AdminLoginSignup();
				break;
			} else if(x==2) {
				
				BuyerFlow.BuyerLoginSignup();
				
				
				
				break;
			} else if(x==3) {
				
				SellerFlow.SellerLoginSignup();
				break;
			} else if(x==4) {
				System.out.println("Thank you ! for choosing our services ");
			 
				return;
			} else {
				System.out.println("Please Select Valid Number");
			}
				
			
		}
	}
	public static void AdminLoginSignup() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Your Choice : ");
			System.out.println("1. Already Have Account ? Login Here");
			System.out.println("2. Admin Register ");
			System.out.println("3. Go To Home Page ");
			
			int y = sc.nextInt();
			if(y==1) {
				LoginAdmin la  = new LoginAdmin();
				boolean b=la.main(null);
				
				if(b) {
					AdminFlow.GetBuyerAndSellerDetailsAdming();	
					break;
				}
				
			
			} else if(y==2) {
				SignupAdmin sa = new SignupAdmin();
				sa.main(null);
				AdminFlow.AdminLoginSignup();
				break;
			} else if(y==3) {
				AdminFlow.HomePage();
			}else {
				System.out.println("Enter valid number");
			}
		}
	}
	public static void GetBuyerAndSellerDetailsAdming() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("This is Admin Interface...");
			System.out.println("Enter your Choice : ");
			System.out.println("1. View Buyer List");
			System.out.println("2. View Seller List ");
			System.out.println("3. Go To Home Page");
			int x = sc.nextInt();
			if(x==1) {
				GetBuyerdetails g=new GetBuyerdetails();
				g.main(null);

			} else if(x==2) {
				GetSellerDetails gs=new GetSellerDetails();
				gs.main(null);
			} else if(x==3) {
				AdminFlow.HomePage();
				break;
			}else {
				System.out.println("Enter a valid number");
				 
			}
		}
	}

}
