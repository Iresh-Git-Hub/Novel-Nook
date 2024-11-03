module com.example.novelnook {
    requires javafx.fxml;
    requires com.jfoenix;
    requires javafx.graphics;
    requires java.mail;
    requires static lombok;
    requires java.sql;

    opens com.example.novelnook to javafx.fxml;
    opens com.example.novelnook.controller to javafx.fxml;

    exports com.example.novelnook;
}