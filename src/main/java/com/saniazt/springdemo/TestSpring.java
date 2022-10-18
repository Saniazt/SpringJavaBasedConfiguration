package com.saniazt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );// обращается к файлу ApplicationContext и считывает его именно resources!!!

      //  Music music = context.getBean("musicBean", Music.class);
     //   MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        boolean compare = firstMusicPlayer == secondMusicPlayer;
        System.out.println(compare);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
//        musicPlayer.playMusicList();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close(); //Обязательно в конце
    }
}
