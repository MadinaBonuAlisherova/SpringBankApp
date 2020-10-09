package com.madinabonu.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AmericanBankJavaConfigDemoApp {
    public static void main(String[] args) {

       //read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BankConfig.class);

        //retrieve bean from spring container
        AmericanBank theBank = (AmericanBank) context.getBean("americanBank");

        //call methods on the bean
        theBank.deposit(500);
        theBank.withdrawal(300);

        System.out.println(theBank.getEachAccountInfo());

        //call our new american bank methods .... that has properties values injected
        System.out.println("Blocked User email is "+theBank.getEmail());
        System.out.println("Blocked User's Name is "+theBank.getName());

        //close context
        context.close();
    }
}
