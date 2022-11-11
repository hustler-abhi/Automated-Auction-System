package com.auction.appflow;

import java.util.Scanner;

import com.auction.usecase.GetProductDetailsbyCategory;
import com.auction.usecase.LoginAdmin;
import com.auction.usecase.LoginBuyer;
import com.auction.usecase.SelectItemToBuy;
import com.auction.usecase.SignupAdmin;
import com.auction.usecase.SignupBuyer;

public class BuyerFlow {
	
	
	
public static void BuyerLoginSignup() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Your Choice : ");
			System.out.println("1. Already Have Account ? Login Here");
			System.out.println("2. Buyer Register ");
			System.out.println("3. Go To Home Page ");
			
			int y = sc.nextInt();
			if(y==1) {
				
				LoginBuyer la  = new LoginBuyer();
				boolean b=la.main(null);
				
				if(b) {
					
					BuyerFlow.BuyerFunctions();
					
					break;
				}
				
			
			} else if(y==2) {
				
				 SignupBuyer sa=new SignupBuyer();
				 sa.main(null);
				 BuyerFlow.BuyerLoginSignup();
				break;
			} else if(y==3) {
				AdminFlow.HomePage();
				break;
			}else {
				System.out.println("Enter valid number");
			}
		}
	}
	
	public  static void BuyerFunctions() {
		while(true) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("1. Get Product Details By Category");
			System.out.println("2. Select Item To Buy");
			System.out.println("3. Go To Home Page");
			int x = sc.nextInt();
			if(x==1) {
				GetProductDetailsbyCategory gq=new GetProductDetailsbyCategory();
				
				gq.main(null);
				
				 
			} else if(x==2) {
				SelectItemToBuy sl=new SelectItemToBuy();
				
				sl.main(null);
				
				 
			} else if(x==3) {
				
				AdminFlow.HomePage();
				break;
			} else {
				System.out.println("Enter Valid Number");
			}
		}
	}
	
	

}
