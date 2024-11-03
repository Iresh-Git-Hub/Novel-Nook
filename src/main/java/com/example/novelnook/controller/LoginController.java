package com.example.novelnook.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField emailText;

    @FXML
    private Hyperlink forgetPasswordLink;

    @FXML
    private JFXButton loginButton;

    @FXML
    private AnchorPane loginPane;

    @FXML
    private PasswordField passwordText;

    @FXML
    private RadioButton radioButton;

    @FXML
    private Hyperlink signupLink;

    @FXML
    private ImageView closeButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.closeButton.setOnMouseClicked(event -> {
            loginPane.getScene().getWindow().hide();
        });
    }
}
