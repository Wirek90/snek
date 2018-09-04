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
import com.codecool.snake.View.GameEntity;

import com.codecool.snake.View.GameEntity;
import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.Interactable;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import javafx.scene.layout.Pane;

import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import javafx.scene.layout.Pane;
import com.codecool.snake.View.GameEntity;
import com.codecool.snake.Model.entities.Interactable;

import java.util.Random;

import java.util.Random;

public class ShieldPowerUp extends GameEntity implements Interactable {
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
        destroy();

    }

    @Override
    public String getMessage() {
        return "You gain 10 second shield. Have no fear!";
    }
}
