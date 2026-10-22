//Scenario: A cinema calculates the final ticket price after applying a discount.

package com.test;

public class MovieTicket {
	String movieName;
	int seatNumber;
	double price;

	MovieTicket(String movieName, int seatNumber, double price) {
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.price = price;
	}

	double finalPrice() {
		if (price > 300) {
			return price - 50;
		}
		return price;

	}

	void display() {
		System.out.println("Movie: " + movieName);
		System.out.println("Seat: " + seatNumber);
		System.out.println("Final Price: " + finalPrice());
	}

	public static void main(String[] args) {
		MovieTicket t = new MovieTicket("Jawan", 12, 350);
		t.display();
	}
}
