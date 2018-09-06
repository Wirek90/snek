package com.codecool.snake.Model.entities.enemies;

import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.Utils;
import com.codecool.snake.Model.entities.Animatable;
import com.codecool.snake.Model.entities.Interactable;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import com.codecool.snake.Model.entities.GameEntity;
import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;

import java.util.Random;

public class SimpleEnemyMongoose extends GameEntity implements Animatable, Interactable {

    private Point2D heading;
    private static final int damage = 20;

    public SimpleEnemyMongoose(Pane pane) {
        super(pane);

        setImage(Globals.mongooseEnemy);
        pane.getChildren().add(this);
        int speed = 3;
        Random rnd = new Random();
        setX(rnd.nextDouble() * Globals.WINDOW_WIDTH);
        setY(rnd.nextDouble() * Globals.WINDOW_HEIGHT);

        double direction = rnd.nextDouble() * 360;
        setRotate(direction);
        heading = Utils.directionToVector(direction, speed);
    }

    @Override
    public void step() {
        if (isOutOfBounds()) {
            destroy();
        }
        setY(getY() + heading.getY());
    }

    @Override
    public void apply(SnakeHead player) {
        player.changeHealth(-damage);
        destroy();
    }

    @Override
    public String getMessage() {
        return "20 damage";
    }
}
