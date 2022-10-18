package com.saniazt.springdemo;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}; //даем понять что для создание обьектов этого класса нужно использовать фабричный метод

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
