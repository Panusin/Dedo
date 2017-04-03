
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Keys here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Keys extends KeyAndButton {

    /**
     * Act - do whatever the Keys wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Keys() {
          // make image to show how to play by using greenfoot image
        GreenfootImage img = new GreenfootImage("Press [ spacebar ] or Up and Down button to slide " + "\n and press Enter to select", 20, Color.BLACK, null);
        img.setTransparency(150);
        setImage(img);

    }

    public void act() {
        // Add your action code here.
    }
}
