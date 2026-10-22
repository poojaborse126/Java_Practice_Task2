package com.test;

public class Car extends Vehicle {
	int seats;

	Car(String brand, double rent, int seats) {
		super(brand, rent);
		this.seats = seats;
	}

	void display() {
		System.out.println(brand + " " + rent + " " + seats);
	}

	public static void main(String[] args) { 
        Car c = new Car("Toyota", 2500, 5); 
        c.display(); 
    }
}