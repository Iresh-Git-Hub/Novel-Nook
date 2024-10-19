package lk.edu.novelnook.novelnook.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.edu.novelnook.novelnook.dto.CustomerDto;
import lk.edu.novelnook.novelnook.model.CusomerModel;

public class CustomerController {
    private final CusomerModel cusomerModel = new CusomerModel();
    @FXML
    private TextField addressText;

    @FXML
    private TextField contactText;

    @FXML
    private TextField idText;

    @FXML
    private TextField nameText;

    @FXML
    void saveCustomer(ActionEvent event) throws Exception{
        CustomerDto customerDto = new CustomerDto(idText.getText(), nameText.getText(), addressText.getText(), contactText.getText());
        boolean isSaved  = cusomerModel.saveCustomer(customerDto);
        if (isSaved) {
            new Alert(Alert.AlertType.INFORMATION, "Customer Saved").show();
        }else {
            new Alert(Alert.AlertType.ERROR, "Customer Saved").show();
        }
    }
}
