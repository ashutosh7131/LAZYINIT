package com.learnspringconcepts.Core.Spring.Concepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@ComponentScan
@Configuration
public class RealWorldSpringContextApplicationLauncher {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextApplicationLauncher.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BuisnessCalculationService.class).findMax());
        }





    }
}
