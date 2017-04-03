
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Window extends Decorate {

    /**
     * Act - do whatever the Window wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ninja nini = new Ninja(); //set ninja for speed check

    public Window() {
        GreenfootImage img = new GreenfootImage("Window" + Greenfoot.getRandomNumber(11) + ".png"); //random image for object
        img.scale(100, 100); //resize the image
        setImage(img); //set image for an object
    }

    public void act() {
        setLocation(getX(), getY() + nini.getRunSpeed()); //move the object down constantly
        if (isAtEdge()) { // check if the object is at the edge of game screen
            getWorld().removeObject(this); // remove object when it's at edge 
        }
    }
}
