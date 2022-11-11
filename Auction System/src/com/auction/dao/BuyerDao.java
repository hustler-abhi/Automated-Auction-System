package com.auction.dao;

import java.util.List;

import com.auction.exception.BuyerException;
import com.auction.exception.ItemException;
import com.auction.model.BuyerBean;
import com.auction.model.ItemBean;

public interface BuyerDao {

public String insertintoBuyer(BuyerBean b) throws BuyerException;
public String loginBuyer(String email,String pass)throws BuyerException ;
public List <ItemBean>  getProductDetailsByCategory(String category)throws ItemException  ;

public ItemBean selectItemtoBuy(String productName)throws ItemException ;

//public List<BuyerWithCategory> getdetailsOfBuyerWithCategory;


}
