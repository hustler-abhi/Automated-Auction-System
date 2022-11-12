package com.auction.dao;

import java.util.List;

import com.auction.exception.ItemException;
import com.auction.exception.SellerException;
import com.auction.model.ItemBean;
import com.auction.model.SellerBean;

public interface SellerDao {
	
	public String  signupSeller(SellerBean s) throws SellerException;
	public String loginSeller(String email,String pass) throws SellerException;
	public String updateItem(int productid,int price,int buyerid,int quantity)throws SellerException;
	public String insertintoProduct(ItemBean p) throws   ItemException;
	public String removefromProduct(int productid) throws ItemException ;
	
//	public List<sold>  getsoldProductdetails( );

}
