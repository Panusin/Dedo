
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Timer extends KeyAndButton {

    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time = 0, timer = 0;
    int degree[] = {45, -45};

    public Timer() {
        GreenfootImage img = getImage();
        img.scale(30, 30);

    }

    public void act() {

    }

}
