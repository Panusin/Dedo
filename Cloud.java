
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cloud extends Decorate {

    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time = 0; //set time to 0

    public Cloud() {
        GreenfootImage img = new GreenfootImage("cloud" + (Greenfoot.getRandomNumber(2) + 1) + ".png"); //random image for object
        setImage(img); //set image for an object
    }

    public void act() {
        time++; //increase time by 1
        if (time == 50) { //happen when time is 50
            getWorld().removeObject(this); // remove object when time is 50
            time = 0; //reset time to 0
        }
    }
}
