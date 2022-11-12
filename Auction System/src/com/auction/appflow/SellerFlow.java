package com.auction.appflow;

import java.util.Scanner;

import com.auction.exception.ItemException;
import com.auction.usecase.GetProductDetailsbyCategory;
import com.auction.usecase.InsertIntoItem;
import com.auction.usecase.LoginBuyer;
import com.auction.usecase.LoginSeller;
import com.auction.usecase.RemoveItembyid;
import com.auction.usecase.SelectItemToBuy;
import com.auction.usecase.SignupBuyer;
import com.auction.usecase.Signupseller;
import com.auction.usecase.UpdateItem;

public class SellerFlow {
	
	
	public static void main(String[] args) {
		
		
	}
	
public static void  SellerLoginSignup() {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Your Choice : ");
			System.out.println("1. Already Have Account ? Login Here");
			System.out.println("2. Seller Register ");
			System.out.println("3. Go To Home Page ");
			
			int y = sc.nextInt();
			if(y==1) {
				
			 LoginSeller la=new LoginSeller();
				boolean b=la.main(null);
				
				if(b) {
					
					 
					SellerFlow.SellerFunctions();
					
					break;
				}
				
			
			} else if(y==2) {
				
				 Signupseller sa=new Signupseller();
				 sa.main(null);
				 SellerFlow.SellerLoginSignup();
				break;
			} else if(y==3) {
				AdminFlow.HomePage();
				break;
			}else {
				System.out.println("Enter valid number");
			}
		}
	}

public  static void SellerFunctions() {
	while(true) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("This is Seller_Interface !");
		System.out.println("1. Insert_Item for Auction");
		System.out.println("2. Update Exisiting_Item");
		System.out.println("3. Remove_item from Auction");
		System.out.println("4. Go to home page");
		int x = sc.nextInt();
		if(x==1) {
			InsertIntoItem it=new InsertIntoItem();
		 try {
			it.main(null);
		} catch (ItemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		} else if(x==2) {
			 UpdateItem up=new UpdateItem();
			 up.main(null);
			
			 
			
			 
		} else if(x==4) {
			
			AdminFlow.HomePage();
			break;
		} 
else if(x==3) {
		RemoveItembyid r=new RemoveItembyid();
		r.main(null);
		 
		}
		else {
			System.out.println("Enter Valid Number");
		}
	}
}

}
