import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class MediumMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediumMode extends KeyAndButton
{
    /**
     * Act - do whatever the MediumMode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MediumMode(){
         GreenfootImage img = new GreenfootImage("MEDIUM",50,Color.GRAY,null);
         setImage(img);
    
    }
    public void act() 
    {
        // Add your action code here.
    }  
    
    public int getWidth(){
        return this.getImage().getWidth();
    }
}
