package com.example.novelnook.controller;

import com.example.novelnook.utils.WindowUtils;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LandingController implements Initializable {
    @FXML
    private ImageView closeButton;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private JFXButton signinButton;

    @FXML
    private JFXButton signupButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // close the Landing page
        closeButton.setOnMouseClicked(event -> {
            this.mainPane.getScene().getWindow().hide();
        });

        // Navigate to the Login View
        this.signinButton.setOnAction(event -> {

            try {
                new WindowUtils().getLikeModel(closeButton,"LoginView");
            } catch (Exception e) {
                e.printStackTrace();
            }
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/LoginView.fxml"));
//            Parent load = null;
//            try {
//                load = loader.load();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            Scene scene = new Scene(load);
//            scene.setFill(Color.TRANSPARENT);
//
//            Stage stage = new Stage();
//            stage.initStyle(StageStyle.UNDECORATED);
//            stage.setScene(scene);
//            stage.initModality(Modality.APPLICATION_MODAL);
//
//            Window window = this.closeButton.getScene().getWindow();
//            stage.initOwner(window);
//            stage.showAndWait();
        });

        // Navigate to the Register View
        signupButton.setOnAction(event -> {
            System.out.println("Click the sign up button");
        });
    }
}
