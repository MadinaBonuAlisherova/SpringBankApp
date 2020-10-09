package com.madinabonu.springdemo;

public class BlockUser implements Account {
    @Override
    public String getInformation(){
        return "your account is blocked!";
    }
}
