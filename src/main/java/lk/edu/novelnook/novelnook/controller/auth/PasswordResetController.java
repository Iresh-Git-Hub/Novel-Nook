package lk.edu.novelnook.novelnook.controller.auth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.edu.novelnook.novelnook.util.CallFxmlFiles;
import lk.edu.novelnook.novelnook.util.MailUtil;

public class PasswordResetController {

    @FXML
    private Label errorLbl;
    @FXML
    private AnchorPane forgetPasswordPane;
    @FXML
    private TextField emailText;
    @FXML
    private TextField txtFive;
    @FXML
    private TextField txtFour;
    @FXML
    private TextField txtOne;
    @FXML
    private TextField txtSix;
    @FXML
    private TextField txtThree;
    @FXML
    private TextField txtTwo;
    @FXML
    private TextField newPasswordConfirmTxt;
    @FXML
    private TextField newPasswordTxt;

    public void sentVerificationCode(){
        try {
            String email = emailText.getText();
            MailUtil.sendMailForValidation(email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void gotoPasswordVerificationView(ActionEvent actionEvent) {
        this.forgetPasswordPane.getScene().getWindow().hide();
        sentVerificationCode();
        new CallFxmlFiles().callFxmlFile("Forget-Password-View-2");
    }

    public void backButton(MouseEvent mouseEvent) {
        this.forgetPasswordPane.getScene().getWindow().hide();
        new CallFxmlFiles().callFxmlFile("Login-View");
    }

    public void gotoenterNewPasswordView(ActionEvent actionEvent) {
        this.forgetPasswordPane.getScene().getWindow().hide();
        //verify sent verification code
        int verifyCode = Integer.parseInt(txtOne.getText()+txtTwo.getText()+txtThree.getText()+txtFour.getText()+txtFive.getText()+txtSix.getText());
        if (verifyCode == MailUtil.code){
            this.forgetPasswordPane.getScene().getWindow().hide();
            new CallFxmlFiles().callFxmlFile("Forget-Password-View-3");
        }else{
            // methanata thawa gahanna thiyeno
            new Alert(Alert.AlertType.ERROR,"Invalid Verification Code").show();
        }
    }

    public void backToForgetPasswordViewOne(MouseEvent mouseEvent) {
        this.forgetPasswordPane.getScene().getWindow().hide();
        new CallFxmlFiles().callFxmlFile("Forget-Password-View-1");
    }

    public void backToForgetPasswordViewTwo(MouseEvent mouseEvent) {
        this.forgetPasswordPane.getScene().getWindow().hide();
        new CallFxmlFiles().callFxmlFile("Forget-Password-View-2");
    }

    public void gotoSignPage(ActionEvent actionEvent) {
        String newPassword = newPasswordConfirmTxt.getText();
        String conNewPassword = newPasswordConfirmTxt.getText();

        while (true){
            if (newPassword.contentEquals(conNewPassword)){
                this.forgetPasswordPane.getScene().getWindow().hide();
                new CallFxmlFiles().callFxmlFile("Login-View");
                break;
            }else {
                new Alert(Alert.AlertType.ERROR,"Invalid Password").show();
                break;
            }
        }
    }
}
