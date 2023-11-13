package com.learnspringconcepts.Core.Spring.Concepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application02HelloWorldSpring {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("Ashutosh_Address"));
        System.out.println(context.getBean("Ashutosh_Address1"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("person4Qualifiers"));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


    }

}
