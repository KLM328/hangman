package fr.quentincillierre.hangman.application;

import fr.quentincillierre.hangman.controller.GameController;
import fr.quentincillierre.hangman.controller.MenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu-view.fxml"));

        VBox root = loader.load();

        Scene scene = new Scene(root, 800, 800);

        primaryStage.setTitle("HangMan Menu");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
