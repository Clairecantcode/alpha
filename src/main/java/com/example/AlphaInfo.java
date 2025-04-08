package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class AlphaInfo {

    @FXML
    private Text hiName;

    @FXML
    private Button playButt;

    String name;

    @FXML
    public void initialize() {
        // This method runs automatically when the scene loads
        name = Data.name;
        hiName.setText("Hi "+name+"!");
    }

    @FXML
    void startGame(MouseEvent event) {
        try {
            App.setRoot("gameScreen");
        } catch (Exception e) {
            System.out.println(e);

        }
    }

}

