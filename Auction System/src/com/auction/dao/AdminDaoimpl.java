package com.auction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.auction.exception.AdminException;
import com.auction.exception.BuyerException;
import com.auction.exception.ItemException;
import com.auction.exception.SellerException;
import com.auction.model.AdminBean;
import com.auction.model.BuyerBean;
import com.auction.model.ItemBean;
import com.auction.model.SellerBean;

import Utility.DBUTILL;

public class AdminDaoimpl implements AdminDao {

	@Override
	public String insertintoAdmin(AdminBean s) throws AdminException{
String message = "Admin not registered...";
		
		
		try (Connection con=DBUTILL.provideConnection()){
		PreparedStatement ps=	con.prepareStatement("insert into Admin(admin_name,email,password) values(?,?,?)");
			ps.setString(1, s.getAdmin_Name());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getPassword());
			int ans=ps.executeUpdate();
			
			if(ans>0) {
				message=s.getAdmin_Name()+" Signed up Succesfully ";
			}else {
				throw new AdminException(message);
			}
		} catch (SQLException e) {
			throw new AdminException(message);
		}
		
		
		return message;
	}

	@Override
	public String loginAdmin(String email, String pass)throws AdminException {
	String message = "Admin not found...";
		
		
		try (Connection con=DBUTILL.provideConnection()){
		PreparedStatement ps=	con.prepareStatement("select * from Admin where email = ? and password =?");
		
			
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs  =ps.executeQuery();
			
			if(rs.next()) {
				message= "Welcome";
			}else {
				throw new AdminException(message);
			}
		} catch (SQLException e) {
			throw new AdminException(message);
		}
		
		
		return message;
	}

	@Override
	public List<BuyerBean> getbuyerlist() throws  BuyerException {
		// TODO Auto-generated method stub
		
		List<BuyerBean>buyer=new ArrayList<>();
		
 
		
	            	String message = "not buyer found ...";
 
				
				
				try (Connection con=DBUTILL.provideConnection()){
				 
				PreparedStatement ps  =	con.prepareStatement("select * from  Registered_Buyer");
				
			 
				 
				  
					ResultSet rs=	ps.executeQuery();
				 
			
		 
				while(rs.next()) {
					
					
		BuyerBean bean=new BuyerBean(rs.getInt("BID"), rs.getString("buyer_name"),  rs.getString("email"),rs.getString("password"),rs.getString("status"));
					
				buyer.add(bean);
					 
				}
				
				
				
					if(buyer.size()==0) 
						
					 
					
						throw new   BuyerException(message);
					
				} catch (SQLException e) {
					
					throw new   BuyerException(message);
					
				}
				
				
				 return buyer;
		
		
		
	 
	}

	@Override
	public List<SellerBean> getsellerlist() throws   SellerException {
		// TODO Auto-generated method stub
		
		List<SellerBean>seller=new ArrayList<>();
		 
    	String message = "not seller found ...";

	
	
	try (Connection con=DBUTILL.provideConnection()){
	 
	PreparedStatement ps  =	con.prepareStatement("select * from  Registered_seller");
	
 
	 
	  
		ResultSet rs=	ps.executeQuery();
	 


	while(rs.next()) {
		
		
		SellerBean bean=new SellerBean(rs.getInt("SID"), rs.getString("seller_name"),  rs.getString("email"),rs.getString("password"),rs.getString("status"));
		
	seller.add(bean);
		 
	}
	
	
	
		if(seller.size()==0) 
			
		 
		
			throw new   SellerException(message);
		
	} catch (SQLException e) {
		
		throw new   SellerException(message);
		
	}
	
	
	 return seller;
		
		
		 
	}

}
