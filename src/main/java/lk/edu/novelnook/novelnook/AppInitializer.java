package lk.edu.novelnook.novelnook;

import javafx.application.Application;
import javafx.stage.Stage;
import lk.edu.novelnook.novelnook.util.CallFxmlFiles;
import java.io.IOException;

public class AppInitializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        new CallFxmlFiles().callFxmlFile("Main-View");
    }

    public static void main(String[] args) {
        launch();
    }
}