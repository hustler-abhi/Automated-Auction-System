package com.auction.dao;

import com.auction.exception.SellerException;
import com.auction.model.ItemBean;
import com.auction.model.SellerBean;

public interface SellerDao {
	
	public String  signupSeller(SellerBean s) throws SellerException;
	public String loginSeller(String email,String pass) throws SellerException;
	public String updateItem(int productid,int price,int buyerid,int quantity)throws SellerException;
	public String insertintoProduct(ItemBean p);
	public String removefromProduct(int productid);
	//public List<sold>  getsoldProductdetails( );

}
