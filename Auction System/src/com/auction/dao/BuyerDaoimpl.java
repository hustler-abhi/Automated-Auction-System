package com.auction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.auction.exception.BuyerException;
import com.auction.exception.ItemException;
import com.auction.exception.SellerException;
import com.auction.model.BuyerBean;
import com.auction.model.ItemBean;

import Utility.DBUTILL;

public class BuyerDaoimpl implements BuyerDao {

	@Override
	public String insertintoBuyer(BuyerBean s) throws BuyerException {
		
String message = "Buyer not registered...";
		
		
		try (Connection con=DBUTILL.provideConnection()){
		PreparedStatement ps=	con.prepareStatement("insert into Registered_Buyer(buyer_name,email,password) values(?,?,?)");
			ps.setString(1, s.getBuyer_Name());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getPassword());
			int ans=ps.executeUpdate();
			
			if(ans>0) {
				message=s.getBuyer_Name()+" Signed up Succesfully ";
			}else {
				throw new BuyerException(message);
			}
		} catch (SQLException e) {
			throw new BuyerException(e.getMessage());
		}
		
		
		return message;
	}

	@Override
	public String loginBuyer(String email, String pass) throws BuyerException {
		// TODO Auto-generated method stub
	String message = "Buyer not found...";
		
		
		try (Connection con=DBUTILL.provideConnection()){
		PreparedStatement ps=	con.prepareStatement("select * from registered_Buyer where email = ? and password =?");
		
			
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs  =ps.executeQuery();
			
			if(rs.next()) {
				message= "  Welcome  "+rs.getString("Buyer_name") +"!";
				System.out.println(message);
				message="Welcome";
			}else {
				throw new  BuyerException(message);
			}
		} catch (SQLException e) {
			throw new  BuyerException(e.getMessage());
		}
		
		
		return message;
		
	}

	@Override
	public List<ItemBean> getProductDetailsByCategory(String category) throws ItemException {
		// TODO Auto-generated method stub
		List<ItemBean>items=new ArrayList();
		
		String message = "item not Available ...";
 
				
				
				try (Connection con=DBUTILL.provideConnection()){
				 
				PreparedStatement ps  =	con.prepareStatement("select * from item where category=?");
				
				 ps.setString(1, category);
				 
				  
					ResultSet rs=	ps.executeQuery();
				 
			
		 
				while(rs.next()) {
				ItemBean	item=new ItemBean(rs.getInt("item_id"), rs.getString("item_name"),rs.getInt("price"), rs.getInt("quantity"), rs.getString("category"), rs.getInt("seller_id"));
				items.add(item);
					 
				}
				
				
				
					if(items.size()==0) 
						
					 
					
						throw new  ItemException(message);
					
				} catch (SQLException e) {
					throw new  ItemException(e.getMessage());
				}
				
				
				 return items;
		
		
		
		
		
		
		
		
		
	}

	@Override
	public ItemBean selectItemtoBuy(String productName) throws ItemException {
		// TODO Auto-generated method stub
String message = "item not Available ...";
ItemBean item=new ItemBean(0, productName, 0, 0, message, 0);
		
		
		try (Connection con=DBUTILL.provideConnection()){
		 
		PreparedStatement ps  =	con.prepareStatement("select * from item where item_name=?");
	 
		
		
		 ps.setString(1, productName);
		 
		  
			ResultSet rs=	ps.executeQuery();
		 
	
 
		if(rs.next()) {
			item=new ItemBean(rs.getInt("item_id"), rs.getString("item_name"),rs.getInt("price"), rs.getInt("quantity"), rs.getString("category"), rs.getInt("seller_id"));
			 
		}else {
			
			
				throw new  ItemException(message);
			}
		} catch (SQLException e) {
			throw new  ItemException(e.getMessage());
		}
		
		
		 return item;
	}

}
