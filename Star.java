import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
    /**
     * Act - do whatever the Sun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Ninja nini = new Ninja();
   
    public Star(){
        GreenfootImage img = getImage();
        img.scale(20,20);
        setImage(img);
    }
    public void act() 
    {
        turn(5);
        setLocation(getX(),getY()+nini.getRunSpeed()/2);
       
        
        if(isTouching(Ninja.class)){
            World myWorld = getWorld();
            RunningWorld world = (RunningWorld)myWorld;
            Score score = world.getScore();
            score.addScore(100);
            getWorld().removeObject(this);
        }  else if(isAtEdge()){
            getWorld().removeObject(this);
        }
       
    }    
}
