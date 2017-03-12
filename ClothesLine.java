import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClothesLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClothesLine extends Decorate
{
    /**
     * Act - do whatever the ClothesLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String name [] = {"clothesLine1.png","clothesLine2.png"};
    Ninja nini = new Ninja();
    public ClothesLine(){
        GreenfootImage img = new GreenfootImage(name[Greenfoot.getRandomNumber(name.length)]);
        setImage(img);
        GreenfootImage mm = getImage();
        mm.scale(249,50);
        setImage(mm);
    }
    public void act() 
    {        
        setLocation(getX(),getY()+nini.getRunSpeed());
        if(isAtEdge()){
           getWorld().removeObject(this);
        }
    }    
}
