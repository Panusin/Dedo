
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class HardMode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HardMode extends KeyAndButton {

    /**
     * Act - do whatever the HardMode wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HardMode() {
        GreenfootImage img = new GreenfootImage("HARD", 50, Color.GRAY, null); // make image by using greenfoot image
        setImage(img);

    }

    public void act() {
        // Add your action code here.
    }

    public int getWidth() {
        return this.getImage().getWidth();
    }
}
