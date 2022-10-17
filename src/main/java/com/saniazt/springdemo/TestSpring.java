package com.saniazt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );// обращается к файлу ApplicationContext и считывает его именно resources!!!

      //  Music music = context.getBean("musicBean", Music.class);
     //   MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusicList();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close(); //Обязательно в конце
    }
}
