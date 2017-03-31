
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RBalcony here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RBalcony extends Obstacle {

    /**
     * Act - do whatever the RBalcony wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ninja nini = new Ninja();

    public RBalcony() {
        GreenfootImage img = new GreenfootImage("balconyR" + Greenfoot.getRandomNumber(15) + ".png");
        img.scale(60, 100);
        setImage(img);
    }

    public void act() {
        setLocation(getX(), getY() + nini.getRunSpeed());
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
