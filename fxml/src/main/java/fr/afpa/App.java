package fr.afpa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        // Charger le fichier FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fr/afpa/scene-builder.fxml"));
        Parent root = fxmlLoader.load();

        // Créer la scène
        Scene scene = new Scene(root, 640, 480);

        // Assigner la scène au stage principal
        stage.setScene(scene);
        stage.show();
    }
}