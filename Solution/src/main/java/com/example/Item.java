package com.example;

public class Item{
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
    private int availableQuantity;
     
    public Item() {
    
    }
    
    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
       this.itemName = itemName;
       this.itemDesc= itemDesc;
       this. itemPrice = itemPrice;
       this.availableQuantity =availableQuantity;
       
    }
    public String getitemName() {
    	return itemName;
    	
    }
    public String getDesc() {
    	return itemDesc;
    }
    public Double getPrice() {
    	return itemPrice;
    }
    public int getAvailableQuantity() {
    	return availableQuantity();
    }
    
}
