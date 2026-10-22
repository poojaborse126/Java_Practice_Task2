package com.test;

public class NotificationDemo {
	public static void main(String[] args) {
		Notification[] notifications = { new EmailNotification("student@example.com"),
				new SMSNotification("9876543210"), new PushNotification("User101") };

		for (Notification n : notifications) {
			n.send();
		}
	}
}
