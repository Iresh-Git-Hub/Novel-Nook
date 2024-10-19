package lk.edu.novelnook.novelnook.controller.auth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.edu.novelnook.novelnook.util.CallFxmlFiles;

public class LoginController {
    @FXML
    private AnchorPane loginPane;

    public void gotoRegisterPage(ActionEvent actionEvent) {
        this.loginPane.getScene().getWindow().hide();
        new CallFxmlFiles().callFxmlFile("Register-View");
    }

    public void backMethod(MouseEvent mouseEvent) {
        this.loginPane.getScene().getWindow().hide();
        new CallFxmlFiles().callFxmlFile("Main-View");
    }

    public void closeWindow(MouseEvent mouseEvent) {
        this.loginPane.getScene().getWindow().hide();
    }

    public void gotoUpdatePassword(ActionEvent actionEvent) {
        this.loginPane.getScene().getWindow().hide();
        new CallFxmlFiles().callFxmlFile("Forget-Password-View-1");
    }

    @FXML
    void gotoHomePage(ActionEvent event) {
        this.loginPane.getScene().getWindow().hide();
        new CallFxmlFiles().callFxmlFile("Customer-View");
    }
}
