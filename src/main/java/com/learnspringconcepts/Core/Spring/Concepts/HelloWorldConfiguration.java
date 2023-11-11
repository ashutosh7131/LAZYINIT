package com.learnspringconcepts.Core.Spring.Concepts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ashutosh Shriansh";
    }

    @Bean
    public int age(){
        return 37;
    }
}
