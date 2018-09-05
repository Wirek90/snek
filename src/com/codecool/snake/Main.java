package com.codecool.snake;


import com.codecool.snake.View.App;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.beans.property.adapter.JavaBeanBooleanProperty;
import javafx.scene.control.Alert;

public class Main extends Application {

   // private static final Platform Platform = new Platform();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        App app = new App();
        app.start(primaryStage);
    }



}       // game.start();

        //GameOver gameOver = new GameOver();
        //gameOver.start(primaryStage);



