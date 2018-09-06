package com.codecool.snake.Model;

import com.codecool.snake.Model.entities.powerups.MedkitPowerUp;
import com.codecool.snake.Model.entities.powerups.ShieldPowerUp;
import com.codecool.snake.Model.entities.enemies.SimpleEnemyEagle;
import com.codecool.snake.Model.entities.enemies.SimpleEnemyMongoose;
import com.codecool.snake.Model.entities.enemies.SimpleEnemy;
import com.codecool.snake.Model.entities.powerups.SimplePowerup;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class Respawn extends Pane {
    int respawnOfMedkit = 5;


    public void respawnMedkit() {

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(respawnOfMedkit), ev -> {
                if (Globals.isPaused == false) {
                    new MedkitPowerUp(Globals.gamePane);
                }
            }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();


    }

    public void respawnShield() {

            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(10), ev -> {
                if (Globals.isPaused == false) {
                    new ShieldPowerUp(Globals.gamePane);
                }
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }

    public void respawnBerry() {
        if (Globals.isPaused == false) {
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), ev -> {
                if (Globals.isPaused == false) {
                    new SimplePowerup(Globals.gamePane);
                }
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }
    }

    public void respawnEnemy() {

          Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), ev -> {
                if (Globals.isPaused == false) {
                    new SimpleEnemy(Globals.gamePane);
                }
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }


    public void respawnEagle() {
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
                if (Globals.isPaused == false) {
                    new SimpleEnemyEagle(Globals.gamePane);
                }
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }


    public void respawnMongoose() {
            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
                if (Globals.isPaused == false) {
                    new SimpleEnemyMongoose(Globals.gamePane);
                }
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
        }




}
