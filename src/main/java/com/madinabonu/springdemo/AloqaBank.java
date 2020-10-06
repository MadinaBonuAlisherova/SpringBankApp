package com.madinabonu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//explicit bean ID
//@Component("bankname")
//Implicit bean ID
@Component
public class AloqaBank implements Bank {

    //***********  field dependency injection using autowired **********
    @Autowired
    @Qualifier("user")
    private Account account;
    private double balance;

    public AloqaBank(){

        System.out.println(" we are inside default constructor");
    }

    //initializing the method after constructor
    @PostConstruct
    public void serviceStarted(){
        System.out.println("Initialing method is called");
    }
    //destroying bean before execution stops
    @PreDestroy
    public void serviceClosed(){
        System.out.println("Destroying method is called");
    }

    //***********  constructor dependency injection using autowired **********
//    @Autowired
//    public AloqaBank(User user) {
//        this.balance = 0;
//        this.user = user;
//    }

    //***********   setter dependency injection using autowired    ***********
//    @Autowired
//    public void setUser(User user) {
//        System.out.println("Setter injection in Aloqa Bank");
//        this.user = user;
//    }

    @Override
    public void deposit(double amount) {
       this.balance = this.balance + amount;
        System.out.println("Deposit() function with "+this.balance+" balance is called in AloqaBank");
    }

    @Override
    public void withdrawal(double amount) {
        this.balance = this.balance - amount;
        System.out.println("Withdrawal() function with "+this.balance+" balance is called in AloqaBank");
    }

    @Override
    public String getEachAccountInfo() {
        return account.getInformation()+ " with balance "+this.balance;
    }

    public double getBalance() {
        System.out.println("Your balance is "+this.balance);
        return balance;
    }


}

