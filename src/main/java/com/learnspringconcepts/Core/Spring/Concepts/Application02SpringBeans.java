package com.learnspringconcepts.Core.Spring.Concepts;

import com.learnspringconcepts.Core.Spring.Concepts.game.GameRunner;
import com.learnspringconcepts.Core.Spring.Concepts.game.GamingConsole;
import com.learnspringconcepts.Core.Spring.Concepts.game.PacManGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class GamingConfig {

	@Bean
	public GamingConsole game(){
		return new PacManGame();
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game){
		return new GameRunner(game);
	}
}

@SpringBootApplication
public class Application02SpringBeans {

	public static void main(String[] args) {


		try (var context = new AnnotationConfigApplicationContext(GamingConfig.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}
}
