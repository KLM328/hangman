package fr.quentincillierre.hangman.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameController {
    @FXML
    private Stage stage;

    private Scene scene;
    private Parent root;

    public void escape(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/fr/quentincillierre/hangman/application/escape-menu-view.fxml"));
        stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
