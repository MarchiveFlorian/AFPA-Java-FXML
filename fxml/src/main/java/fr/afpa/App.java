package fr.afpa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fr/afpa/scene-builder.fxml"));
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Table View Application");
        stage.show();
    }
}