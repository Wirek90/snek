package com.codecool.snake.Controller;
import com.codecool.snake.Model.Globals;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


    public class App extends Application {

        // private static final Platform Platform = new Platform();


        @Override
            public void start(Stage primaryStage) {
            Globals.primaryStage = primaryStage;
            //background settings
            final Image titleScreen = new Image( "title_screen.png" ); //title screen image
            final ImageView flashScreen_node = new ImageView();
            flashScreen_node.setImage(titleScreen); //set the image of the title screen
            primaryStage.setTitle("Welcome to Snek!!!!!");
            primaryStage.getIcons().add(titleScreen);

            //button settings
            final Image btnImg = new Image( "snake_head.png" );
            ImageView imageView = new ImageView(btnImg);
            Button btn = new Button("\tNEW GAME", imageView);
            btn.setLayoutX(400);
            btn.setLayoutY(150);

            Group root = new Group();
            root.getChildren().addAll(flashScreen_node, btn); //add the title screen to the root

            Scene theScene = new Scene( root, Globals.WINDOW_WIDTH, Globals.WINDOW_HEIGHT, Color.BLACK );

            primaryStage.setScene(theScene);
            primaryStage.show();



            btn.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Globals.gameLoop = new GameLoop();
                    Globals.gameLoop.startGame(primaryStage);

                }


            });






        }



    }
