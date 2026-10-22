/*  Warehouse Inventory Protection 
Scenario: A warehouse must prevent stock quantities from becoming 
negative. */

package com.test;

public class InventoryItem {
	private int itemCode;
	private String itemName;
	private int quantity;

	InventoryItem(int itemCode, String itemName, int quantity) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = Math.max(quantity, 0);
	}

	public void addStock(int amount) {
		if (amount > 0) {
			quantity += amount;
		} else {
			System.out.println("Invalid stock amount");
		}
	}

	public void removeStock(int amount) {
		if (amount <= 0) {
			System.out.println("Invalid removal amount");
		} else if (amount > quantity) {
			System.out.println("Insufficient stock");
		} else {
			quantity -= amount;
		}
	}

	public int getQuantity() {
		return quantity;
	}

	public static void main(String[] args) {
		InventoryItem item = new InventoryItem(1, "Mouse", 20);

		item.addStock(10);
		item.removeStock(5);
		item.removeStock(50);

		System.out.println("Available stock: " + item.getQuantity());
	}
}
