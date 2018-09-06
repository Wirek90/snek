package com.codecool.snake.View;

import com.codecool.snake.Model.Globals;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
public class GameOver extends Application {

   @Override
   public void start(Stage primaryStage) {
      try {
         Pane root = new Pane();
         //background settings
         final Image titleScreen = new Image( "end_screen.png" ); //title screen image
         final ImageView flashScreen_node = new ImageView();
         flashScreen_node.setImage(titleScreen); //set the image of the title screen
         primaryStage.setTitle("Welcome to Snek!!!!!");
         primaryStage.getIcons().add(titleScreen);
         Scene scene = new Scene(root, Globals.WINDOW_WIDTH, Globals.WINDOW_HEIGHT);

         //button settings
         final Image btnImg = new Image( "snake_head.png" );
         ImageView imageView = new ImageView(btnImg);
         Button btn = new Button("  YOUR SCORE: " + Globals.length + "PT", imageView);
         btn.setLayoutX(400);
         btn.setLayoutY(150);

         root.getChildren().addAll(flashScreen_node, btn); // add this btn to the root

         primaryStage.setScene(scene);
         primaryStage.show();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}