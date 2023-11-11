package com.learnspringconcepts.Core.Spring.Concepts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name,int age){}
record Address(String firstLine,String city){}

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

    @Bean
    public Person person(){
        return new Person("Ashu",38);
    }

    @Bean
    public Address address(){
        return new Address("Bokaro Steel City","Jharkhand");
    }


}
