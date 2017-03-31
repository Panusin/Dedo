
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class TimeImage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TimeImage extends KeyAndButton {

    /**
     * Act - do whatever the TimeImage wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */

    int time = 180;
    int count = 0;

    public TimeImage() {
        time = 180;
        GreenfootImage gg = new GreenfootImage("" + time, 15, Color.BLACK, null);
        setImage(gg);

    }

    public void act() {
        count++;

        if (count == 60) {
            time--;
            updateTime();
            count = 0;
        }
    }

    public void updateTime() {

        GreenfootImage gg = new GreenfootImage("" + time, 15, Color.WHITE, null);
        setImage(gg);
    }

    public int getTime() {
        return time;
    }
}
