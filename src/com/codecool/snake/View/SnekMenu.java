package com.codecool.snake.View;
import com.codecool.snake.Controller.Game;
import com.codecool.snake.Model.Globals;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import com.codecool.snake.View.GameLoop;
import javafx.stage.Stage;

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


        menuRestartItem.setOnAction(event -> {

                Globals.gameLoop.restartGame();
        });

        menu.getItems().setAll(menuRestartItem, menuPauseItem, menuCloseItem);


        menuBar.getMenus().addAll(menu, menuInfo, menuHealth);
        Globals.vBox.getChildren().addAll(menuBar, Globals.game);

    }
}