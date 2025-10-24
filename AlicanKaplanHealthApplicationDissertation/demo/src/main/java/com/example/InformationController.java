package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class InformationController {

    @FXML
    private void handleBackToHome() throws IOException {
        App.setRoot("homepage"); // Switch back to the home page
    }
}
