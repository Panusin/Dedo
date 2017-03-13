import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Object here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Object extends Obstacle
{
    /**
     * Act - do whatever the Object wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     Ninja nini = new Ninja();
     int num ;
     static GreenfootSound ss = new GreenfootSound("peopleFall.wav");
    public Object(){
        GreenfootImage img = new GreenfootImage("object"+Greenfoot.getRandomNumber(13)+".png");
        img.scale(50,50);
        setImage(img);
        ss.setVolume(75);
        ss.play();

    }
    
    public void played(){
        
    }
    
    public void act() 
    {
         num = getY()+nini.getRunSpeed();
         setLocation(getX(),num+=2);
         turn(5);
         
        
        if(isAtEdge()){
           getWorld().removeObject(this);
        
        }   
    }
}
