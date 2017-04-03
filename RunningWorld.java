
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;
import java.awt.Color;

/**
 * Write a description of class MyWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RunningWorld extends World {

    private int time = 0;
    int count = 0;
    int decPosition[] = {35, 368};
    private int ranNum;
    Ninja nini = new Ninja();
    Score score = new Score();
    NewWorld newWorld = new NewWorld();
    SpaceToJump spacebar = new SpaceToJump();
    ShowGetPoint point = new ShowGetPoint(); //show how to earn point
    TimeImage showTime = new TimeImage();

    public RunningWorld() {
        // Create a new world with 400x600 cells with a cell size of 1x1 pixels.
        super(400, 600, 1);
        addObject(new Wall(), 26, 300);
        addObject(new Wall(), 375, 300);
        addObject(nini, 100, 500); //add ninja class
        addObject(new Timer(), getWidth() / 2, 80);
        addObject(showTime, getWidth() / 2, 82);
        addObject(score, getWidth() / 2, 100);
        newWorld.eiei.setVolume(60);
        setPaintOrder(Cloud.class, Window.class, Ninja.class, KeyAndButton.class,
                ClothesLine.class, Wall2.class, Wall.class); // to set classes will always be show on the top

    }

    public void started() {
        newWorld.eiei.play();
    }

    public void stopped() {
        newWorld.eiei.stop();
    }

    public void act() {
        easyMode();
        mediumMode();
        hardMode();
        if (nini.isDead() || showTime.getTime() == 0) { // stop the sounds when player is dead
            newWorld.eiei.stop();
            Prize prize = new Prize();
            prize.fall.stop();
            Object ob = new Object();
            ob.ss.stop();
            Greenfoot.setWorld(new GameOverWorld()); // go to scoreborad (GameOverWorld)
        }

        if (count % 30 == 0) {
            addObject(spacebar, getWidth() / 2, 574); // add show string how to jump
        }

        if (count % 60 == 0) {
            removeObject(spacebar); // remove show how to jump
            addObject(point, getWidth() / 2, 140); // add show string how to earn points
        }

        if (count % 90 == 0) {
            removeObject(point); //remove show how to earn points
        }
        
        if (count == 601) { //remove show how to jump and how to earn points
            removeObject(spacebar);
            removeObject(point);
        } else {
            count++;
        }

    }

    public NewWorld getNewWorld() {
        return newWorld;
    }

    public Score getScore() {
        return score;
    }

    public void easyMode() {// mode picked
        if (Greenfoot.isKeyDown("escape")) { //type escape to exite the game mode
            Greenfoot.setWorld(new NewWorld());
        }

        if (newWorld.isEasyMode()) { //return true if easymode was picked
            time++;
            nini.setRunSpeed(5);
            nini.setJumpSpeed(8, 1);
            if (time == 1 || time == 25) { //add wall on lift and right side 
                addObject(new Wall(), 26, -100);
                addObject(new Wall(), 375, -100);
            }

            if (time == 10 && Greenfoot.getRandomNumber(100) < 5) { //add clothes line to by random a chance
                addObject(new ClothesLine(), getWidth() / 2, 0);

            }

            if (time == 20 || time == 40) { //add clouds by using check time 
                addObject(new Cloud(), getWidth() / 2, Greenfoot.getRandomNumber(20) + 50);
            }

            if (time == 30 && (Greenfoot.getRandomNumber(10) < 8)) {//every time = 30 and have 80% to add windows
                addObject(new Window(), decPosition[Greenfoot.getRandomNumber(decPosition.length)], -100);
            }

            if (time == 20 || time == 40) {// add wall every time = 20 and 40
                addObject(new Wall2(), 26, -100);
                addObject(new Wall2(), 375, -100);

            }

            if (time == 60) { //every time = 60 add classes below
                ranNum = Greenfoot.getRandomNumber(100); // random number between 0-99
                if (ranNum < 50) {// if the number less than 50 wo add balcony
                    if (ranNum < 25) {
                        addObject(new LBalcony(), 106, -100);//add left balcony
                    } else {
                        addObject(new RBalcony(), 295, -100);//add right balony
                    }
                }

                if (ranNum < 10) {// if tne number less than 10 then add prize that have point
                    addObject(new Prize(), getWidth() / 2, 0);
                }

                if (ranNum < 40) {//if the number less than 40 will add stars that have points
                    if (ranNum < 20) {
                        addObject(new Star(), 106, 0); //star falling on left side
                    } else {
                        addObject(new Star(), 295, 0); //star falling on right side
                    }
                }

                if (ranNum < 30) { // add falling stuff to block ninja by the number to be added
                    if (ranNum < 15) {
                        addObject(new Object(), getWidth() / 2, 0);
                    }
                }

                time = 0;
            }

        }
    }

    public void mediumMode() {// they are look the same as easyMode by increse more speed
        if (Greenfoot.isKeyDown("escape")) {
            Greenfoot.setWorld(new NewWorld());
        }

        if (newWorld.isMediumMode()) {
            time++;
            nini.setRunSpeed(8);
            nini.setJumpSpeed(10, 1);
            if (time == 1 || time == 25) {
                addObject(new Wall(), 26, -100);
                addObject(new Wall(), 375, -100);
            }

            if (time == 10 && Greenfoot.getRandomNumber(100) < 5) {
                addObject(new ClothesLine(), getWidth() / 2, 0);

            }

            if (time == 20 || time == 40) {
                addObject(new Cloud(), getWidth() / 2, Greenfoot.getRandomNumber(20) + 50);
            }

            if (time == 30 && (Greenfoot.getRandomNumber(10) < 8)) {
                addObject(new Window(), decPosition[Greenfoot.getRandomNumber(decPosition.length)], -100);
            }

            if (time == 50) {
                addObject(new Wall2(), 26, -100);
                addObject(new Wall2(), 375, -100);

            }

            if (time == 60 || time == 30) { //
                ranNum = Greenfoot.getRandomNumber(100);

                if (ranNum < 50) {
                    if (ranNum < 25) {
                        addObject(new LBalcony(), 106, -100);
                    } else {
                        addObject(new RBalcony(), 295, -100);
                    }
                }

                if (ranNum < 10) {
                    addObject(new Prize(), getWidth() / 2, 0);
                }

                if (ranNum < 40) {
                    if (ranNum < 20) {
                        addObject(new Star(), 106, 0);
                    } else {
                        addObject(new Star(), 295, 0);
                    }
                }

                if (ranNum < 10) {
                    if (ranNum < 5) {
                        addObject(new Object(), getWidth() / 2, 0);

                    }
                }

                if (time == 60) { 
                    time = 0;
                }
            }
        }
    }

    public void hardMode() {// they are look the same as mediumMode by increse more speed and more chance to be dead
        if (Greenfoot.isKeyDown("escape")) {
            Greenfoot.setWorld(new NewWorld());
        }

        if (newWorld.isHardMode()) {
            time++;
            nini.setRunSpeed(10);
            nini.setJumpSpeed(12, 1);

            if (time == 1 || time == 30) {
                addObject(new Wall(), 26, -100);
                addObject(new Wall(), 375, -100);
            }

            if (time == 10 && Greenfoot.getRandomNumber(100) < 5) {
                addObject(new ClothesLine(), getWidth() / 2, 0);

            }

            if (time == 20 || time == 40) {
                addObject(new Cloud(), getWidth() / 2, Greenfoot.getRandomNumber(20) + 50);
            }

            if (time == 30 || time == 60) {
                addObject(new Window(), decPosition[Greenfoot.getRandomNumber(decPosition.length)], 0);
            }

            if (time == 10 || time == 50) {
                addObject(new Wall2(), 26, -100);
                addObject(new Wall2(), 375, -100);

            }

            if (time == 20 || time == 40 || time == 60) { //
                ranNum = Greenfoot.getRandomNumber(100);
                if (ranNum < 50) {

                    if (ranNum < 25) {
                        addObject(new LBalcony(), 106, -100);
                    } else {
                        addObject(new RBalcony(), 295, -100);
                    }
                }

                if (ranNum < 10) {
                    addObject(new Prize(), getWidth() / 2, 0);
                }
                if (ranNum < 40) {
                    if (ranNum < 20) {
                        addObject(new Star(), 106, 0);
                    } else {
                        addObject(new Star(), 295, 0);
                    }
                }

                if (ranNum < 10) {

                    addObject(new Object(), getWidth() / 2, 0);

                }
                
                if (time == 60) {
                    time = 0;
                }

            }

        }

    }
}
