package com.codecool.snake.Model.entities.powerups;

import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.scene.layout.Pane;
import com.codecool.snake.Model.entities.GameEntity;
import com.codecool.snake.Model.entities.Interactable;

import java.util.Random;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class MedkitPowerUp extends GameEntity implements Interactable{

    private static final int health = 20;
    private static final int maxHealth = 100;
    private static final int timeToDelete = 3;

    public MedkitPowerUp(Pane pane) {
        super(pane);
        setImage(Globals.medkitPowerUp);
        pane.getChildren().add(this);

        Random rnd = new Random();
        setX(rnd.nextDouble() * Globals.WINDOW_WIDTH);
        setY(rnd.nextDouble() * Globals.WINDOW_HEIGHT);

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(timeToDelete), e -> destroy()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    @Override
    public void apply(SnakeHead player) {
        if (player.checkHealth() >= maxHealth){
            System.out.println("Player have " + player.checkHealth() + " health");
            destroy();
        } else {
            player.changeHealth(+health);
            System.out.println("Player have " + player.checkHealth() + " health");
            destroy();
        }
    }

    @Override
    public String getMessage() {
        return "10 health added";
    }
}

