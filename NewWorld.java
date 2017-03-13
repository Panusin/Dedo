 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewWorld extends World
{

    /**
     * Constructor for objects of class NewWorld.
     * 
     */
    int pick = -1;
    Picking picking1 = new Picking(1);
    Picking picking2 = new Picking(2);
    Picking picking3 = new Picking(3);
    EasyMode easy = new EasyMode();
    MediumMode medium = new MediumMode();
    HardMode hard = new HardMode();
    Keys key = new Keys();
    static boolean easyPicked = false;
    static boolean mediumPicked = false ;
    static boolean hardPicked = false ;
    int count = 0;
    static GreenfootSound eiei=new GreenfootSound("start.wav");
    public NewWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        addObject(easy, getWidth()/2, getHeight()/2-10);
        addObject(medium, getWidth()/2, getHeight()/2+70);
        addObject(hard, getWidth()/2, getHeight()/2+150);
		addObject(new Ninnin(),getWidth()/2,162);
        setPaintOrder(KeyAndButton.class,Window.class,Timer.class,Cloud.class,Ninja.class,KeyAndButton.class,
        ClothesLine.class,Wall2.class,Wall.class);
        
    }
    
    public void started(){
        eiei.play();
    }
    
    public void stopped(){
        eiei.stop();
    }
    
    public void act(){
         String keyDown = Greenfoot.getKey();
        if( keyDown =="space"|| keyDown=="down" || keyDown == "up"){
            
            if(keyDown == "up"){
                pick--;
                if(pick < 0){
                pick = 2;
               }
            }   
            else{
                pick++;
                if(pick >= 3){
                pick = 0;
               }
            }
            
            easyPicked = false;
            mediumPicked = false;
            hardPicked = false;
        }
        
        if(pick == 0 ){
          addObject(picking1, getWidth()/2, getHeight()/2-10); 
          removeObject(picking2); 
          removeObject(picking3);
            if(Greenfoot.isKeyDown("enter")){
            easyPicked = true;
            
            Greenfoot.setWorld(new RunningWorld());
           }
        }
        if(pick == 1){
          addObject(picking2, getWidth()/2, getHeight()/2+70);
          removeObject(picking1); 
          removeObject(picking3);
           if(Greenfoot.isKeyDown("enter")){
               mediumPicked = true;
            Greenfoot.setWorld(new RunningWorld());
           }
        }
        if(pick == 2){
          addObject(picking3, getWidth()/2, getHeight()/2+150);
          removeObject(picking1); 
          removeObject(picking2);
           if(Greenfoot.isKeyDown("enter")){
             hardPicked = true;
            Greenfoot.setWorld(new RunningWorld());
           }
        }
        
        count++;
        if(count == 30){
            addObject(key,getWidth()/2,574);
        }

        if(count == 60){
            removeObject(key);
            count = 0;
        }

        }
        //Greenfoot.setWorld(new MyWorld());
        public boolean isEasyMode(){
           return easyPicked;
        }
        
         public boolean isMediumMode(){
           return mediumPicked;
        }
        
         public boolean isHardMode(){
           return hardPicked;
        }
        
        
        
       
  }
       
    
    
    

