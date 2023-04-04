package com.ning.fx.study.javafx_study;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onHelloButtonClickMotherFucker() {
        welcomeText.setText("Welcome to JavaFX Application! Mother Fucker!");
    }
}