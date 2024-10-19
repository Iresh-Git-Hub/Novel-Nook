package lk.edu.novelnook.novelnook.model;

import lk.edu.novelnook.novelnook.db.DBConnection;
import lk.edu.novelnook.novelnook.dto.CustomerDto;
import lk.edu.novelnook.novelnook.util.CrudUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CusomerModel {

    public boolean saveCustomer(CustomerDto customerDto) throws Exception{
        String querry = "insert into customer values(?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(querry);
        preparedStatement.setString(1, customerDto.getCustomerId());
        preparedStatement.setString(2, customerDto.getCustomerName());
        preparedStatement.setString(3, customerDto.getCustomerAddress());
        preparedStatement.setString(4, customerDto.getCustomerPhone());
        int response = preparedStatement.executeUpdate();
        if (response > 0) {
            return true;
        }else {
            return false;
        }
    }
}
