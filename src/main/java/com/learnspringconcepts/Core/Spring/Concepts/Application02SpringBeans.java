package com.learnspringconcepts.Core.Spring.Concepts;

import com.learnspringconcepts.Core.Spring.Concepts.game.GameRunner;
import com.learnspringconcepts.Core.Spring.Concepts.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application02SpringBeans {

	@Bean
	public GameRunner gameRunner(GamingConsole game){
		return new GameRunner(game);
	}

	public static void main(String[] args) {


		try (var context = new AnnotationConfigApplicationContext(Application02SpringBeans.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}
}
