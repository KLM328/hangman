package fr.quentincillierre.hangman.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MenuApplication extends Application {
    @Override
    public void start(Stage menuStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(MenuApplication.class.getResource("menu-view.fxml"));
        Scene menuScene = new Scene(fxmlLoader.load());

        String menuCss = this.getClass().getResource("/fr/quentincillierre/hangman/css/menu.css").toExternalForm();
        menuScene.getStylesheets().add(menuCss);

        menuStage.setScene(menuScene);

        menuStage.setTitle("Hang Man Menu");
//        menuStage.setFullScreen(true);
//        menuStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("f11"));


        menuStage.show();
    }
}
