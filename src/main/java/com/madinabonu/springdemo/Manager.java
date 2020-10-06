package com.madinabonu.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Manager  implements Account{

    @Override
    public String getInformation(){
        return null;
    }
}
