package com.learnspringconcepts.Core.Spring.Concepts;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBuisnessClass{}
@Component
class Dependency1{}
@Component
class Dependency2{}

@Configuration
@ComponentScan
public class DependencyInjection01 {

	public static void main(String[] args) {


		try (var context = new AnnotationConfigApplicationContext(DependencyInjection01.class)) {

			Arrays.stream(context.getBeanDefinitionNames())
					.forEach(System.out::println);

		}

	}
}
