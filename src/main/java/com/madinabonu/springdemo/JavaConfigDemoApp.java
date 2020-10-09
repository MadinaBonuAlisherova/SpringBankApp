package com.madinabonu.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

       //read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BankConfig.class);

        //retrieve bean from spring container
        Bank theBank = context.getBean("aloqaBank", Bank.class);

        //call methods on the bean
        theBank.deposit(500);
        theBank.withdrawal(300);

        System.out.println(theBank.getEachAccountInfo());

        //close context
        context.close();
    }
}
