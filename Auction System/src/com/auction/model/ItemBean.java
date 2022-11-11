package com.auction.model;

public class ItemBean {
	public ItemBean(int item_id, String item_name, int price, int quantity, String category, int seller_id) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.seller_id = seller_id;
	}
	private int item_id;
	private String item_name;
	private int price;
	private int quantity;
	private String category;
	private int seller_id;
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	@Override
	public String toString() {
		return "ItemBean [item_id=" + item_id + ", item_name=" + item_name + ", price=" + price + ", quantity="
				+ quantity + ", category=" + category + ", seller_id=" + seller_id + "]";
	}
	
	
	

}
