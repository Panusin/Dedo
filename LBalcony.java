
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LBalcony here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LBalcony extends Obstacle {

    /**
     * Act - do whatever the LBalcony wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ninja nini = new Ninja(); //set ninja for speed check

    public LBalcony() {
        GreenfootImage img = new GreenfootImage("balconyL" + Greenfoot.getRandomNumber(15) + ".png"); //random the image of left balcony
        img.scale(60, 100); //size the image
        setImage(img); //set image of object that will be spawn
    }

    public void act() {
        setLocation(getX(), getY() + nini.getRunSpeed()); //move the object down constantly
        if (isAtEdge()) { // check if it's at edge of the game screen
            getWorld().removeObject(this); //remve object when it's at edge
        }
    }
}
