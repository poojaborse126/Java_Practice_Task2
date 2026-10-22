package com.test;

public class CurrentAcc extends Acc {
	CurrentAcc(String accountNumber, double balance) { 
        super(accountNumber, balance); 
    }

	@Override
	double calculateCharges() {

		return 200;
	}

}
