package com.saniazt.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.saniazt.springdemo")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
