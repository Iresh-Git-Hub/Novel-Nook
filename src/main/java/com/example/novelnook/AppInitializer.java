package com.example.novelnook;

import com.example.novelnook.utils.WindowUtils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       new WindowUtils().setWindow("LandingView");
    }

    public static void main(String[] args) {
        launch();
    }
}