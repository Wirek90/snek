package com.codecool.snake.Controller;

import com.codecool.snake.Model.entities.GameEntity;
import com.codecool.snake.Model.entities.Interactable;
import com.codecool.snake.Model.entities.lasers.SimpleLaser;
import com.codecool.snake.Model.entities.powerups.MedkitPowerUp;
import com.codecool.snake.Model.entities.powerups.ShieldPowerUp;
import com.codecool.snake.Model.entities.enemies.SimpleEnemyEagle;
import com.codecool.snake.Model.entities.enemies.SimpleEnemyMongoose;
import com.codecool.snake.View.GameLoop;
import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.enemies.SimpleEnemy;
import com.codecool.snake.Model.entities.powerups.SimplePowerup;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class Respawn extends Pane {
    int respawnOfMedkit = 5;


    public void respawnMedkit() {
        if (Globals.isPaused == false) {
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(respawnOfMedkit), ev -> {
                new MedkitPowerUp(Globals.gamePane);
            }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        }

    }

    public void respawnShield() {
        if (Globals.isPaused == false) {
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(10), ev -> {
                new ShieldPowerUp(Globals.gamePane);
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }
    }

    public void respawnBerry() {
        if (Globals.isPaused == false) {
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), ev -> {
                new SimplePowerup(Globals.gamePane);
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }
    }

    public void respawnEnemy() {
        if (Globals.isPaused == false) {
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), ev -> {
                new SimpleEnemy(Globals.gamePane);
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }
    }

    public void respawnEagle() {
        if (Globals.isPaused == false) {
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
                new SimpleEnemyEagle(Globals.gamePane);
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }
    }

    public void respawnMongoose() {
        if (!Globals.isPaused) {
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
                new SimpleEnemyMongoose(Globals.gamePane);
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }
    }



}
