
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
    static int highScore;
    static String playername;
    boolean check1;
    int check;
    String inputValue;

    public HighScore() {
        int score = (Score.score);
        if (highScore == 0) {
            PlayerName();
            highScore = score;
            GreenfootImage gg = new GreenfootImage(playername + "\nNew high score:  " + highScore, 20, Color.BLACK, null);
            setImage(gg);
        }

        if (score > highScore && highScore != 0) {
            PlayerName();
            highScore = score;
            GreenfootImage gg = new GreenfootImage(playername+ "\nNew high score:  " + highScore, 20, Color.BLACK, null);
            setImage(gg);
        }

        if (score < highScore && highScore != 0) {
            GreenfootImage gg = new GreenfootImage(playername+ "\nHigh score: " + highScore + "\n\n Your score:  " + score, 20, Color.BLACK, null);
            setImage(gg);
        }

    }
    
    
    public void PlayerName(){
        check1 = false;
        while(check1!=true){
        if(check==0 || check>8){
          inputValue = JOptionPane.showInputDialog("New high score !! , Please input your name (1-8 characters)");
          check = inputValue.length();
          if(check==0){
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
