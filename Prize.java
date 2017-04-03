
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Prize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prize extends Actor {

    /**
     * Act - do whatever the Prize wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ninja nini = new Ninja(); //set ninja for speed check

    int speed = nini.getRunSpeed(); //get speed of ninja 
    int time = 0; //set time to 0
    int ran; //declare variable
    GreenfootSound point = new GreenfootSound("collectAl.wav"); //set sound
    static GreenfootSound fall = new GreenfootSound("fall.wav"); //set sound

    public Prize() {
        GreenfootImage img = getImage(); //get image of an object
        img.scale(50, 60); //resize the image
        setImage(img); //set new image for this object
        fall.setVolume(80); //set volume for the sound
        fall.play(); //play the sound
    }

    public void act() {
        time++; //incresae time by 1 overtime

        if (time == 20) { // happen when time is 20
            ran = Greenfoot.getRandomNumber(100); // random number of variable ran
            time = 0; //reset time to 0
        }

        if (ran < 50 || getX() == 100) { //happen when ran is less than 50 or object is at X of 100
            setLocation(getX() + speed / 2, getY() + speed); //move object to right and going down constantly
        } else if (ran > 50 || getX() == 300) {//happen when ran is more than 50 or object is at X of 300
            setLocation(getX() - speed / 2, getY() + speed); //move object to left and going down constantly
        }

        if (isTouching(Ninja.class)) { //happen when touch ninja
            point.setVolume(90); //set the volume for an object
            point.play(); // play the sound
            fall.stop(); //stop sound of fall
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
