package com.codecool.snake.Controller;

import com.codecool.snake.Model.entities.Interactable;
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
import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import javafx.scene.layout.Pane;
import com.codecool.snake.Model.entities.GameEntity;
import com.codecool.snake.Model.entities.Interactable;

import java.util.Timer;
import java.util.TimerTask;

//public class RespawnPowerUps implements Interactable {
//
//    public void Resp(Pane pane) {
//        super(pane);
//    int secondPassed = 0;
//    SnakeHead snek;
//    //snek = new SnakeHead(this, 500, 500);
//    Timer myTimer = new Timer();
//    TimerTask task = new TimerTask() {
//        @Override
//        public void run() {
//
//         //     secondPassed++;
//            new MedkitPowerUp(Globals.gamePane);
//          //  System.out.println(secondPassed);
//        }
//    };}
//
//
//    public void start() {
//     //   myTimer.scheduleAtFixedRate(task, 1000, 1000);
//    }
//
//    @Override
//    public void apply(SnakeHead player) {
//
//    }
//
//    @Override
//    public String getMessage() {
//        return null;
//    }

//    public void Game() {
//        snek = new SnakeHead(this, 500, 500);
//        new SimpleEnemy(this);
//        new SimpleEnemy(this);
//        new SimpleEnemy(this);
//        new SimpleEnemy(this);
//
//        new SimplePowerup(this);
//        new SimplePowerup(this);
//        new SimplePowerup(this);
//        new SimplePowerup(this);
//
//        new MedkitPowerUp(this);
//        new MedkitPowerUp(this);
//        new MedkitPowerUp(this);
//        new MedkitPowerUp(this);
//
//        new ShieldPowerUp(this);
//
//    }

//}
