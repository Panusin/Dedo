
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
    Ninja nini = new Ninja();

    int speed = nini.getRunSpeed();
    int time = 0;
    int ran;
    GreenfootSound point = new GreenfootSound("collectAl.wav");
    static GreenfootSound fall = new GreenfootSound("fall.wav");

    public Prize() {
        GreenfootImage img = getImage();
        img.scale(50, 60);
        setImage(img);
        fall.setVolume(80);
        fall.play();
    }

    //speed = nini.getRunSpeed();
    public void act() {
        time++;

        if (time == 20) {
            ran = Greenfoot.getRandomNumber(100);
            time = 0;
        }

        if (ran < 50 || getX() <= 100) {
            setLocation(getX() + speed / 2, getY() + speed);
        } else if (ran > 50 || getX() >= 300) {
            setLocation(getX() - speed / 2, getY() + speed);
        }

        if (isTouching(Ninja.class)) {
            point.setVolume(90);
            fall.stop();
            point.play();
            World myWorld = getWorld();
            RunningWorld world = (RunningWorld) myWorld;
            Score score = world.getScore();
            score.addScore(100);
            getWorld().removeObject(this);

        } else if (isAtEdge()) {
            getWorld().removeObject(this);
        }

    }

}
