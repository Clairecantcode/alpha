package com.example;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.util.Duration;



public class GameScreen {
    @FXML
    private ImageView option1Box;

    @FXML
    private HBox hBoxOption1;

    @FXML
    private HBox HBoxOption2;

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
    private HBox tutButtHBox;
    @FXML
    private ImageView hamster;

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
    boolean isDead;
    String playerName;

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

        playerName= Data.name;

        if(playerName.equals("Tyler") || playerName.equals("tyler")){
            img = new Image(getClass().getResourceAsStream("tylerCub.png"));
            wolfPic.setImage(img);
        }

        fStat=3;
        wStat=3;
        hStat=3;
        sStat=3;
        pointys=5;
        ageStage=1;
        eventNum=0;
        ageStage=1;
        isDead=false;

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
        System.out.println(fStat);
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
        System.out.println(hStat);
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
        System.out.println(sStat);
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
        System.out.println(wStat);
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
            tutButtHBox.setVisible(false);
        }
        //this is all for the big events
        if(eventNum==1){
            
            String changeImageTo ="teenwolf.png";
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            wolfPic.setImage(img);
            if(playerName.equals("Tyler") || playerName.equals("tyler")){
                img = new Image(getClass().getResourceAsStream("tylerTeen.png"));
                wolfPic.setImage(img);
            }
            ageUpStage++;
            feedbackText.setText("You aged up! \n You are now a teen \n and your points have refilled!");
            pointys=5;
            points.setText("Points Available For Year:" +pointys+"/5");
            
            if(ageUpStage==2){
                wStat-=1;
                fStat-=1;
                sStat-=1;
                hStat-=1;
                didYouDie();
            

                feedbackText.setVisible(false);
                squareForFeedback.setVisible(false);
                bottle.setVisible(false);
                tutNext.setVisible(false);
                tutButtHBox.setVisible(false);
                thumbsUpGuy.setVisible(false);
                bear.setVisible(false);
                

            waterStat.setText(wStat+"/5");
            foodStat.setText(fStat+"/5");
            healthStat.setText(hStat+"/5");
            warmthStat.setText(sStat+"/5");
            
            
            changeImageTo =("blue"+wStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            waterBar.setImage(img);
            System.out.println(wStat);
            System.out.println(changeImageTo);
            changeImageTo =("green"+fStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            foodBar.setImage(img);
            System.out.println(changeImageTo);
            System.out.println(fStat);
            changeImageTo =("red"+hStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            healthBar.setImage(img);
            System.out.println(changeImageTo);
            System.out.println(hStat);
            changeImageTo =("yellow"+sStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            warmthBar.setImage(img);
            System.out.println(changeImageTo);
            System.out.println(sStat);
            ageStage=0;
            }
        
            
        }
        else if(eventNum==2){
            System.out.println(ageUpStage);
            String changeImageTo ="yawolf.png";
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            wolfPic.setImage(img);
            if(playerName.equals("Tyler") || playerName.equals("tyler")){
                img = new Image(getClass().getResourceAsStream("tylerYA.png"));
                wolfPic.setImage(img);
            }
            ageUpStage++;
            feedbackText.setText("You aged up! \n You are now a young adult\n and your points have refilled!");
            pointys=5;
            points.setText("Points Available For Year:" +pointys+"/5");
            if(ageUpStage==4){
                wStat-=1;
                fStat-=1;
                sStat-=1;
                hStat-=1;
                didYouDie();
                

                feedbackText.setVisible(false);
                squareForFeedback.setVisible(false);
                tutNext.setVisible(false);
                tutButtHBox.setVisible(false);
                thumbsUpGuy.setVisible(false);   
                thunder.setVisible(false);

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
            changeImageTo =("yellow"+sStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            warmthBar.setImage(img);
            
         }
        }
        else if(eventNum==3){
            System.out.println(ageUpStage);
            String changeImageTo ="awolf.png";
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            wolfPic.setImage(img);
            if(playerName.equals("Tyler") || playerName.equals("tyler")){
                img = new Image(getClass().getResourceAsStream("tylerA.png"));
                wolfPic.setImage(img);
            }
            ageUpStage++;
            feedbackText.setText("You aged up! \n You are now a young adult\n and your points have refilled!");
            pointys=5;
            points.setText("Points Available For Year:" +pointys+"/5");
        
            if(ageUpStage==6){
                wStat-=1;
                fStat-=1;
                sStat-=1;
                hStat-=1;
                didYouDie();

                

                feedbackText.setVisible(false);
                squareForFeedback.setVisible(false);
                tutNext.setVisible(false);
                tutButtHBox.setVisible(false);
                thumbsUpGuy.setVisible(false);
                bear.setVisible(false);
            }
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
            changeImageTo =("yellow"+sStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            warmthBar.setImage(img);
            

        }
        else if(eventNum==4){
            hamster.setVisible(true);

            System.out.println(ageUpStage);
            String changeImageTo ="alphawolf.png";
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            wolfPic.setImage(img);
            if(playerName.equals("Tyler") || playerName.equals("tyler")){
                img = new Image(getClass().getResourceAsStream("tylerAlpha.png"));
                wolfPic.setImage(img);
            }
            ageUpStage++;
            feedbackText.setText("You aged up! \n You are now ALPHA \n You won!");
        
            if(ageUpStage==8){
                feedbackText.setVisible(false);
                squareForFeedback.setVisible(false);
                foodButt.setVisible(false);
                waterButt.setVisible(false);
                healthButt.setVisible(false);
                shelterButt.setVisible(false);
                thumbsUpGuy.setVisible(false);
                tutNext.setVisible(false);
                PauseTransition delay = new PauseTransition(Duration.seconds(5));
                delay.setOnFinished(event2 ->  System.exit(0));
                delay.play();
            }
           
        }

    }
    public void closeAfterDelay(Stage stage) {
        PauseTransition delay = new PauseTransition(Duration.seconds(5));
        delay.setOnFinished(event -> stage.close());
        delay.play();
    }

    @FXML
    void okay(MouseEvent event) {
        popUpSqaure.setVisible(false);
        popUpText.setVisible(false);
        okayButt.setVisible(false);

        if(isDead==true){
            System.exit(0);
        }

        String whatButtonSays = okayButt.getText();
        if(whatButtonSays.equals("proceed")){
            option1Box.setVisible(true);
            option1Text.setVisible(true);
            hBoxOption1.setVisible(true);
            option2Box.setVisible(true);
            option2Text.setVisible(true);
            HBoxOption2.setVisible(true);
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

            option1Text.setText("Hide in the wild");
            option2Text.setText("Hide in your shelter");
        }
        else if(eventNum==3){
            okayButt.setText("proceed");
            okayButt.setVisible(true);
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            bear.setVisible(true);
            popUpText.setText("Oh no! \n Bears want your food! \n What will you do?");

            option1Text.setText("Run and let them eat your food");
            option2Text.setText("Fight back");
        }
        else if(eventNum==4){
            okayButt.setText("proceed");
            okayButt.setVisible(true);
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            wolf2.setVisible(true);
            wolf3.setVisible(true);
            popUpText.setText("Some wolves are threatening you, \n but if you choose correctly \n you can become their ALPHAAAAA!");

            option1Text.setText("Show them how much of \n a boss you are");
            option2Text.setText("Pee on them");
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
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(true);
            feedbackText.setVisible(true);
            thumbsUpGuy.setVisible(true);
            tutNext.setVisible(true);
            tutButtHBox.setVisible(true);

            wStat-=1;
            fStat-=1;

            didYouDie();


            changeImageTo =("blue"+wStat+".png");
            System.out.println(changeImageTo);
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
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(true);
            feedbackText.setVisible(true);
            thumbsUpGuy.setVisible(true);
            tutNext.setVisible(true);
            tutButtHBox.setVisible(true);

            sStat-=3;
            didYouDie();
            
            changeImageTo =("yellow"+sStat+".png");
            System.out.println(changeImageTo);
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            warmthBar.setImage(img);
            warmthStat.setText(sStat+"/5");
            

            feedbackText.setText("You lost your shelter \n but survived the storm! \n In the wild shelter may not always be \n the best option if it is not sturdy.\n Good choice!");
            tutNext.setText("Complete");

        }
        else if(eventNum==3){
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(true);
            feedbackText.setVisible(true);
            thumbsUpGuy.setVisible(true);
            tutNext.setVisible(true);
            tutButtHBox.setVisible(true);

            sStat-=1;
            fStat-=2;
            didYouDie();

            changeImageTo =("yellow"+sStat+".png");
            System.out.println(changeImageTo);
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            warmthBar.setImage(img);
            warmthStat.setText(sStat+"/5");
            changeImageTo =("green"+fStat+".png");
            System.out.println(changeImageTo);
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            foodBar.setImage(img);
            foodStat.setText(fStat+"/5");
            

            feedbackText.setText("The bear took your food and destoryed your shelter! \n In the wild never try to fight agianst animals, \n its better to be cold and alive than dead! \n Good choice!");
            tutNext.setText("Complete");

        }
        else if(eventNum==4){
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(true);
            feedbackText.setVisible(true);
            thumbsUpGuy.setVisible(true);
            tutNext.setVisible(true);
            tutButtHBox.setVisible(true);

            feedbackText.setText("You have become THE alpha! \n This event is just for fun \n please do not try to befriend wild \n animals");
            tutNext.setText("Complete");
        }
    }

    @FXML
    void option2Picked(MouseEvent event) {
        String changeImageTo =("badman.png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            thumbsUpGuy.setImage(img);
    
        if(eventNum==1){
            bear.setVisible(true);
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(true);
            feedbackText.setVisible(true);
            thumbsUpGuy.setVisible(true);
            tutNext.setVisible(true);
            tutButtHBox.setVisible(true);

            feedbackText.setText("Oh no! A bear smelt your pee and attacked! \n In the wild animals are very \n territorial. It is always \n best to not spread your \n scent if possible! \n Minus 3 health!");
            tutNext.setText("Complete");

            hStat-=4;
            if(hStat>0){
            changeImageTo =("red"+hStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            healthBar.setImage(img);

            healthStat.setText(hStat+"/5");
            }
            
            

        }
        else if(eventNum==2){
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(true);
            feedbackText.setVisible(true);
            thumbsUpGuy.setVisible(true);
            tutNext.setVisible(true);
            tutButtHBox.setVisible(true);

            feedbackText.setText("Oh no! Your shelter fell on you breaking your leg! \n In the wild shelter may not always be \n the best option if it is not sturdy. \n Minus 3 health and shelter");
            tutNext.setText("Complete");

            hStat-=3;
            sStat-=3;
            
            
            if(hStat>0 && sStat>0){
            changeImageTo =("red"+hStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            healthBar.setImage(img);

            changeImageTo =("yellow"+sStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            warmthBar.setImage(img);
            }

            healthStat.setText(hStat+"/5");
            warmthStat.setText(sStat+"/5");
            
            

        }
        else if(eventNum==3){
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(true);
            feedbackText.setVisible(true);
            thumbsUpGuy.setVisible(true);
            tutNext.setVisible(true);
            tutButtHBox.setVisible(true);

            feedbackText.setText("The bear killed you! \n Never think you are stronger than wild animals, \n it will not end well :(");
            hStat-=5;
            tutNext.setText("Complete");

            if(hStat>0){
            changeImageTo =("red"+hStat+".png");
            img = new Image(getClass().getResourceAsStream(changeImageTo));
            healthBar.setImage(img);
            }

            healthStat.setText(hStat+"/5");
            

        }
        else if(eventNum==4){
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(true);
            feedbackText.setVisible(true);
            thumbsUpGuy.setVisible(true);
            tutNext.setVisible(true);
            tutButtHBox.setVisible(true);

            feedbackText.setText("NEVER fight animals \n you will die! \n also dont befriend them but thats besides the point...");
            tutNext.setText("Complete");
        }
    }

    public void didYouDie(){
        if(hStat<=0){
            isDead=true;
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(false);
            feedbackText.setVisible(false);
            thumbsUpGuy.setVisible(false);
            tutNext.setVisible(false);
            tutButtHBox.setVisible(false);
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            okayButt.setVisible(true);
            popUpText.setText("You got too injured and died! \n Make sure to heal in the wild!");
        }
        else if(sStat<=0){
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(false);
            feedbackText.setVisible(false);
            thumbsUpGuy.setVisible(false);
            tutNext.setVisible(false);
            tutButtHBox.setVisible(false);
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            okayButt.setVisible(true);
            isDead=true;
            popUpText.setText("You got too cold and froze! \n Make sure to keep up your body temp!");
        }
        else if(wStat<=0){
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(false);
            feedbackText.setVisible(false);
            thumbsUpGuy.setVisible(false);
            tutNext.setVisible(false);
            tutButtHBox.setVisible(false);
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            okayButt.setVisible(true);
            isDead=true;
            popUpText.setText("You dehydrated to death! \n Water is the most important \n resource \n in the wild!");
        }
        else if(fStat<=0){
            option1Box.setVisible(false);
            option1Text.setVisible(false);
            hBoxOption1.setVisible(false);
            option2Box.setVisible(false);
            option2Text.setVisible(false);
            HBoxOption2.setVisible(false);
            squareForFeedback.setVisible(false);
            feedbackText.setVisible(false);
            thumbsUpGuy.setVisible(false);
            tutNext.setVisible(false);
            tutButtHBox.setVisible(false);
            popUpSqaure.setVisible(true);
            popUpText.setVisible(true);
            okayButt.setVisible(true);
            isDead=true;
            popUpText.setText("You starved to death! \n Food is the second most important resource \n in the wild!");
        } else {
            System.out.println("I am alive!");
        }
        
    }

}

