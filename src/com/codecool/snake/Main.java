package com.codecool.snake;


import com.codecool.snake.Controller.App;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        App app = new App();
        app.start(primaryStage);
    }
}


