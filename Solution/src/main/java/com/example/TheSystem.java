package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
	private HashMap<String, Item> itemCollection;

	TheSystem() throws FileNotFoundException {
		itemCollection = new HashMap<String, Item>();
		if (getClass().getSimpleName().equals("AppSystem")) {

			Scanner scanner = new Scanner(new FileReader("resources/sample.txt"));
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] itemInfo = line.split("\\s ");
				Item item = new Item(itemInfo[0], itemInfo[1], Double.parseDouble(itemInfo[2]),
						Integer.parseInt(itemInfo[3]));
				itemCollection.put(item.getItemName(), item);
			}
		}
	}

	public void setItemCollection(HashMap<String, Item> itemCollection) {
		this.itemCollection = itemCollection;
	}

	public HashMap<String, Item> getItemCollection() {
		return this.itemCollection;
	}

	public Boolean checkAvailability(Item item) {
		if (item.getQuantity() >= item.getAvailableQuantity()) {
			System.out.println("System is unable to add " + item.getItemName() + " to the card. System only has "
					+ item.getAvailableQuantity() + " " + item.getItemName() + "s");
			return false;
		} else {
			return true;
		}
	}

	public Boolean add(Item item) {
		if (item == null) {
			return false;
		} else if (this.itemCollection.containsKey(item.getItemName())) {
			int quantity = item.getQuantity() + 1;
			item.setQuantity(quantity);
			this.itemCollection.put(item.getItemName(), item);
			return true;
		} else if (!this.itemCollection.containsKey(item.getItemName())) {
			item.setQuantity(1);
			this.itemCollection.put(item.getItemName(), item);
			return true;
		}
		return false;
	}

	public Item remove(String itemName) {
		if (this.itemCollection.containsKey(itemName)) {
			return this.itemCollection.remove(itemName);
		}
		return null;
	}

	public abstract void display();
}