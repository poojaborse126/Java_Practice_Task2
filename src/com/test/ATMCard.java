//Scenario: A bank lets a customer change a four-digit ATM PIN without exposing it directly. 

package com.test;

public class ATMCard {
	private String pin;

	ATMCard(String pin) {
		if (isValidPin(pin)) {
			this.pin = pin;
		} else {
			this.pin = "0000";
		}
	}

	private boolean isValidPin(String pin) {
		return pin != null && pin.matches("\\d{4}");
	}

	public void changePin(String newPin) {

		if (isValidPin(newPin)) {
			pin = newPin;
			System.out.println("PIN changed successfully");
		} else {
			System.out.println("Invalid PIN");
		}
	}

	public boolean verifyPin(String enteredPin) {
		return pin.equals(enteredPin);
	}

	public static void main(String[] args) {
		ATMCard card = new ATMCard("1234");

		card.changePin("5678");
		System.out.println(card.verifyPin("5678"));
	}
}
