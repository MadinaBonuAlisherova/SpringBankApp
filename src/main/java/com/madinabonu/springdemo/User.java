package com.madinabonu.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class User implements Account{

    private String[] usersData = {
            "1st User information is showing using random obj",
            "2nd User information is showing using random obj",
            "3rd User information is showing using random obj"
    };

    //create random number generator
    private Random random = new Random();

    @Override
    public String getInformation(){
        int index = random.nextInt(usersData.length);
        String account = usersData[index];
        return account;
    }
}
