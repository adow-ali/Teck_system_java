package com.example;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class AppSystem extends TheSystem {

	AppSystem() throws FileNotFoundException {
		super();
	}

	@Override
	public void display() {
		System.out.println("AppSystem Inventory:");
		System.out.printf("%-20s %-20s %-10s %-10s%n", "Name", "Description", "Price", "Available Quantity");
		getItemCollection().forEach((k, v) -> {
			System.out.format("%-20s %-20s %-10.2f %-10d%n", v.getItemName(), v.getItemDesc(), v.getItemPrice(),
					v.getAvailableQuantity());
		});
	}

	@Override
	public Boolean add(Item item) {
		if (item == null) {
			return false;
		} else if (getItemCollection().containsKey(item.getItemName())) {
			System.out.println(item.getItemName() + " is already in the App System");
			return false;
		} else if (!getItemCollection().containsKey(item.getItemName())) {
			item.setQuantity(1);
			getItemCollection().put(item.getItemName(), item);
			return true;
		}
		return false;
	}

	public Item reduceAvailableQuantity(String item_name) {
		if (getItemCollection().containsKey(item_name)) {
			Item item = getItemCollection().get(item_name);
			int q = item.getAvailableQuantity() - 1;
			item.setAvailableQuantity(q);

			if (item.getAvailableQuantity() == 0) {
				remove(item_name);
			}

			return item;
		} else if (!getItemCollection().containsKey(item_name)) {
			return null;
		}
		return null;
	}

}
