import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Keys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keys extends KeyAndButton
{
    /**
     * Act - do whatever the Keys wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Keys(){
		
        GreenfootImage img = new GreenfootImage("Press [ space ] or Up and Down to slide "+"\n Enter to select",20,Color.BLACK,null);
		img.setTransparency(150); 
		setImage(img);
		
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
