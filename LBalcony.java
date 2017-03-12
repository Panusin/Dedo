import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LBalcony here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LBalcony extends Obstacle
{
    /**
     * Act - do whatever the LBalcony wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     Ninja nini = new Ninja();
    public LBalcony(){
        GreenfootImage img = new GreenfootImage("balconyL"+Greenfoot.getRandomNumber(15)+".png");
        img.scale(60,100);
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
