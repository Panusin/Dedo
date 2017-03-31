import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class ShowGetPoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShowGetPoint extends KeyAndButton
{
    /**
     * Act - do whatever the ShowGetPoint wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public ShowGetPoint(){
        GreenfootImage img = new GreenfootImage("Collect stars and elephents"+"\n to earn points",20,Color.BLACK,null);
		img.setTransparency(160); 
		setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
