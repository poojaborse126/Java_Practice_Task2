/*Scenario: An online store allows product prices to be updated but rejects 
invalid prices. */

package com.test;

public class Product {
	private int productId;
	private String name;
	private double price;

	Product(int productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		setPrice(price);
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Price must be positive");
		}
	}

	public double getPrice() {
		return price;

	}

	void display() {
		System.out.println(productId + " " + name + " " + price);
	}

	public static void main(String[] args) {
		Product p = new Product(101, "Keyboard", 1200);
		p.setPrice(1500);
		p.display();
	}
}
