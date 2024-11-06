package com.example.novelnook.controller;

import com.example.novelnook.utils.WindowUtils;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable {

    @FXML
    private ImageView closeButton;

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
        // close the window
        this.closeButton.setOnMouseClicked(event -> {
            this.registerPane.getScene().getWindow().hide();
        });

        // register buton click method
    }

}
