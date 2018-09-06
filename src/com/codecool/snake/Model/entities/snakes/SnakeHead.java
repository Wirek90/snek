package com.codecool.snake.Model.entities.snakes;

import com.codecool.snake.Model.entities.GameEntity;
import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.Animatable;
import com.codecool.snake.Model.Utils;
import com.codecool.snake.Model.entities.Interactable;
import com.codecool.snake.View.SnekHealthMenu;
import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;

public class SnakeHead extends GameEntity implements Animatable {

    private static final float speed = 1;
    private static final float turnRate = 1;
    private GameEntity tail; // the last element. Needed to know where to add the next part.
    private int health;
    private int length;


    public SnakeHead(Pane pane, int xc, int yc) {
        super(pane);
        setX(xc);
        setY(yc);
        Globals.gameOver = false;
        length = 0;
        tail = this;
        setImage(Globals.snakeHead);
        pane.getChildren().add(this);

        addPart(4);
    }



    public void step() {
        double dir = getRotate();
        if (Globals.leftKeyDown) {
            dir = dir - turnRate;
        }
        if (Globals.rightKeyDown) {
            dir = dir + turnRate;
        }
        // set rotation and position
        setRotate(dir);
        Point2D heading = Utils.directionToVector(dir, speed);
        setX(getX() + heading.getX());
        setY(getY() + heading.getY());

        // check if collided with an enemy or a powerup
        for (GameEntity entity : Globals.getGameObjects()) {
            if (getBoundsInParent().intersects(entity.getBoundsInParent())) {
                if (entity instanceof Interactable) {
                    Interactable interactable = (Interactable) entity;
                    interactable.apply(this);
                    System.out.println(interactable.getMessage());
                }
            }
        }

        // check for game over condition
        if (isOutOfBounds() || Globals.health <= 0) {
            System.out.println("Game Over");
            Globals.gameLoop.stop();
            Globals.gameOver = true;

            //ButtonType restartButt = new ButtonType("RESTART");
          //  ButtonType exitButt = new ButtonType("EXIT");
           // Alert alert = new Alert(Alert.AlertType.INFORMATION,"GAME OVER!\nYOU SCORED: " + length, restartButt, exitButt);
           // alert.show();
        }
    }

    public void addPart(int numParts) {
        for (int i = 0; i < numParts; i++) {
            SnakeBody newPart = new SnakeBody(pane, tail);
            tail = newPart;
        }
    }

    public void changeHealth(int diff) {
        Globals.health += diff;
        SnekHealthMenu snekHealt = new SnekHealthMenu();
        snekHealt.generateHealthMenu(Globals.game);
    }

    public Integer checkHealth(){
//        System.out.println("Player have " + health + " health");
        return Globals.health;
    }

    public static Float getSpeed(){
        return speed;
    }

    public void resetHealth(int diff){
        Globals.health = diff;
    }


}


