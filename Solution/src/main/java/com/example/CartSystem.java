package com.example;

public class CartSystem extends TheSystem {
    CartSystem() {
    }

    @Override
    public void display() {
       System.out.println("cart");
       
      System.out.format("%- 5s%- 5s% -4s% -4s\n" ,"Name", "Description", "Price", "Quantity");
      
      double pre_tx = 0;
      
      for (String key : getItemCollection().KeySet())
      {
    	  Item item = getItemCollection().get(key);
    	  System.out.format("%-5s%-5s%- 4s%-4s% -4.1f\n", item.getItemNameDesc(), 
    			  item.getItemPrice(), item.getAvailableQuantity();
    	  
    	  
    	  System.out.format("%- 5s- %-5s \n" "pre-tx total: " pre_tx);
    	  
      
    }
    }
    
}
