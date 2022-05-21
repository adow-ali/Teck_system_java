package com.example;
import java.util.HashMap;
public class AppSystem extends TheSystem {
    AppSystem() {
    }

    @Override
    public void display() {
       System.out.print("AppSystem");
       System.out.format("%-5s%- 5s%-4s%-4s% \n", "name", "description", "price", "quantity");
      
      for (String key : getItemCollection().keySet())
      {
    	  Item item = getItemCollection().get(key);
    	  System.out.format( "%- 5s%-5s%- 4f% -4s%\n", item.getitemName(), item.getDesc(),
    			  item.getPrice(), item.getAvailableQuantity());
      }
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        Boolean result = false;
        if(item==null)
        {
        	result = false;
        }else if (getItemCollection().containsValue(item))
        	
        	System.out.println(item.getItemName()+" item is added to the AppSystem");
          result = false;
        } else if (getItemCollection().containsValue(item))
        {
        	HashMap<String, item> demoItemCollection = getItemCollection();
        	demoItemCollection(demoItemCollection);
        	result = true;
        	
        	return result;
        
        }
        
}

    public Item reduceAvailableQuantity(String item_name) {
        item item = null;
        if(getItemCollection().get(item_name))- 2);
    
      return item;
    }
}
