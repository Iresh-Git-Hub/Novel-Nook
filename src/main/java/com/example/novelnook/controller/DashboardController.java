package com.example.novelnook.controller;

import com.example.novelnook.utils.WindowUtils;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    public ImageView closeButton;
    public AnchorPane homePane;
    public AnchorPane mainPane;
    @FXML
    private JFXButton addNewBookButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        new WindowUtils().navigateTo(mainPane,"BookView");
    }

    public void gotoPageOne(ActionEvent actionEvent) {
        new WindowUtils().navigateTo(mainPane,"BookView");
    }

    public void gotoPage2(ActionEvent actionEvent) {
        new WindowUtils().navigateTo(mainPane,"CustomerView");
    }

    public void closeWindow(MouseEvent mouseEvent) {
        this.homePane.getScene().getWindow().hide();
    }
}
