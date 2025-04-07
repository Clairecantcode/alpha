package com.example;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.image.Image;



public class GameScreen {

    @FXML
    private ImageView bear;

    @FXML
    private ImageView bottle;

    @FXML
    private Text feedbackText;

    @FXML
    private ImageView foodBar;

    @FXML
    private ImageView foodButt;

    @FXML
    private Text foodStat;

    @FXML
    private ImageView healthBar;

    @FXML
    private ImageView healthButt;

    @FXML
    private Text healthStat;

    @FXML
    private ImageView shelterButt;

    @FXML
    private ImageView squareForFeedback;

    @FXML
    private ImageView thumbsUpGuy;

    @FXML
    private ImageView thunder;

    @FXML
    private ImageView tree;

    @FXML
    private ImageView warmthBar;

    @FXML
    private Text warmthStat;

    @FXML
    private ImageView waterBar;

    @FXML
    private ImageView waterButt;

    @FXML
    private Text waterStat;

    @FXML
    private ImageView wolf2;

    @FXML
    private ImageView wolf3;

    @FXML
    public void initialize() {
        // This method runs automatically when the scene loads
        foodBar.setImage(new Image(getClass().getResourceAsStream("/capstone/bars/blue1.png")));

    }

    @FXML
    void chooseFood(MouseEvent event) {

    }

    @FXML
    void chooseHealth(MouseEvent event) {

    }

    @FXML
    void chooseShelter(MouseEvent event) {

    }

    @FXML
    void chooseWater(MouseEvent event) {

    }


}

