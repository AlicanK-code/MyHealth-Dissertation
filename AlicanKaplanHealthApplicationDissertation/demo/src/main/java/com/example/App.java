package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("homepage"), 640, 480);

        //Links the CSS file to the Scene
        String css = getClass().getResource("/com/example/styles.css").toExternalForm(); //Locates CSS file (remember there was an error here with the location)
        scene.getStylesheets().add(css);

        //Adds my app's logo
        Image appLogo = new Image(getClass().getResourceAsStream("/com/example/myHealthLogo.png")); //Locates png location
        stage.getIcons().add(appLogo);

        
        stage.setTitle("MyHealth");
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}

