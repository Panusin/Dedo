
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class MediumMode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediumMode extends KeyAndButton {

    public MediumMode() {
        GreenfootImage img = new GreenfootImage("MEDIUM", 50, Color.GRAY, null);
        setImage(img); //set text for medium mode button
    }

    public int getWidth() {
        return this.getImage().getWidth(); //get width of text
    }
}
