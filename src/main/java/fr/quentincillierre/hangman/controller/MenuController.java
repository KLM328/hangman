package fr.quentincillierre.hangman.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void play(ActionEvent event) throws IOException {
        System.out.println("PLAY");
        root = FXMLLoader.load(getClass().getResource("/fr/quentincillierre/hangman/application/game-view.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
