package com.test;

public class PushNotification extends Notification {
	PushNotification(String recipient) {
		super(recipient);
	}

	@Override
	void send() {
		System.out.println("Sending push notification to " + recipient);
	}

}
