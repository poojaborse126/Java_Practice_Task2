package com.test;

public class SavingsAcc  extends Acc { 
    SavingsAcc(String accountNumber, double balance) { 
        super(accountNumber, balance); 
    } 
 
    @Override 
    double calculateCharges() { 
        return 0; 
    } 
 
    double calculateInterest() { 
        return balance * 0.04; 
    } 

}
