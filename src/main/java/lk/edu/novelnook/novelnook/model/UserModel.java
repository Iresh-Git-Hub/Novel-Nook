package lk.edu.novelnook.novelnook.model;

import lk.edu.novelnook.novelnook.db.DBConnection;
import lk.edu.novelnook.novelnook.dto.UserDto;
import lk.edu.novelnook.novelnook.util.CrudUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserModel {

    public String saveUser(UserDto userDto) {
        try {
            String query = "insert into user values(?,?,?)";
            Connection connection = DBConnection.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, userDto.getName());
            preparedStatement.setString(2, userDto.getEmail());
            preparedStatement.setString(3, userDto.getPassword());

            int result = preparedStatement.executeUpdate();
            return result > 0 ? "User saved" : "User not saved";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
