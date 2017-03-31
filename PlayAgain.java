
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class PlayAgain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayAgain extends KeyAndButton {

    /**
     * Act - do whatever the PlayAgain wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PlayAgain() {
        GreenfootImage img = new GreenfootImage("Replay", 25, Color.BLACK, null);
        //mg.setTransparency(100+Greenfoot.getRandomNumber(100)); 

        setImage(img);
    }

    public void act() {
        // Add your action code here.
    }
}
