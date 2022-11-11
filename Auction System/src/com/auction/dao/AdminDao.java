package com.auction.dao;

import java.util.List;

import com.auction.exception.AdminException;
import com.auction.exception.BuyerException;
import com.auction.exception.SellerException;
import com.auction.model.AdminBean;
import com.auction.model.BuyerBean;
import com.auction.model.SellerBean;

public interface AdminDao {
	
	public String insertintoAdmin(AdminBean a) throws AdminException ;

	public String loginAdmin(String email,String pass)throws AdminException ;

	public List<BuyerBean> getbuyerlist()throws  BuyerException;

	public List<SellerBean> getsellerlist() throws SellerException;
	

}
