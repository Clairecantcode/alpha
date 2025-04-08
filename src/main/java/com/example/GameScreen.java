package com.example;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.image.Image;



public class GameScreen {
    @FXML
    private Text points;
    @FXML
    private ImageView choicesArrow;
    @FXML
    private ImageView pointsArrow;
      @FXML
    private Button tutNext;
    @FXML
    private ImageView statsArrow;

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
        //foodBar.setImage(new Image(getClass().getResourceAsStream("/capstone/bars/blue1.png")));
       
        Image img = new Image(getClass().getResourceAsStream("green3.png"));
        foodBar.setImage(img);
        img = new Image(getClass().getResourceAsStream("blue3.png"));
        waterBar.setImage(img);
        img = new Image(getClass().getResourceAsStream("red3.png"));
        healthBar.setImage(img);
        img = new Image(getClass().getResourceAsStream("yellow3.png"));
        warmthBar.setImage(img);

        foodStat.setText("3/5");
        waterStat.setText("3/5");
        healthStat.setText("3/5");
        warmthStat.setText("3/5");

        int tutoritalStage = 0;
        squareForFeedback.setVisible(true);
        feedbackText.setText("This is the tutorial! \n Hit next to start the tutorial!");
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
    @FXML
    void goForwardTut(MouseEvent event) {

    }


}

