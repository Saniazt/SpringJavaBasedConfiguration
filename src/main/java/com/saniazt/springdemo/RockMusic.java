package com.saniazt.springdemo;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class RockMusic implements Music{
    List<String> listOfRockSongs = List.of("Rock1","Rock2","Rock3");

    @Override
    public String getSong() {
        return listOfRockSongs.toString();
    }
}
