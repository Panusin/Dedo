
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NewWorld extends World {

    /**
     * Constructor for objects of class NewWorld.
     *
     */
    int pick = -1;
    Picking picking1 = new Picking(1);
    Picking picking2 = new Picking(2);
    Picking picking3 = new Picking(3); // picking is the pointer to point when select mode
    EasyMode easy = new EasyMode();// add easy mode
    MediumMode medium = new MediumMode();// add mediumm mode
    HardMode hard = new HardMode();// add hard mode
    Keys key = new Keys(); 
    static boolean easyPicked = false;
    static boolean mediumPicked = false;
    static boolean hardPicked = false;
    int count = 0;
    static GreenfootSound eiei = new GreenfootSound("start.wav");

    public NewWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1);
        addObject(easy, getWidth() / 2, getHeight() / 2 - 10);
        addObject(medium, getWidth() / 2, getHeight() / 2 + 70);
        addObject(hard, getWidth() / 2, getHeight() / 2 + 150);
        addObject(new Ninnin(), getWidth() / 2, 162);
        setPaintOrder(KeyAndButton.class, Window.class, Timer.class, Cloud.class, Ninja.class, KeyAndButton.class,
                ClothesLine.class, Wall2.class, Wall.class);

    }

    public void started() { // when start play sound
        eiei.playLoop();
    }

    public void stopped() { // when pause sound will be stop 
        eiei.stop();
    }

    public void act() {
       pickMode();
       addPicking();
    }
    //Greenfoot.setWorld(new MyWorld());
    public void pickMode(){ // to selet mode in game by using keys
         String keyDown = Greenfoot.getKey();
        if (keyDown == "space" || keyDown == "down" || keyDown == "up") {
             // to check if keysDown is greater than 3 or lest than one
            if (keyDown == "up") {
                pick--;
                if (pick < 0) {
                    pick = 2;
                }
            } else {
                pick++;
                if (pick >= 3) {
                    pick = 0;
                }
            }
            
            easyPicked = false;
            mediumPicked = false;
            hardPicked = false;
        }

        if (pick == 0) {// easy mode
            addObject(picking1, getWidth() / 2, getHeight() / 2 - 10); //add picking1 class to be used
            removeObject(picking2);
            removeObject(picking3);
            if (Greenfoot.isKeyDown("enter")) {// enter to select mode to play
                easyPicked = true;
                Greenfoot.setWorld(new RunningWorld());
            }
        }
        
        if (pick == 1) { // medium mode
            addObject(picking2, getWidth() / 2, getHeight() / 2 + 70); //add picking2 class to be used
            removeObject(picking1);
            removeObject(picking3);
            if (Greenfoot.isKeyDown("enter")) {// enter to select mode to play
                mediumPicked = true;
                Greenfoot.setWorld(new RunningWorld());
            }
        }
        
        if (pick == 2) {// hard mode
            addObject(picking3, getWidth() / 2, getHeight() / 2 + 150); //add picking3 class to be used
            removeObject(picking1);
            removeObject(picking2);
            if (Greenfoot.isKeyDown("enter")) {// enter to select mode to play
                hardPicked = true;
                Greenfoot.setWorld(new RunningWorld());
            }
        }

    }
    public void addPicking(){
        count++;
        if (count == 30) { //add how to play every count = 30
            addObject(key, getWidth() / 2, 574);
        }

        if (count == 60) {//remove how to play  every count = 60
            removeObject(key);
            count = 0;
        }
    }
     //3 methods below will be use in running class
    public boolean isEasyMode() { //to retern what player picked game mode 
        return easyPicked;
    }

    public boolean isMediumMode() { //to retern what player picked game mode 
        return mediumPicked;
    }

    public boolean isHardMode() { //to retern what player picked game mode 
        return hardPicked;
    }

}
