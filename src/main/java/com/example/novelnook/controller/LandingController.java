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
    public AnchorPane mainPane;

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
        });

        // Navigate to the Register View
        signupButton.setOnAction(event -> {
            try {
                new WindowUtils().getLikeModel(closeButton,"RegisterView");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
