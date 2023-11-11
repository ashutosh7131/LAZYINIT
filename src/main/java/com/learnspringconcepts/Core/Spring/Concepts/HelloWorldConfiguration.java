package com.learnspringconcepts.Core.Spring.Concepts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name,int age,Address address){}
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
        return new Person("Ashu",38,new Address("Bokaro Steel City","Jharkhand"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }

    @Bean(name="Ashutosh Address")
    public Address address(){
        return new Address("Bokaro Steel City","Jharkhand");
    }


}
