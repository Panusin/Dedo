import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class SpaceTojump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceToJump extends KeyAndButton
{
    /**
     * Act - do whatever the SpaceTojump wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SpaceToJump(){
        GreenfootImage img = new GreenfootImage("Press [ Space bar ] to Jump",20,Color.BLACK,null);
		img.setTransparency(160); 
		setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
