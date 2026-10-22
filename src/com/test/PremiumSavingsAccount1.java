package com.test;

public class PremiumSavingsAccount1 extends SavingsAccount1 { 
    String benefit; 
 
    PremiumSavingsAccount1(String accountNumber, double balance) { 
        super(accountNumber, balance, 6); 
        this.benefit = "Priority Banking"; 
    } 
 
    void display() { 
        System.out.println("Account: " + accountNumber); 
        System.out.println("Interest: " + interest()); 
 
 
        System.out.println("Benefit: " + benefit); 
    } 
 
    public static void main(String[] args) { 
        PremiumSavingsAccount1 p = 
                new PremiumSavingsAccount1("P101", 100000); 
        p.display(); 
    } 

}
