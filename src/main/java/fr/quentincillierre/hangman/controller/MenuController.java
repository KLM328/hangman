package fr.quentincillierre.hangman.controller;

import fr.quentincillierre.hangman.GameMode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private Stage stage;

    private Scene scene;
    private Parent root;

    @FXML
    private RadioButton easy, medium, hard;
    @FXML
    private Label gameModeText;

    public void play(ActionEvent event) throws IOException {
        System.out.println("PLAY");
        GameMode gameMode = null;
        if (easy.isSelected()) {
            gameMode = GameMode.EASY;
        } else if (medium.isSelected()) {
            gameMode = GameMode.MEDIUM;
        }else if (hard.isSelected()) {
            gameMode = GameMode.HARD;
        }

        if (gameMode != null) {
            // Lancer le jeu avec le gameMode selectionné
            root = FXMLLoader.load(getClass().getResource("/fr/quentincillierre/hangman/application/game-view.fxml"));
            stage = (Stage)((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        else {
            gameModeText.setText("Please select a gamemode.");
        }

    }



}
