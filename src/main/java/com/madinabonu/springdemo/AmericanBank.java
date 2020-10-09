package com.madinabonu.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class AmericanBank implements Bank {

    private Account account;
    private double balance;

    //field level injection
    @Value("${foo.email}")
    private String email;

    //field level injection
    @Value("${foo.name}")
    private String name;

    public AmericanBank(Account account) {
        this.account = account;
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("Withdrawal called in American Bank with amount "+this.balance);
    }

    @Override
    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
        System.out.println("Withdrawal called in American Bank with amount "+this.balance);
    }

    @Override
    public String getEachAccountInfo() {
        return "American Bank user account is called "+account.getInformation();
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
