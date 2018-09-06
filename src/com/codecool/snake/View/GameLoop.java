package com.codecool.snake.View;

import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.GameEntity;
import com.codecool.snake.Model.entities.Animatable;
import javafx.animation.AnimationTimer;

public class GameLoop extends AnimationTimer {

    // This gets called every 1/60 seconds
    @Override
    public void handle(long now) {
        for (GameEntity gameObject : Globals.gameObjects) {
            if (gameObject instanceof Animatable) {
                Animatable animObject = (Animatable)gameObject;
                animObject.step();
            }
        }
        Globals.gameObjects.addAll(Globals.newGameObjects);
        Globals.newGameObjects.clear();

        Globals.gameObjects.removeAll(Globals.oldGameObjects);
        Globals.oldGameObjects.clear();
    }

    public void stop() {
        super.stop();
        Globals.gamePane.getChildren().clear();
        Globals.snake.destroy();
    }

    public void pause() {
        if(!Globals.isPaused) {
            super.stop();
            Globals.isPaused = !Globals.isPaused;
        } else {
            super.start();
            Globals.isPaused = !Globals.isPaused;
        }
    }

    public void restart() {
    }
}
