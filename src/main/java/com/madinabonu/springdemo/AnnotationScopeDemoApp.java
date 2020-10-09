package com.madinabonu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoApp {
    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Account account = context.getBean("admin",Account.class);
        Account theAccount = context.getBean("admin",Account.class);

        //display results
        boolean result = (account == theAccount);
        System.out.println("Pointing to the same object "+result);

        System.out.println("Memory location for Account object is "+account);
        System.out.println("Memory location for AnotherAccount object is "+theAccount);

        //close context
        context.close();
    }
}
