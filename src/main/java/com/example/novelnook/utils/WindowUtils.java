package com.example.novelnook.utils;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

import java.io.IOException;

public class WindowUtils {

    private double xOffset = 0;
    private double yOffset = 0;

    public void setWindow(String fileName){
        try {

            Parent root = FXMLLoader.load(getClass().getResource("/view/"+fileName+".fxml"));

            Scene scene = new Scene(root);
            scene.setFill(Color.TRANSPARENT);

            Stage stage = new Stage();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.setScene(scene);

            root.setOnMousePressed(e -> {
                xOffset = e.getSceneX();
                yOffset = e.getSceneY();
            });

            root.setOnMouseDragged(e -> {
                stage.setX(e.getScreenX() - xOffset);
                stage.setY(e.getScreenY() - yOffset);
            });

            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Loading fxml file like model
    public void getLikeModel(ImageView closeButton, String view) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/"+view +".fxml"));
        Parent load = null;
        try {
            load = loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(load);
        scene.setFill(Color.TRANSPARENT);

        Stage stage = new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);

        Window window = closeButton.getScene().getWindow();
        stage.initOwner(window);
        stage.showAndWait();
    }
}
