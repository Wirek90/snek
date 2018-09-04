package com.codecool.snake.Model.entities.powerups;

import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.Utils;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import javafx.scene.layout.Pane;
import com.codecool.snake.View.GameEntity;
import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.Animatable;
import com.codecool.snake.Model.Utils;
import com.codecool.snake.Model.entities.Interactable;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;


import java.util.Random;

public class PowerUp {

    private static final int damage = 10;



//    public SimpleEnemy(Pane pane) {
//        super(pane);
//
//        setImage(Globals.simpleEnemy);
//        pane.getChildren().add(this);
//        int speed = 1;
//        Random rnd = new Random();
//        setX(rnd.nextDouble() * Globals.WINDOW_WIDTH);
//        setY(rnd.nextDouble() * Globals.WINDOW_HEIGHT);
//
//        double direction = rnd.nextDouble() * 360;
//        setRotate(direction);
//        heading = Utils.directionToVector(direction, speed);
//    }
//
//    @Override
//    public void apply(SnakeHead player) {
//        player.changeHealth(-damage);
//        destroy();
//    }
}
