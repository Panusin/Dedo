import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class EasyMode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EasyMode extends KeyAndButton
{
     boolean easy = false;
    public EasyMode(){
         GreenfootImage img = new GreenfootImage("EASY",50,Color.GRAY,null);
         setImage(img);
    
    }
    
    public int getWidth(){
        return this.getImage().getWidth();
    }
    
    
    
}
