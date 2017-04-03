
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Score here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Score extends KeyAndButton {

    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int time;
    static int score;
    Ninja nini = new Ninja();

    public Score() {
        GreenfootImage gg = new GreenfootImage("score " + score, 15, Color.BLACK, null); // draw score word on the image 
        setImage(gg);
        score = 0;
    }

    public void act() {
        time++;
        //increse score by plud run speed number( more speed would get more points)  
        if (time == 10) {

            if (score <= 1000) {
                score = score + nini.getRunSpeed() / 2;
            } else {
                score = score + nini.getRunSpeed() / 2;
            }
            updateScore();// update the score every time
            time = 0;
        }

    }

    public void updateScore() {// method to update the score
        GreenfootImage gg = new GreenfootImage("score " + score, 15, Color.BLACK, null);
        setImage(gg);

    }

    public void addScore(int x) {// this method will be used in Prize class and Star class
        score += x;
        updateScore();
    }

    public int getScore() { // get number of score
        return score;
    }
}
