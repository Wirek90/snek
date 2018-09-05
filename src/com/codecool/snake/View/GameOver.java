package com.codecool.snake.View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
         Scene scene = new Scene(root, 400, 400);
         Button btn = new Button(); // create a btn
         root.getChildren().add(btn); // add this btn to the root

         btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
               Stage dialog = new Stage(); // new stage
               dialog.initModality(Modality.APPLICATION_MODAL);
               // Defines a modal window that blocks events from being
               // delivered to any other application window.
               dialog.initOwner(primaryStage);
               VBox vb = new VBox(20);
               Scene dialogScene = new Scene(vb, 300, 200);
               dialog.setScene(dialogScene);
               dialog.show();
            }
         });
         primaryStage.setScene(scene);
         primaryStage.show();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}