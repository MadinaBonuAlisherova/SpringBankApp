package com.madinabonu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankAnnotationDemo {
    public static void main(String[] args) {

        //read spring configure
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        AloqaBank aloqaBank = (AloqaBank) context.getBean("aloqaBank");
//        AloqaBank aloqaBank = context.getBean("bankname", Aloqabank.class);

        //call methods on the bean
        aloqaBank.deposit(500);
        aloqaBank.withdrawal(300);
        System.out.println("User balance is "+aloqaBank.getBalance());

        System.out.println(aloqaBank.getEachAccountInfo());
        //close the context
        context.close();
    }
}
