
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
    static int highScore; // create non-define variable

    public HighScore() {
        int score = (Score.score); //define value from class score
        if (highScore == 0) { //this will work when user first start the game, set new highscore for the first play
            highScore = score; 
            GreenfootImage gg = new GreenfootImage("New high score:  " + highScore, 20, Color.BLACK, null);
            setImage(gg);
        }

        if (score > highScore && highScore != 0) { //if new score is higher than highscore, replace it with new score
            highScore = score;
            GreenfootImage gg = new GreenfootImage("New high score:  " + highScore, 20, Color.BLACK, null);
            setImage(gg);
        }

        if (score < highScore && highScore != 0) { //if highscore is higher than new score, show both hightscore along with new score
            GreenfootImage gg = new GreenfootImage("High score: " + highScore + "\n\n Your score:  " + score, 20, Color.BLACK, null);
            setImage(gg);
        }

    }

}
