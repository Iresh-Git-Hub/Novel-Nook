package com.example.novelnook.controller;

import com.example.novelnook.utils.WindowUtils;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    public ImageView closeButton;
    @FXML
    private JFXButton addNewBookButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void openAddNewBookModel(ActionEvent actionEvent) throws IOException {
        new WindowUtils().getLikeModel(closeButton,"BookView");
    }
}
