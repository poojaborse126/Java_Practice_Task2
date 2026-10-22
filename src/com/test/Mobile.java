package com.test;

public class Mobile {
	String brand;
	String model;
	double price;

	Mobile(String brand) {
		this.brand = brand;
		this.model = "Unknown";
		this.price = 0;
	}

	Mobile(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.price = 0;
	}

	Mobile(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	void display() {
		System.out.println(brand + " " + model + " " + price);
	}

	public static void main(String[] args) {
		new Mobile("Samsung").display();
		new Mobile("Apple", "iPhone").display();
		new Mobile("OnePlus", "12R", 42000).display();
	}
}
