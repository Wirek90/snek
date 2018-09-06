package com.codecool.snake.View;

import com.codecool.snake.Controller.Game;
import com.codecool.snake.Model.Globals;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import java.util.ArrayList;


public class SnekHealthMenu {

    public void generateHealthMenu(Game game){

        Globals.hBox = new HBox();

        final Image img = new Image("heart.png");

        ArrayList<ImageView> imgView = new ArrayList(5);

        for(int i = 1; i < Globals.health/20; i++){
            ImageView iv = new ImageView();
            iv.setImage(img);
            imgView.add(iv);
        }

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(5));
        hbox.setSpacing(5);
        hbox.setStyle("-fx-background-color: #336699;");
        hbox.setPrefWidth(Globals.WINDOW_WIDTH);
        hbox.setPrefHeight(40);
        hbox.setAlignment(Pos. TOP_RIGHT);

        for(ImageView iv : imgView){
            hbox.getChildren().add(iv);
        }

//        for(ImageView iv : imgView){
//            hbox.getChildren().remove(0);
//        }

        hbox.getChildren().addAll();
        Globals.gamePane.getChildren().addAll(hbox);

    }
}
