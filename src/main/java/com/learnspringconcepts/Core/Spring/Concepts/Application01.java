package com.learnspringconcepts.Core.Spring.Concepts;

import com.learnspringconcepts.Core.Spring.Concepts.game.GameRunner;
import com.learnspringconcepts.Core.Spring.Concepts.game.PacManGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application01 {

	public static void main(String[] args) {


		//SpringApplication.run(Application.class, args);
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
