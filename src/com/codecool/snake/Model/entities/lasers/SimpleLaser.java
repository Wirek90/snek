package com.codecool.snake.Model.entities.lasers;

import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.Utils;
import com.codecool.snake.Model.entities.Animatable;
import com.codecool.snake.Model.entities.GameEntity;
import com.codecool.snake.Model.entities.Interactable;
import com.codecool.snake.Model.entities.enemies.SimpleEnemy;
import com.codecool.snake.Model.entities.powerups.MedkitPowerUp;
import com.codecool.snake.Model.entities.powerups.SimplePowerup;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class SimpleLaser extends GameEntity implements Animatable, Interactable {

    private Point2D heading;
    private float speed = SnakeHead.getSpeed() + 1;

    public SimpleLaser(Pane pane, SnakeHead snake) {
        super(pane);
        pane.getChildren().add(this);
        setImage(new Image("simplelaser.png")); //blue laser
        setX(snake.getX() + ((snake.getX() > 500)?  1 : - 1));
        setY(snake.getY() + ((snake.getY() > 350)?  1 : - 1));
        double dir = snake.getRotate();
        setRotate(dir);
        heading = Utils.directionToVector(dir, speed);
    }

    public void step() {
        if (isOutOfBounds()) {
            destroy();
        }
        setX(getX() + heading.getX());
        setY(getY() + heading.getY());

        for (GameEntity entity : Globals.getGameObjects()) {
            if (getBoundsInParent().intersects(entity.getBoundsInParent())) {
                if (entity instanceof SimpleEnemy || entity instanceof SimplePowerup) {
                    destroy();
                    entity.destroy();

                }
            }
        }
    }

    public void apply(SnakeHead snakeHead) {}

    public String getMessage() { return "brap brap pew pew"; }
}