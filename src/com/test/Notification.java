/* Notification Service 
Scenario: An application sends notifications through email, SMS, and push 
messages.  */

package com.test;

public abstract class Notification {
	protected String recipient;

	Notification(String recipient) {

		this.recipient = recipient;
	}

	abstract void send();
}

