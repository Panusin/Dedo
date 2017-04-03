
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class GoBack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GoBack extends KeyAndButton {

    /**
     * Act - do whatever the GoBack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GoBack() {
        GreenfootImage img = new GreenfootImage("Main Menu", 25, Color.BLACK, null);
        setImage(img); //set text for go back to main menu
    }

    public void act() {
        // Add your action code here.
    }
}
