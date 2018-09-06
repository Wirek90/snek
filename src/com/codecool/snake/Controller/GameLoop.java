package com.codecool.snake.Controller;

import com.codecool.snake.Controller.Game;
import com.codecool.snake.Model.Globals;
import com.codecool.snake.Model.entities.GameEntity;
import com.codecool.snake.Model.entities.Animatable;
import com.codecool.snake.View.GameOver;
import com.codecool.snake.View.SnekHealthMenu;
import com.codecool.snake.View.SnekMenu;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
        GameOver over = new GameOver();
        over.start(Globals.primaryStage);

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

    public void startGame(Stage primaryStage) {
        Globals.game = new Game();
        Globals.gamePane = Globals.game;
        SnekMenu gameMenu = new SnekMenu();
        gameMenu.generateMenu();
        SnekHealthMenu healthMenu = new SnekHealthMenu();
        healthMenu.generateHealthMenu(Globals.game);
        primaryStage.setTitle("Snake Game");
        primaryStage.setScene(new Scene(Globals.vBox, Globals.WINDOW_WIDTH, Globals.WINDOW_HEIGHT));
        primaryStage.show();
        Globals.game.start();
    }


    public void restartGame() {
        if (Globals.game != null) stop();
        Globals.game = new Game();
        Globals.gamePane = Globals.game;
        SnekMenu gameMenu = new SnekMenu();
        gameMenu.generateMenu();
        SnekHealthMenu healthMenu = new SnekHealthMenu();
        healthMenu.generateHealthMenu(Globals.game);
        Globals.primaryStage.setTitle("Snake Game");
        Globals.primaryStage.setScene(new Scene(Globals.vBox, Globals.WINDOW_WIDTH, Globals.WINDOW_HEIGHT));
        Globals.primaryStage.show();
        Globals.game.start();
    }



}
