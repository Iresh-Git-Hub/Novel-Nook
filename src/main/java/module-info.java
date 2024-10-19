module lk.edu.novelnook.novelnook {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires static lombok;
    requires java.mail;

    opens lk.edu.novelnook.novelnook.controller to javafx.fxml;
    opens lk.edu.novelnook.novelnook.controller.auth to javafx.fxml;

    exports lk.edu.novelnook.novelnook;
}