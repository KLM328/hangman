package fr.quentincillierre.hangman.controller;

import fr.quentincillierre.hangman.GameMode;
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
    private void onTimeAttackClicked(ActionEvent event) throws IOException {
        launchGame(event, GameMode.TIME_ATTACK);
    }

    @FXML
    private void onClassicClicked(ActionEvent event) throws IOException {
        launchGame(event, GameMode.CLASSIC);
    }

    /**
     * Centralise le chargement de la scène de jeu et l'injection du mode
     */
    private void launchGame(ActionEvent event, GameMode mode) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fr/quentincillierre/hangman/application/game-view.fxml"));
        Parent gameRoot = loader.load();

        GameController gameController = loader.getController();
        gameController.setGameMode(mode);

        Scene gameScene = new Scene(gameRoot);
        gameScene.setOnKeyTyped(keyEvent -> {
            gameController.handleKeyboardInput(keyEvent.getCharacter());
        });

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("HangMan : " + mode);
        stage.setScene(gameScene);
    }
}