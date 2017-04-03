
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import javax.swing.*;
/**
 * Write a description of class HighScore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HighScore extends Actor {

    /**
     * Act - do whatever the HighScore wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Actor score = new Score();
    static int highScore; // create non-define variable
    static String playername;
    boolean check1;
    int check;
    String inputValue;
    public HighScore() {
        int score = (Score.score); //define value from class score
        if (highScore == 0) { //this will work when user first start the game, set new highscore for the first play
            PlayerName();
            highScore = score; 
            GreenfootImage gg = new GreenfootImage(playername +"\nNew high score:  " + highScore, 20, Color.BLACK, null);
            setImage(gg);
        }

        if (score > highScore && highScore != 0) { //if new score is higher than highscore, replace it with new score
            PlayerName();
            highScore = score;
            GreenfootImage gg = new GreenfootImage(playername + "\n New high score:  " + highScore, 20, Color.BLACK, null);
            setImage(gg);
        }

        if (score < highScore && highScore != 0) { //if highscore is higher than new score, show both hightscore along with new score
            GreenfootImage gg = new GreenfootImage(playername + "\n High score: " + highScore + "\n\n Your score:  " + score, 20, Color.BLACK, null);
            setImage(gg);
        }

    }
    
     public void PlayerName(){ // method to get name from user who make a high score
        check1 = false;
        while(check1!=true){
        if(check==0 || check>8){// user can in put only 0 - 8 alphabets
          inputValue = JOptionPane.showInputDialog("New high score !! , Please input your name (1-8 characters)");
          check = inputValue.length();
          if(check==0){ // if user did not input their name if will be Untitled instaed
              inputValue = "Untitled";
              check = inputValue.length();
            }
        }
        else{
            check1 = true;
        }
        playername = inputValue;
      } 
   }

}


