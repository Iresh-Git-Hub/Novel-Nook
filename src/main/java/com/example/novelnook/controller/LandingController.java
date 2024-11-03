package com.example.novelnook.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

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
        signinButton.setOnAction(event -> {
            System.out.println("Click the sign in button");
        });

        // Navigate to the Register View
        signupButton.setOnAction(event -> {
            System.out.println("Click the sign up button");
        });
    }
}
