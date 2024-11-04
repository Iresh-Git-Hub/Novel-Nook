package com.example.novelnook.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    private ImageView closeButton;

    @FXML
    private JFXButton addNewBookButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.closeButton.setOnMouseClicked(event -> {
            this.closeButton.getScene().getWindow().hide();
        });

        this.addNewBookButton.setOnAction(event -> {
            System.out.println("Click the addNewBookButton");
        });
    }
}
