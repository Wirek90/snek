package com.codecool.snake.Model.entities.powerups;

import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import javafx.animation.KeyFrame;
import javafx.scene.layout.Pane;
import com.codecool.snake.Model.entities.GameEntity;
import com.codecool.snake.Model.entities.Interactable;

import java.util.Random;

import javafx.animation.Timeline;
import javafx.util.Duration;

public class ShieldPowerUp extends GameEntity implements Interactable {

    int HP;

    public ShieldPowerUp(Pane pane) {
        super(pane);
        setImage(Globals.shieldPowerUp);
        pane.getChildren().add(this);

        Random rnd = new Random();
        setX(rnd.nextDouble() * Globals.WINDOW_WIDTH);
        setY(rnd.nextDouble() * Globals.WINDOW_HEIGHT);
    }


    @Override
    public void apply(SnakeHead player) {
        HP = player.checkHealth();
        //   Globals.snakeHead = setImage();
        //  System.out.println(Globals.snakeHead);
        //setImage(Globals.simpleEnemy);
        timer(player);
        player.changeHealth(1000);
        destroy();

    }

    @Override
    public String getMessage() {
        return "You gain 10 second shield. Have no fear!";
    }

    public void timer(SnakeHead player){
        Timeline timeline = new Timeline(new KeyFrame(
                Duration.millis(10000),
                ae -> {
                    player.resetHealth(HP);
                 //   Globals.snakeHead = new Image("simple_enemy.png");
           //         System.out.println(HP);
                }));
        timeline.play();

    }

}
