package com.codecool.snake.Model.entities.powerups;

import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import javafx.scene.layout.Pane;
import com.codecool.snake.View.GameEntity;
import com.codecool.snake.Model.entities.Interactable;

import java.util.Random;

public class MedkitPowerUp extends GameEntity implements Interactable{

    private static final int health = 10;
    private static final int maxHealth = 100;

    public MedkitPowerUp(Pane pane) {
        super(pane);
        setImage(Globals.medkitPowerUp);
        pane.getChildren().add(this);

        Random rnd = new Random();
        setX(rnd.nextDouble() * Globals.WINDOW_WIDTH);
        setY(rnd.nextDouble() * Globals.WINDOW_HEIGHT);
    }

    @Override
    public void apply(SnakeHead player) {
        if (player.checkHealth().equals(maxHealth)){
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
