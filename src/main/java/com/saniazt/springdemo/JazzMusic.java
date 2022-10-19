package com.saniazt.springdemo;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Some jazz song";
    }
}
