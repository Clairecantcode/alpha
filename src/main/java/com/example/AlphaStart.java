package com.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AlphaStart {
     private static Scene scene;

    @FXML
    private TextField playerNameBox;

    @FXML
    private Button startButt;

    String name;

    @FXML
    void startButtClicked(MouseEvent event) {
        name=playerNameBox.getText();
        Data.name = name;
        try {
            App.setRoot("alphaInfo");
        } catch (Exception e) {

        }
    
        
    }
   

}

