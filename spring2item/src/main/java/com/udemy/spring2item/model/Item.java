package com.udemy.spring2item.model;

public class Item {
	private String itemId;
	private String itemNm;
	private String itemCategory;
	
	public Item() {
		
	}
	
	public Item(String itemId, String itemNm, String itemCategory) {
		this.itemId = itemId;
		this.itemNm = itemNm;
		this.itemCategory = itemCategory;
	}


	public String getItemId() {
		return itemId;
	}
	
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemNm() {
		return itemNm;
	}
	public void setItemNm(String itemNm) {
		this.itemNm = itemNm;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	
	

}
