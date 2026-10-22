package com.test;

public class SavingsAccount1  extends BankAccount1 { 
    double rate; 
 
    SavingsAccount1(String accountNumber, double balance) { 
        this(accountNumber, balance, 4); 
    } 
 
    SavingsAccount1(String accountNumber, double balance, double rate) { 
        super(accountNumber, balance); 
        this.rate = rate; 
    } 
 
    double interest() { 
        return balance * rate / 100; 
    } 

}
