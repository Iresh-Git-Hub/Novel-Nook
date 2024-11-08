package com.example.novelnook.controller;

import com.example.novelnook.utils.WindowUtils;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LandingController implements Initializable {

   // public ImageView closeButton;
    public JFXButton signupButton;
    public JFXButton signinButton;
    public AnchorPane mainPane;
    public ImageView closeButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.signupButton.setOnAction(event -> {
            try {
                new WindowUtils().getLikeModel(closeButton,"RegisterView");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        this.signinButton.setOnAction(event -> {
            try {
                new WindowUtils().getLikeModel(closeButton,"LoginView");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void closeWindow(MouseEvent mouseEvent) {
        this.mainPane.getScene().getWindow().hide();
    }
}
