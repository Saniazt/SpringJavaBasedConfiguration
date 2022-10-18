package com.saniazt.springdemo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    List<String> listOfClassicalSongs = List.of("Classical1","Classical2","Classical3");
    @Override
    public String getSong() {
        return listOfClassicalSongs.toString();
    }
}
