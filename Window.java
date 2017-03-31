import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Window here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Window extends Decorate
{
    /**
     * Act - do whatever the Window wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ninja nini = new Ninja();
    public Window(){
        GreenfootImage img = new GreenfootImage("Window"+Greenfoot.getRandomNumber(11)+".png");
        img.scale(100,100);
        setImage(img);
    }
    public void act() 
    {
        setLocation(getX(),getY()+nini.getRunSpeed());
        if(isAtEdge()){
           getWorld().removeObject(this);
        }
    }    
}
