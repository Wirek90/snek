package com.codecool.snake.View;

import com.codecool.snake.Controller.Game;
import com.codecool.snake.Model.Globals;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class SnekHealthMenu {

    public void generateHealthMenu(Game game){

        Globals.hBox = new HBox();
        final ImageView imv = new ImageView();

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(5));
        hbox.setSpacing(30);
        hbox.setStyle("-fx-background-color: #336699;");
        hbox.setPrefWidth(Globals.WINDOW_WIDTH);
        hbox.setPrefHeight(40);
        HBox.setHgrow(imv, Priority.ALWAYS);
        hbox.setAlignment(Pos. TOP_RIGHT);

        final Image image2 = new Image("heart.png");
        imv.setImage(image2);

        hbox.getChildren().addAll(imv);
        Globals.gamePane.getChildren().addAll(hbox);

    }
}
