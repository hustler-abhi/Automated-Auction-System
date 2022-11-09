package com.auction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.auction.exception.SellerException;
import com.auction.model.ItemBean;
import com.auction.model.SellerBean;

import Utility.DBUTILL;

public class SellerDaoimpl implements SellerDao{

	@Override
	public String signupSeller(SellerBean s)throws SellerException {
		String message = "Seller not registered...";
		
		
		try (Connection con=DBUTILL.provideConnection()){
		PreparedStatement ps=	con.prepareStatement("insert into Registered_Seller(seller_name,email,password) values(?,?,?)");
			ps.setString(1, s.getSname());
			ps.setString(2, s.getEmail());
			ps.setString(3, s.getPassword());
			int ans=ps.executeUpdate();
			
			if(ans>0) {
				message=s.getSname()+" Signed up Succesfully ";
			}else {
				throw new SellerException(message);
			}
		} catch (SQLException e) {
			throw new SellerException(e.getMessage());
		}
		
		
		return message;
		
	}

	@Override
	public String loginSeller(String email, String pass)throws SellerException {
		String message = "Seller not found...";
		
		
		try (Connection con=DBUTILL.provideConnection()){
		PreparedStatement ps=	con.prepareStatement("select * from registered_seller where email = ? and password =?");
		
			
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs  =ps.executeQuery();
			
			if(rs.next()) {
				message=rs.getString("seller_name")+"  log in Succesfully ";
			}else {
				throw new SellerException(message);
			}
		} catch (SQLException e) {
			throw new SellerException(e.getMessage());
		}
		
		
		return message;
		
		
	}

	@Override
	public String updateItem(int productid, int price, int sellerid, int quantity) throws SellerException{
		// TODO Auto-generated method stub
	String message = "Item not updated...";
		
		
		try (Connection con=DBUTILL.provideConnection()){
		PreparedStatement ps=	con.prepareStatement("update  item set price=?, quantity=? where item_id=? and seller_id=?");
		
			ps.setInt(1,price);
			ps.setInt(2,quantity);
			ps.setInt(3,productid);
			ps.setInt(4,sellerid);
		 int i=ps.executeUpdate();
			
			if(i>0) {
				message= " Item Updated  Succesfully... ";
			}else {
				throw new SellerException(message);
			}
		} catch (SQLException e) {
			throw new SellerException(e.getMessage());
		}
		
		
		return message;
	}

	@Override
	public String insertintoProduct(ItemBean p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removefromProduct(int productid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
