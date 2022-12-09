package com.example.ejjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Libro {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
