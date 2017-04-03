
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Star extends Actor {

    /**
     * Act - do whatever the Sun wants to do. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */
    Ninja nini = new Ninja(); //set ninja for speed check
    GreenfootSound point = new GreenfootSound("collectSun.wav"); //set sound to be played

    public Star() {
        GreenfootImage img = getImage(); //get image of an object
        img.scale(20, 20); //resize the image
        setImage(img); //set new image for an object
    }

    public void act() {
        turn(5); //rotate image by 5 degree
        setLocation(getX(), getY() + nini.getRunSpeed() / 2); //move the object down constantly

        if (isTouching(Ninja.class)) { //happen when touch ninja
            point.setVolume(90); //set the volume for an object
            point.play(); // play the sound
            World myWorld = getWorld(); //get world that object is in
            RunningWorld world = (RunningWorld) myWorld; //set world
            Score score = world.getScore(); //use method in world
            score.addScore(100);// add 100 points to score
            getWorld().removeObject(this); //remove object when touch ninja
        } else if (isAtEdge()) { // check if the object is at the edge of game screen
            getWorld().removeObject(this); // remove object when it's at edge 
        }

    }
}
