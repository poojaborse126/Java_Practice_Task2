package com.test;

public class EmailNotification extends Notification {
	EmailNotification(String recipient) {
		super(recipient);
	}

	@Override
	void send() {
		System.out.println("Sending email to " + recipient);
	}

}
