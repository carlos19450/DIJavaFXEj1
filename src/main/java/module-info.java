module com.example.ejjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejjavafx to javafx.fxml;
    exports com.example.ejjavafx;
}