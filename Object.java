
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Object here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Object extends Obstacle {

    /**
     * Act - do whatever the Object wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ninja nini = new Ninja(); //set ninja for speed check
    int num; //create non-define variable ready to be used
    static GreenfootSound ss = new GreenfootSound("peopleFall.wav"); //set sound to be play

    public Object() {
        GreenfootImage img = new GreenfootImage("object" + Greenfoot.getRandomNumber(13) + ".png"); //random the image
        img.scale(50, 50); //size the image
        setImage(img);//set image that will be spawn
        ss.setVolume(75);//set the volume of the sound
        ss.play(); // play the souund
    }

    public void act() {
        num = getY() + nini.getRunSpeed(); //define the value of variable
        setLocation(getX(), num += 2); //move the object down constantly
        turn(5); //rotate the object by 5 degree
        if (isAtEdge()) { // check if the object is at the edge of game screen
            getWorld().removeObject(this); // remove object when it's at edge 
        }
    }
}
