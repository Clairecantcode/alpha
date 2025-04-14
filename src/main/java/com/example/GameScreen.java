package com.example;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.image.Image;



public class GameScreen {
    @FXML
    private ImageView option1Box;

    @FXML
    private Text option1Text;

    @FXML
    private ImageView option2Box;

    @FXML
    private Text option2Text;
    @FXML
    private Button okayButt;
    @FXML
    private ImageView popUpSqaure;
    @FXML
    private Text popUpText;
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
    private ImageView wolfPic;

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
    Image img;

    int ageUpStage;
    int tutoritalStage;
    int fStat;
    int wStat;
    int hStat;
    int sStat;
    int pointys;
    int eventNum;
    int ageStage;
    int optionPicked;

    @FXML
    public void initialize() {
        // This method runs automatically when the scene loads
        //foodBar.setImage(new Image(getClass().getResourceAsStream("/capstone/bars/blue1.png")));
       
         img = new Image(getClass().getResourceAsStream("green3.png"));
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
        pointys=5;
        ageStage=1;
        eventNum=0;
        ageStage=1;

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
        if(pointys<=0){
            return;
        }
        fStat++;
        pointys--;
        if(pointys==0){
            bigEvent();
        }
        if(fStat==6){
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            popUpText.setText("Food stat is full! \n Dont explode your stomach!");
            okayButt.setVisible(true);
            fStat--;
            pointys++;
        }
        String changeImageTo =("green"+fStat+".png");
        System.out.println(changeImageTo);
        img = new Image(getClass().getResourceAsStream(changeImageTo));
        foodBar.setImage(img);
        foodStat.setText(fStat+"/5");
        points.setText("Points Available For Year:" +pointys+"/5");
    }

    @FXML
    void chooseHealth(MouseEvent event) {
        if(pointys<=0){
            return;
        }
        hStat++;
        pointys--;
        if(pointys==0){
            bigEvent();
        }
        if(hStat==6){
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            popUpText.setText("Health stat is full! \n You are invincible!");
            okayButt.setVisible(true);
            hStat--;
            pointys++;
        }
        healthStat.setText(hStat+"/5");
        points.setText("Points Available For Year:" +pointys+"/5");
        String changeImageTo =("red"+hStat+".png");
        System.out.println(changeImageTo);
        img = new Image(getClass().getResourceAsStream(changeImageTo));
        healthBar.setImage(img);
    }

    @FXML
    void chooseShelter(MouseEvent event) {
        if(pointys<=0){
            return;
        }
        sStat++;
        pointys--;
        if(pointys==0){
            bigEvent();
        }
        if(sStat==6){
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            popUpText.setText("Warmth stat is full! \n Dont overheat!");
            okayButt.setVisible(true);
            sStat--;
            pointys++;
        }
        warmthStat.setText(sStat+"/5");
        points.setText("Points Available For Year:" +pointys+"/5");
        String changeImageTo =("yellow"+sStat+".png");
        System.out.println(changeImageTo);
        img = new Image(getClass().getResourceAsStream(changeImageTo));
        warmthBar.setImage(img);
    }

    @FXML
    void chooseWater(MouseEvent event) {
        if(pointys<=0){
            return;
        }
        wStat++;
        pointys--;
        if(pointys==0){
            bigEvent();
        }
        if(wStat==6){
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            popUpText.setText("Water stat is full! \n Dont drown!");
            okayButt.setVisible(true);
            wStat--;
            pointys++;
        }
        waterStat.setText(wStat+"/5");
        points.setText("Points Available For Year:" +pointys+"/5");
        String changeImageTo =("blue"+wStat+".png");
        System.out.println(changeImageTo);
        img = new Image(getClass().getResourceAsStream(changeImageTo));
        waterBar.setImage(img);
    }
    @FXML
    void goForwardTut(MouseEvent event) {
        tutoritalStage++;
        String whatButtSays= tutNext.getText();
        // this is all for the tutorial
        if(tutoritalStage ==1 && whatButtSays.equals("next")){
            statsArrow.setVisible(true);
            feedbackText.setText("These are your stats! \n If any of these stats \n hits 0 you loose the game :( \n green=food blue=water \n red=health yellow=warmth");
        }
        else if(tutoritalStage==2 && whatButtSays.equals("next")){
            statsArrow.setVisible(false);
            choicesArrow.setVisible(true);
            feedbackText.setText("These are your choices \n for every life stage! \n each choice adds 1 to the \n cordinating stat!");
        }
        else if(tutoritalStage==3 && whatButtSays.equals("next")){
            choicesArrow.setVisible(false);
            pointsArrow.setVisible(true);
            feedbackText.setText("These are the points you \n get per year! \n Every choice costs 1 point \n and ups a stat by 1");
        }
        else if(tutoritalStage==4 && whatButtSays.equals("next")){
            pointsArrow.setVisible(false);
            feedbackText.setText("There will also be life altering events in every stage after you use all your points! \n Watch out! They could cost you lots of points! \n Good luck :D");
            tutNext.setText("end tutorial");
        }
        else if (tutoritalStage==5 && whatButtSays.equals("end tutorial")) {
            feedbackText.setVisible(false);
            squareForFeedback.setVisible(false);
            tutNext.setVisible(false);
        }
        //this is all for the big events
        if(eventNum==1){
            String changeImageTo ="teenwolf.png";
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            wolfPic.setImage(img);
            ageUpStage++;
            feedbackText.setText("You aged up! \n You are now a teen \n and your points have refilled!");
            pointys=5;
            points.setText("Points Available For Year:" +pointys+"/5");
            
            if(ageUpStage==2){
                wStat-=2;
                fStat-=2;
                sStat-=2;
                hStat-=2;

                feedbackText.setVisible(false);
                squareForFeedback.setVisible(false);
                bottle.setVisible(false);
                tutNext.setVisible(false);
                thumbsUpGuy.setVisible(false);
                bear.setVisible(false);
                ageUpStage=-67;

            waterStat.setText(wStat+"/5");
            foodStat.setText(fStat+"/5");
            healthStat.setText(hStat+"/5");
            warmthStat.setText(sStat+"/5");
            
            changeImageTo =("blue"+wStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            waterBar.setImage(img);
            changeImageTo =("green"+fStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            foodBar.setImage(img);
            changeImageTo =("red"+hStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            healthBar.setImage(img);
            changeImageTo =("yellow"+wStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            warmthBar.setImage(img);
            }
        
            
        }
        else if(eventNum==2){
            String changeImageTo ="yawolf.png";
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            wolfPic.setImage(img);
            ageUpStage++;
            feedbackText.setText("You aged up! \n You are now a young adult\n and your points have refilled!");
            pointys=5;
            points.setText("Points Available For Year:" +pointys+"/5");
            if(ageUpStage==2){
                wStat-=2;
                fStat-=2;
                sStat-=2;
                hStat-=2;

                feedbackText.setVisible(false);
                squareForFeedback.setVisible(false);
                bottle.setVisible(false);
                tutNext.setVisible(false);
                thumbsUpGuy.setVisible(false);
                bear.setVisible(false);
                ageUpStage=-67;

            waterStat.setText(wStat+"/5");
            foodStat.setText(fStat+"/5");
            healthStat.setText(hStat+"/5");
            warmthStat.setText(sStat+"/5");
            
            changeImageTo =("blue"+wStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            waterBar.setImage(img);
            changeImageTo =("green"+fStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            foodBar.setImage(img);
            changeImageTo =("red"+hStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            healthBar.setImage(img);
            changeImageTo =("yellow"+wStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            warmthBar.setImage(img);
         }
        }
        else if(eventNum==3){

        }
        else if(eventNum==4){

        }

    }
    @FXML
    void okay(MouseEvent event) {
        popUpSqaure.setVisible(false);
        popUpText.setVisible(false);
        okayButt.setVisible(false);

        String whatButtonSays = okayButt.getText();
        if(whatButtonSays.equals("proceed")){
            option1Box.setVisible(true);
            option1Text.setVisible(true);
            option2Box.setVisible(true);
            option2Text.setVisible(true);
        }
    }

    public void bigEvent(){
        String whatEvent;
        eventNum++;
        if(eventNum==1){
            okayButt.setText("proceed");
            okayButt.setVisible(true);
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            popUpText.setText("Oh no! \n You need to pee! \n What will you do?");

            option1Text.setText("Find a bottle");
            option2Text.setText("Pee on a tree");

        }
        else if(eventNum==2){
            thunder.setVisible(true);
            okayButt.setText("proceed");
            okayButt.setVisible(true);
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            popUpText.setText("Oh no! \n A thunderstorm! \n What will you do?");

            option1Text.setText("Hide in your shelter");
            option2Text.setText("Hide in the wild");
        }
        else if(eventNum==3){

        }
        else if(eventNum==4){

        }

    }
    @FXML
    void option1Picked(MouseEvent event) {
        optionPicked=1;
        String changeImageTo =("thumbsup.png");
        img = new Image(getClass().getResourceAsStream(changeImageTo));
        thumbsUpGuy.setImage(img);
        
        if(eventNum==1){
            bottle.setVisible(true);
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            squareForFeedback.setVisible(true);
            feedbackText.setVisible(true);
            thumbsUpGuy.setVisible(true);
            tutNext.setVisible(true);

            wStat-=1;
            fStat-=1;


            changeImageTo =("blue"+wStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            waterBar.setImage(img);

            changeImageTo =("green"+fStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            foodBar.setImage(img);

            feedbackText.setText("You lost food and water but \n you found a bottle! \n In the wild animals are very \n territorial. It is always \n best to not spread your \n scent if possible! \n Good choice!");
            tutNext.setText("Complete");

            foodStat.setText(fStat+"/5");
            waterStat.setText(wStat+"/5");

        }
        else if(eventNum==2){
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            squareForFeedback.setVisible(true);
            feedbackText.setVisible(true);
            thumbsUpGuy.setVisible(true);
            tutNext.setVisible(true);

            wStat-=3;
            changeImageTo =("yellow"+wStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            warmthBar.setImage(img);

            feedbackText.setText("You lost your shelter \n but survived the storm! \n In the wild shelter may not always be \n the best option if it is not sturdy.\n Good choice!");
            tutNext.setText("Complete");

        }
        else if(eventNum==3){

        }
        else if(eventNum==4){

        }
    }

    @FXML
    void option2Picked(MouseEvent event) {
    
        if(eventNum==1){
            bear.setVisible(true);
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            squareForFeedback.setVisible(true);
            feedbackText.setVisible(true);
            thumbsUpGuy.setVisible(true);
            tutNext.setVisible(true);

            feedbackText.setText("Oh no! A bear smelt your pee and attacked! \n In the wild animals are very \n territorial. It is always \n best to not spread your \\n scent if possible! \\n Minus 3 health!");
            tutNext.setText("Complete");

            String changeImageTo =("badman.png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            thumbsUpGuy.setImage(img);

            hStat-=4;
            changeImageTo =("red"+hStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            healthBar.setImage(img);

        }
        else if(eventNum==2){

        }
        else if(eventNum==3){

        }
        else if(eventNum==4){

        }
    }


}

