package com.saniazt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");// обращается к файлу ApplicationContext и считывает его именно resources!!!

    TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
