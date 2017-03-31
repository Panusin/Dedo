
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

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

    public HighScore() {
        int score = (Score.score);
        if (highScore == 0) {
            highScore = score;
            GreenfootImage gg = new GreenfootImage("New high score:  " + highScore, 20, Color.BLACK, null);
            setImage(gg);
        }

        if (score > highScore && highScore != 0) {
            highScore = score;
            GreenfootImage gg = new GreenfootImage("New high score:  " + highScore, 20, Color.BLACK, null);
            setImage(gg);
        }

        if (score < highScore && highScore != 0) {
            GreenfootImage gg = new GreenfootImage("High score: " + highScore + "\n\n Your score:  " + score, 20, Color.BLACK, null);
            setImage(gg);
        }

    }

}
