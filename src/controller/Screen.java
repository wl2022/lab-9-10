package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Screen {
    private Stage stage;
    private String screenTitle;
    private String fxmlFile;
    private FXMLLoader fxmlLoader;

    public Screen(Stage stage, String screenTitle, String fxmlFile) {
        this.stage = stage;
        this.screenTitle = screenTitle;
        this.fxmlFile = fxmlFile;
        this.fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource(fxmlFile));
    }

    public Stage getStage() {
        return stage;
    }

    public void start(Controller c) {
    	//System.out.println();
        stage.setTitle(screenTitle);
        fxmlLoader.setController(c);

        try {
            final Parent root = fxmlLoader.load();
            final Scene sc = new Scene(root);
            stage.setScene(sc);
            System.out.println("loaded");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
