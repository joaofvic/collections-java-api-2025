package list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(String name, double price, int quantity) {
		items.add(new Item(name, price, quantity));
	}
	
	public void removeItem(String name) {
		List<Item> itemsToRemove = new ArrayList<>();
		for (Item i : items) {
			if (i.getName().equalsIgnoreCase(name)) {
				itemsToRemove.add(i);
			}
		}
		items.removeAll(itemsToRemove);
	}
	
	public double calculateTotalValue() {
		double total = 0.0;
		
		for (Item i : items) {
			total += i.getQuantity() * i.getPrice();
		}
		
		return total;
	}
	
	public void showItems() {
		System.out.println(items);
	}
	
}
