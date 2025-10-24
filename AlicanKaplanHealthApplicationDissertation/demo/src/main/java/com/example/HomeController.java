package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class HomeController {
    
    @FXML                                                           //handles navigation to the appointment page
    private void switchToBooking() throws IOException { 
        App.setRoot("primary");
    }

    @FXML                                                           //handles navigation to the information page
    private void switchToInformation() throws IOException {
        App.setRoot("information");
    }


}
