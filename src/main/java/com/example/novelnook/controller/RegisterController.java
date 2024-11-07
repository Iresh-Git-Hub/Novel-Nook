package com.example.novelnook.controller;

import com.example.novelnook.utils.WindowUtils;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {

    public Hyperlink gotoLoginView;

    @FXML
    private TextField emailText;

    @FXML
    private PasswordField passwordText;

    @FXML
    private JFXButton registerButton;

    @FXML
    private AnchorPane registerPane;

    @FXML
    private TextField usernameText;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void gotoLoginView(ActionEvent actionEvent) {
        new WindowUtils().navigateTo(registerPane,"LoginView");
    }

    public void closeWindow(MouseEvent mouseEvent) {
        this.registerPane.getScene().getWindow().hide();
    }
}
