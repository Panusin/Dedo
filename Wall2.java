
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wall2 extends Wall {

    /**
     * Act - do whatever the Wall2 wants to do. This method is called whenever
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
