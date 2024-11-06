package com.example.novelnook.controller;

import com.example.novelnook.utils.WindowUtils;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.WindowEvent;

import java.io.IOException;
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
    private ImageView closeButton;

    private final LandingController controller = new LandingController();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // close the window
        this.closeButton.setOnMouseClicked(event -> {
            loginPane.getScene().getWindow().hide();
        });

        this.loginButton.setOnAction(event -> {
            this.loginPane.getScene().getWindow().hide();
            controller.mainPane.getScene().getWindow().hide();
            new WindowUtils().setWindow("DashboardView");
        });
    }
}
