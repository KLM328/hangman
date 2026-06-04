package fr.quentincillierre.hangman.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class MenuApplication extends Application {
    @Override
    public void start(Stage menuStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu-view.fxml"));
        Scene menuScene = new Scene(fxmlLoader.load(), 320, 240);

        menuStage.setScene(menuScene);

        menuStage.setTitle("Hang Man Menu");
        menuStage.setFullScreen(true);
//        menuStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("f11"));


        menuStage.show();
    }
}
