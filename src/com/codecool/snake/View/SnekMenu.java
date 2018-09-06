package com.codecool.snake.View;
import com.codecool.snake.Controller.Game;
import com.codecool.snake.Model.Globals;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import com.codecool.snake.View.GameLoop;
public class SnekMenu {

    public void generateMenu(Game game) {
        Globals.vBox = new VBox();

        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menu");

        MenuItem menuPauseItem = new MenuItem("Pause Snek");
        MenuItem menuRestartItem = new MenuItem("New Snek");


        MenuItem menuCloseItem = new MenuItem("Close");
        String info = "Use arrow keys to move. Press P to pause, R to restart. Beware of the mongoose!";
        Menu menuInfo = new Menu(info);
        menuInfo.setDisable(false);

        Menu menuHealth = new Menu();
        menuHealth.setDisable(false);

        menuCloseItem.setOnAction(event -> System.exit(0));

        menuPauseItem.setOnAction(event -> {
            Globals.gameLoop.pause();
            if (menuPauseItem.getText().equals("Pause Snek")) {
                menuPauseItem.setText("Resume Snek");
            } else {
                menuPauseItem.setText("Pause Snek");
            }
        });


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

  //      primaryStage.setTitle("Snake Game");
    //    primaryStage.setScene(new Scene(game, Globals.WINDOW_WIDTH, Globals.WINDOW_HEIGHT));
      //  primaryStage.show();
       // game.start();


        menuRestartItem.setOnAction(event -> Globals.gameLoop.restart());
        menu.getItems().setAll(menuRestartItem, menuPauseItem, menuCloseItem);


        menuBar.getMenus().addAll(menu, menuInfo, menuHealth);
        Globals.vBox.getChildren().addAll(menuBar, game);

    }
}