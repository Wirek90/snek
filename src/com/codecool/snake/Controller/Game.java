package com.codecool.snake.Controller;

import com.codecool.snake.Model.entities.lasers.SimpleLaser;
import com.codecool.snake.Model.entities.powerups.MedkitPowerUp;
import com.codecool.snake.Model.entities.powerups.ShieldPowerUp;
import com.codecool.snake.View.GameLoop;
import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.enemies.SimpleEnemy;
import com.codecool.snake.Model.entities.powerups.SimplePowerup;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Game extends Pane {
    SnakeHead snek;

    public Game() {

        snek = new SnakeHead(this, 500, 500);

        new SimpleEnemy(this);
        new SimpleEnemy(this);
        new SimpleEnemy(this);
        new SimpleEnemy(this);

        new SimplePowerup(this);
        new SimplePowerup(this);
        new SimplePowerup(this);
        new SimplePowerup(this);

        new MedkitPowerUp(this);
        new MedkitPowerUp(this);
        new MedkitPowerUp(this);
        new MedkitPowerUp(this);

        new ShieldPowerUp(this);




//        for(int i=0; i<1000000; i++) {
//
//            m.add(generator.nextInt(100001));
//            if (m.get(i).equals(100000)) {
//                new MedkitPowerUp(this);
//            }
//            System.out.println(m.get(i));
//
//        }


//
//
    Random generator = new Random();
    Timer myTimer = new Timer();
    TimerTask task = new TimerTask() {

        int secondPassed = 0;

        @Override
        public void run() {


            int randomNumber;
            secondPassed++;
            randomNumber = generator.nextInt(11);
          //   System.out.println(randomNumber);
          //  Globals.addGameObject(new MedkitPowerUp(Globals.gamePane));
             if (randomNumber == 10){
                 new MedkitPowerUp(Globals.gamePane);
             }

        }};
        myTimer.scheduleAtFixedRate(task, 1000, 1000);




    }

    public void start() {
        Globals.gamePane = this;
        Globals.snake = snek;
        Scene scene = getScene();
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case LEFT:  Globals.leftKeyDown  = true; break;
                case RIGHT: Globals.rightKeyDown  = true; break;
                case SPACE: Globals.addGameObject(new SimpleLaser(Globals.gamePane, Globals.snake)); break;

            }
        });

        scene.setOnKeyReleased(event -> {
            switch (event.getCode()) {
                case LEFT:  Globals.leftKeyDown  = false; break;
                case RIGHT: Globals.rightKeyDown  = false; break;
                case SPACE: Globals.spaceDown  = false; break;
            }
        });
        Globals.gameLoop = new GameLoop();
        Globals.gameLoop.start();
    }
}
