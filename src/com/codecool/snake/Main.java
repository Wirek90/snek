package com.codecool.snake;


import com.codecool.snake.View.App;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
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


        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10));
        hbox.setSpacing(30);
        hbox.setStyle("-fx-background-color: #336699;");
        hbox.setPrefWidth(Globals.WINDOW_WIDTH);
        hbox.setPrefHeight(40);

        Button buttonStart = new Button("Start");
        Button buttonPause = new Button("Pause");
        Button buttonExit = new Button("Exit");

        HBox rightButtons = new HBox(buttonExit);
        rightButtons.setAlignment(Pos.TOP_RIGHT);
        HBox.setHgrow(rightButtons, Priority.ALWAYS);

        final javafx.scene.image.ImageView imv = new javafx.scene.image.ImageView();
        final Image image2 = new Image("heart.png");
        imv.setImage(image2);

        hbox.getChildren().addAll(buttonStart, buttonPause, buttonExit, imv);

        game.getChildren().addAll(hbox);

        primaryStage.setTitle("Snake Game");
        primaryStage.setScene(new Scene(game, Globals.WINDOW_WIDTH, Globals.WINDOW_HEIGHT));
        primaryStage.show();
        game.start();

        //GameOver gameOver = new GameOver();
        //gameOver.start(primaryStage);

    }

}
