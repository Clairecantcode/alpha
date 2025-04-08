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


    int tutoritalStage;
    int fStat;
    int wStat;
    int hStat;
    int sStat;

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

        fStat=3;
        wStat=3;
        hStat=3;
        sStat=3;

        foodStat.setText(fStat+"/5");
        waterStat.setText(wStat+"/5");
        healthStat.setText(hStat+"/5");
        warmthStat.setText(sStat+"/5");

        tutoritalStage = 0;
        squareForFeedback.setVisible(true);
        feedbackText.setText("This is the tutorial! \n Hit next to start the tutorial!");
        }

    @FXML
    void chooseFood(MouseEvent event) {
        fStat++;
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
        tutoritalStage++;
        if(tutoritalStage ==1){
            statsArrow.setVisible(true);
            feedbackText.setText("These are your stats! \n If any of these stats \n hits 0 you loose the game :( \n green=food blue=water \n red=health yellow=warmth");
        }
        else if(tutoritalStage==2){
            statsArrow.setVisible(false);
            choicesArrow.setVisible(true);
            feedbackText.setText("These are your choices \n for every life stage! \n each choice adds 1 to the \n cordinating stat!");
        }
        else if(tutoritalStage==3){
            choicesArrow.setVisible(false);
            pointsArrow.setVisible(true);
            feedbackText.setText("These are the points you \n get per year! \n Every choice costs 1 point \n and ups a stat by 1");
        }
        else if(tutoritalStage==4){
            pointsArrow.setVisible(false);
            feedbackText.setText("There will also be life altering events in every stage after you use all your points! \n Watch out! They could cost you lots of points! \n Good luck :D");
            tutNext.setText("end tutorial");
        }
        else{
            feedbackText.setVisible(false);
            squareForFeedback.setVisible(false);
            tutNext.setVisible(false);
        }
    }


}

