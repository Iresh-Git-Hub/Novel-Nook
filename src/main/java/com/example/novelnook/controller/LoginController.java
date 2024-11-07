package com.example.novelnook.controller;

import com.example.novelnook.utils.WindowUtils;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    public Hyperlink gotoRegisterView;
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void gotoRegisterView(ActionEvent actionEvent) {
        new WindowUtils().navigateTo(loginPane,"RegisterView");
    }

    public void closeWindow(MouseEvent mouseEvent) {
        this.loginPane.getScene().getWindow().hide();
    }
}
