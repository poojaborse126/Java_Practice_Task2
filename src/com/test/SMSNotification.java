package com.test;

public class SMSNotification extends Notification {
	SMSNotification(String recipient) {
		super(recipient);
	}

	@Override
	void send() {
		System.out.println("Sending SMS to " + recipient);
	}

}
