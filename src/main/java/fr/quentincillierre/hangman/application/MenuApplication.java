package fr.quentincillierre.hangman.application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class MenuApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Stage menuStage = new Stage();
        Scene menuScene = new Scene(new Group());

        menuStage.setScene(menuScene);
        menuStage.setTitle("Hang Man Menu");
        menuStage.setFullScreen(true);
//        menuStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("f11"));


        menuStage.show();
    }
}
