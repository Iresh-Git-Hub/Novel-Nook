package lk.edu.novelnook.novelnook.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.edu.novelnook.novelnook.util.CallFxmlFiles;

public class MainController {

    @FXML
    private AnchorPane mainPane;

    public void closeWindow(MouseEvent mouseEvent) {
        this.mainPane.getScene().getWindow().hide();
    }

    public void gotoLogin(ActionEvent actionEvent) {
        this.mainPane.getScene().getWindow().hide();
        new CallFxmlFiles().callFxmlFile("Login-View");
    }

    public void gotoRegister(ActionEvent actionEvent) {
        this.mainPane.getScene().getWindow().hide();
        new CallFxmlFiles().callFxmlFile("Register-View");
    }
}
