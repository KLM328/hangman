module fr.quentincillierre.hangman {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.quentincillierre.hangman to javafx.fxml;
    exports fr.quentincillierre.hangman;
    exports fr.quentincillierre.hangman.application;
    opens fr.quentincillierre.hangman.application to javafx.fxml;
}