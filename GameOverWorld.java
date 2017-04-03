
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyNewWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameOverWorld extends World {

    /**
     * Constructor for objects of class MyNewWorld.
     *
     */
    int count;
    int pick = 10;
    Keys key = new Keys();
    Picking picking10 = new Picking(10);
    Picking picking11 = new Picking(11);
    NewWorld newWorld = new NewWorld();

    public GameOverWorld() {
        super(400, 600, 1);
        addObject(new GameOver(), getWidth() / 2, 120);
        addObject(new HighScore(), getWidth() / 2, 250);
        addObject(new GoBack(), getWidth() / 2 - 80, 404);
        addObject(new PlayAgain(), getWidth() / 2 + 80, 404);
        newWorld.eiei.play();
    }

    public void started() {
        NewWorld.eiei.play();
    }

    public void stopped() {
        NewWorld.eiei.stop();
    }

    public void act() {

        String keyDown = Greenfoot.getKey();
        if (keyDown == "space" || keyDown == "down" || keyDown == "up") {

            if (keyDown == "up") {
                pick--;
                if (pick < 10) {
                    pick = 11;
                }
            } else {
                pick++;
                if (pick > 11) {
                    pick = 10;
                }
            }

        }

        if (pick == 10) {// main manu
            addObject(picking10, getWidth() / 2 - 80, 377);
            removeObject(picking11);
            if (Greenfoot.isKeyDown("enter")) {
                NewWorld.easyPicked = false;
                NewWorld.mediumPicked = false;
                NewWorld.hardPicked = false;
                Greenfoot.setWorld(newWorld);

            }
        }

        if (pick == 11) {
            addObject(picking11, getWidth() / 2 + 80, 377);
            removeObject(picking10);

            if (Greenfoot.isKeyDown("enter")) {
                Greenfoot.setWorld(new RunningWorld());
            }
        }

        count++;
        if (count == 30) {
            addObject(key, getWidth() / 2, 574);
        }

        if (count == 60) {
            removeObject(key);
            count = 0;
        }

    }

    public NewWorld getNewWorld() {
        return newWorld;
    }

    /**
     * Prepare the world for the start of the program. That is: create the
     * initial objects and add them to the world.
     */
}
