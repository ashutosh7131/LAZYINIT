package com.learnspringconcepts.Core.Spring.Concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@ComponentScan
@Configuration
public class LazyBeanIntializationSpringContextApplicationLauncher {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(LazyBeanIntializationSpringContextApplicationLauncher.class)) {

            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


        }





    }
}

@Component
//@Lazy
class A{}

@Component
@Lazy(value = true)
class B{

    private A a;

    @Autowired
    public B(A a) {
      System.out.println("Some Init Logic");
        this.a = a;
    }
}


