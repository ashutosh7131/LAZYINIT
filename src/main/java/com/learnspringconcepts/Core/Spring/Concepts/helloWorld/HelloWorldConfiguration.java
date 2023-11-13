package com.learnspringconcepts.Core.Spring.Concepts.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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

    @Bean
    public Person person3Parameters(String name,int age,Address Ashutosh_Address1){
        return new Person(name,age,Ashutosh_Address1);
    }

    @Bean
    public Person person4Qualifiers(String name,int age, @Qualifier("addressQualifier") Address Ashutosh_Address2){
        return new Person(name,age,Ashutosh_Address2);
    }

    @Bean(name="Ashutosh_Address")
    @Primary
    public Address address(){
        return new Address("Bokaro Steel City","Jharkhand");
    }

    @Bean(name="Ashutosh_Address1")
    public Address address1(){
        return new Address("Dhanbad","Jharkhand");
    }

    @Bean(name="Ashutosh_Address2")
    @Qualifier("addressQualifier")
    public Address address2(){
        return new Address("Ghaziabad","UP");
    }


}
