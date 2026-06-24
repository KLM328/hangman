package fr.quentincillierre.hangman.controller;

import fr.quentincillierre.hangman.model.WordRepository;
import javafx.fxml.FXML;

public class GameController {

    @FXML
    public void initialize() {
        WordRepository wordRepository = new WordRepository();
        String wordToGuess = wordRepository.getRandomWord();
    }

    private void refreshUI() {

    }

    public void handleKeyboardInput(String character){

    }

    private void generateKeyboard() {
    }


}