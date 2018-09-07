package com.codecool.snake.Model;

import com.codecool.snake.Controller.Game;
import com.codecool.snake.Model.entities.snakes.SnakeHead;
import com.codecool.snake.Controller.GameLoop;
import com.codecool.snake.Model.entities.GameEntity;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// class for holding all static stuff
public class    Globals {

    public static final double WINDOW_WIDTH = 1000;
    public static final double WINDOW_HEIGHT = 700;
    public static Stage primaryStage;
    public static Game game;
    public static VBox vBox;
    public static HBox hBox;
    public static Image snakeHead = new Image("snake_head.png");
    public static Image snakeBody = new Image("snake_body.png");
    public static Image simpleEnemy = new Image("simple_enemy.png");
    public static Image powerupBerry = new Image("powerup_berry.png");
    public static Image mongooseEnemy = new Image("mongoose_enemy.png");
    public static Image eagleEnemy = new Image("eagle_enemy.png");
    public static Image shieldPowerUp = new Image("shield.png");
    public static Image medkitPowerUp = new Image("medicine.png");
    public static Image simpleLaser = new Image("simplelaser.png");
    //.. put here the other images you want to use
    public static boolean gameOver;
    public static boolean leftKeyDown;
    public static boolean rightKeyDown;
    public static boolean spaceDown;
    public static boolean isPaused = false;
    public static List<GameEntity> gameObjects;
    public static List<GameEntity> newGameObjects; // Holds game objects crated in this frame.
    public static List<GameEntity> oldGameObjects; // Holds game objects that will be destroyed this frame.
    public static GameLoop gameLoop;
    public static SnakeHead snake;
    public static Pane gamePane;
    public static int health;
    public static int length;

    static {
        gameObjects = new LinkedList<>();
        newGameObjects = new LinkedList<>();
        oldGameObjects = new LinkedList<>();
    }

    public static void addGameObject(GameEntity toAdd) {
        newGameObjects.add(toAdd);
    }

    public static void removeGameObject(GameEntity toRemove) {
        oldGameObjects.add(toRemove);
    }

    public static List<GameEntity> getGameObjects() {
        return Collections.unmodifiableList(gameObjects);
    }
}
