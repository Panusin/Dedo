import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyNewWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{

    /**
 * Constructor for objects of class MyNewWorld.
     * 
     */
    
    
    public GameOverWorld()
    {    
       super(400, 600, 1); 
       addObject(new GameOver(),getWidth()/2,120);
       addObject(new HighScore(),getWidth()/2,250);
       
    }
    
    public void act(){
       
    }
    
}
