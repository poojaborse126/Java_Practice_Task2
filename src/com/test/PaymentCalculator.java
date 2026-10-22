//Scenario: An online store calculates payment totals using different inputs. 

package com.test;

public class PaymentCalculator {
	double calculatePayment(double amount) {
		return amount;
	}

	double calculatePayment(double amount, double discount) {
		return amount - discount;

	}

	double calculatePayment(double amount, double discount, double delivery) {
		return amount - discount + delivery;
	}

	public static void main(String[] args) {
		PaymentCalculator p = new PaymentCalculator();

		System.out.println(p.calculatePayment(1000));
		System.out.println(p.calculatePayment(1000, 100));
		System.out.println(p.calculatePayment(1000, 100, 50));
	}
}
