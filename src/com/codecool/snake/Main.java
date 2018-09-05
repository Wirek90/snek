package com.codecool.snake;

import com.codecool.snake.Controller.Game;
import com.codecool.snake.Model.Globals;
import com.codecool.snake.View.GameOver;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.beans.property.adapter.JavaBeanBooleanProperty;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Game game = new Game();

        primaryStage.setTitle("Snake Game");
        primaryStage.setScene(new Scene(game, Globals.WINDOW_WIDTH, Globals.WINDOW_HEIGHT));
        primaryStage.show();
        game.start();

        //GameOver gameOver = new GameOver();
        //gameOver.start(primaryStage);

    }

}
