package com.codecool.snake.View;
import com.codecool.snake.Model.Globals;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class SnekMenu {

    public void generateMenu() {
        Globals.vBox = new VBox();

        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menu");

        MenuItem menuPauseItem = new MenuItem("Pause Snek");
        MenuItem menuRestartItem = new MenuItem("New Snek");


        MenuItem menuCloseItem = new MenuItem("Close");
        String info = "Use arrow keys to move. Beware of the mongoose!";
        Menu menuInfo = new Menu(info);
        menuInfo.setDisable(false);




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


        menuBar.getMenus().addAll(menu, menuInfo);
        Globals.vBox.getChildren().addAll(menuBar, Globals.game);

    }
}