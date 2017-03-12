import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Decorate
{
    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int time = 0;
    public Cloud(){
        GreenfootImage img = new GreenfootImage("cloud"+(Greenfoot.getRandomNumber(2)+1)+".png");
        setImage(img);
    }
    public void act() 
    {
        time++;
        if(time == 90){
            getWorld().removeObject(this);
             time = 0;
        }
    }    
}
