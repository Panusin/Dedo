
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ninja extends Actor {

    private int time = 0;
    static int vSpeedX = 0; //8
    static int vSpeedY = 0; //1
    static int runSpeed = 0;
    private boolean leftToRight;
    private boolean rightToLeft;
    private int frame = 0;

    public Ninja() {
        GreenfootImage img = getImage(); //get image
        img.scale(50, 50);// set image scale
        setRotation(90);// rotate to image
        setImage(img);// set image back
        //setJumpSpeed(8,1);
        //setRunSpeed(5);
    }

    public Ninja(String imagefile) {
        GreenfootImage img = new GreenfootImage(imagefile);
        img.scale(50, 50);
        setImage(img);
    }

    public void act() {
        animationRun();
        checkKey();
        fall();
        jump();
        setToOnWallPosition();
        if (isDead()) {
            Greenfoot.playSound("dead.wav");
        }

    }

    public void checkKey() {// check plsyer can be jumoping or not and can jump only on the wall
        //jump To Left wall 
        if (Greenfoot.isKeyDown("space") && rightToLeft == false && onRightWall()) {
            setLocation(getX() - 1, getY());
            playSound("jump.wav");
            rightToLeft = true;

        }
        //jump To right wall;
        if (Greenfoot.isKeyDown("space") && leftToRight == false && onLeftWall()) {
            setLocation(getX() + 1, getY());
            playSound("jump.wav");
            leftToRight = true;

        }

    }

    public void setImage(String name, int rota) { // method to set image and rotate them
        GreenfootImage img = new GreenfootImage(name);
        img.scale(50, 50);
        setRotation(rota);
        setImage(img);
    }

    public void setToOnWallPosition() {//set back to on the wall
        if (getX() < 100) {//go out of left wall
            setImage("runLeft1.png", 90);
            setLocation(100, getY()); //set back to on wall
            rightToLeft = false;
        }

        if (getX() > 300) {//go out of right wall
            setImage("runRight1.png", -90);
            setLocation(300, getY());//set back to on wall
            leftToRight = false;
        }

    }

    public void fall() { // player will be fall down if getY is less than 500 
        if ((onLeftWall() || onRightWall()) && getY() < 500) {
            setLocation(getX(), getY() + (getRunSpeed() * 2 / 3));
        }

    }

    public boolean isJump() {//check player is jumping or not
        if (!onLeftWall() && !onRightWall()) {
            return true;
        } else {
            return false;
        }
    }

    public void jump() {
        // setlocation that look like it is jumping 
        if (leftToRight) {
            setImage("leftJump.png", 0);
            setLocation(getX() + vSpeedX, getY() - vSpeedY); // jumptoRigth
        }

        if (rightToLeft) {
            setImage("rightJump.png", 0);
            setLocation(getX() - vSpeedX, getY() - vSpeedY); // jumptoLeft
        }
    }

    public boolean isDead() {// to check player is dead or not
        Actor obstacle;
        obstacle = getOneObjectAtOffset(0, 0, Obstacle.class);
        return obstacle != null;
    }

    public void animationRun() { // play aninmation frame by frame
         // if runSpeed is fast means frame will be change fast as well by minus getRunSpeed
        frame++;
        if (onLeftWall()) {
           
            if (frame == 20 - getRunSpeed()) {
                setImage("runLeft2.png", 90);
            }
            if (frame == 40 - getRunSpeed()) {
                setImage("runLeft3.png", 90);
            }

            if (frame == 60 - getRunSpeed()) {
                setImage("runLeft1.png", 90);
                frame = 0;
            }
        }

        if (onRightWall()) {

            if (frame == 20 - getRunSpeed()) {
                setImage("runRight2.png", -90);
            }

            if (frame == 40 - getRunSpeed()) {
                setImage("runRight3.png", -90);
            }

            if (frame == 60 - getRunSpeed()) {
                setImage("runRight1.png", -90);
                frame = 0;
            }
        }

        if (!onLeftWall() && !onRightWall()) {
            frame = 0;
        }

    }

    public void setJumpSpeed(int vx, int vy) { // to set speed jumping
        vSpeedX = vx;
        vSpeedY = vy;
    }

    public void setRunSpeed(int runspeed) { // to set run speed to climb the wall
        runSpeed = runspeed;
    }

    public int getRunSpeed() {// get the speed run
        return runSpeed;
    }

    public boolean onRightWall() { // retuen true if this acter is on right wall
        Actor wall = getOneObjectAtOffset(getImage().getHeight() / 2, 0, Wall.class);
        return wall != null;
    }

    public boolean onLeftWall() { // retuen true if this acter is on left wall
        Actor wall = getOneObjectAtOffset(-(getImage().getHeight() / 2), 0, Wall.class);
        return wall != null;
    }

    public void playSound(String x) { // play sound method
        GreenfootSound jump = new GreenfootSound(x);
        jump.setVolume(80); // set sound value;
        jump.play();
    }
}
