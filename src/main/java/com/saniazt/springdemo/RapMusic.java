package com.saniazt.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "My name is Slim Shady";
    }
}
