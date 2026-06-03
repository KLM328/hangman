package fr.quentincillierre.hangman;

import fr.quentincillierre.hangman.application.HelloApplication;
import fr.quentincillierre.hangman.application.MenuApplication;
import javafx.application.Application;

public class Launcher {
    public static void main(String[] args) {
        Application.launch(MenuApplication.class, args);
    }
}
