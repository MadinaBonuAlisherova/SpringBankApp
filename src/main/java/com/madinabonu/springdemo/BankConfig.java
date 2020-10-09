package com.madinabonu.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.madinabonu.springdemo")
@PropertySource("classpath:american.properties")
public class BankConfig {

    //define bean for Block user
    @Bean          //bean id === method name
    public Account blockUser(){
        return  new BlockUser();
    }

    //define bean for American Bank and inject dependencies
    @Bean
    public Bank americanBank(){
        return new AmericanBank(blockUser());
    }
}
