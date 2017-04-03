
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

    int time = 180;//set time to 180
    int count = 0;//set count to 0

    public TimeImage() {
        time = 180; 
        GreenfootImage gg = new GreenfootImage("" + time, 15, Color.BLACK, null);
        setImage(gg); //show time text
    }

    public void act() {
        count++; //increase count by 1 overtime
        if (count == 60) { //when count is 60, decrease time by 1, undate it, and reset count to 0  
            time--;
            updateTime();
            count = 0;
        }
    }

    public void updateTime() {
        GreenfootImage gg = new GreenfootImage("" + time, 15, Color.WHITE, null);
        setImage(gg); //show time text
    }

    public int getTime() {
        return time;
    }
}
