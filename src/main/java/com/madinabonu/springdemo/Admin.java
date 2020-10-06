package com.madinabonu.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Admin implements Account{

    @Override
    public String getInformation(){
        return null;
    }
}
