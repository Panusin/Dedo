
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wall extends Actor {

    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ninja nini = new Ninja(); //set ninja for speed check

    public void act() {
        setLocation(getX(), getY() + nini.getRunSpeed()); //move the object down constantly
        if (isAtEdge()) { // check if the object is at the edge of game screen
            getWorld().removeObject(this); // remove object when it's at edge 
        }
    }
}
