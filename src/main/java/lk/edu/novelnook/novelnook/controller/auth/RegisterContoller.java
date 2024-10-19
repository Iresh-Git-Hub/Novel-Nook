package lk.edu.novelnook.novelnook.controller.auth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.edu.novelnook.novelnook.dto.UserDto;
import lk.edu.novelnook.novelnook.model.UserModel;
import lk.edu.novelnook.novelnook.util.CallFxmlFiles;

public class RegisterContoller {
    @FXML
    private AnchorPane regiaterPane;
    @FXML
    private TextField emailText;
    @FXML
    private TextField nameText;
    @FXML
    private PasswordField passwordText;

    private final UserModel userModel = new UserModel();

    public void backMethod(MouseEvent mouseEvent) {
        this.regiaterPane.getScene().getWindow().hide();
        new CallFxmlFiles().callFxmlFile("Login-View");
    }

    public void gotoLoginPage(ActionEvent actionEvent) {
        this.regiaterPane.getScene().getWindow().hide();
        new CallFxmlFiles().callFxmlFile("Login-View");
    }

    public void closeWindow(MouseEvent mouseEvent) {
        this.regiaterPane.getScene().getWindow().hide();
    }

    public void clearTextFields() {
        this.nameText.setText("");
        this.emailText.setText("");
        this.passwordText.setText("");
    }

    public void userRegister(ActionEvent actionEvent) {
        try {
            String name = nameText.getText();
            String email = emailText.getText();
            String password = passwordText.getText();

            // Adding Default styles
            String defaultStyle = "-fx-border-color: #e5e7eb;-fx-border-radius: 8;-fx-background-radius: 8";
            nameText.setStyle(defaultStyle);
            emailText.setStyle(defaultStyle);
            passwordText.setStyle(defaultStyle);

            // Create Regex patterns for validate user details
            String namePattern = "^[a-zA-Z ]+$";
            String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            String passwordPattern = "^(?=.*[0-9])(?=.*[a-zA-Z]).{8,}$";

            boolean isValid = true;

            if (name.isEmpty() || !name.matches(namePattern)) {
                nameText.setStyle("-fx-border-color: red; -fx-border-radius: 8;-fx-background-radius: 8");
                isValid = false;
            }

            if (email.isEmpty() || !email.matches(emailPattern)) {
                emailText.setStyle("-fx-border-color: red;-fx-border-radius: 8;-fx-background-radius: 8");
                isValid = false;
            }

            if (password.isEmpty() || !password.matches(passwordPattern)) {
                passwordText.setStyle("-fx-border-color: red;-fx-border-radius: 8;-fx-background-radius: 8");
                isValid = false;
            }

            if (isValid) {
                UserDto userDto = new UserDto(name, email, password);
                String resp = userModel.saveUser(userDto);
                Alert alert = new Alert(Alert.AlertType.INFORMATION, resp);
                if (alert.showAndWait().get() == ButtonType.OK) {
                    clearTextFields();
                    this.regiaterPane.getScene().getWindow().hide();
                    new CallFxmlFiles().callFxmlFile("Login-View");
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Please fix the errors and try again.");
                alert.showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
