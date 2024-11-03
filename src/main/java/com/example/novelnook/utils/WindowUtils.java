package com.example.novelnook.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class WindowUtils {

    private double xOffset = 0;
    private double yOffset = 0;

    public void setWindow(String path){
        try {

            Parent root = FXMLLoader.load(getClass().getResource("/view/"+path+".fxml"));

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
}
