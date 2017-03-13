import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RunningWorld extends World
{
    private int time = 0;
    int count = 0;
    int decPosition[] = {35,368};
    private int ranNum;
    Ninja nini = new Ninja();
    Score score = new Score();
    NewWorld newWorld = new NewWorld();
    SpaceToJump spacebar = new SpaceToJump();
    ShowGetPoint point = new ShowGetPoint(); //show how to earn point
    
    public RunningWorld()
    {    
        // Create a new world with 400x600 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        addObject(new Wall(),26,300);
        addObject(new Wall(),375,300);
        addObject(nini,100 ,500 );
        addObject(new Timer(),getWidth()/2,80 );
        addObject(new TimeImage(),getWidth()/2,82);
        addObject(score,getWidth()/2,100 );
        setPaintOrder(Cloud.class,Window.class,Ninja.class,KeyAndButton.class,
        ClothesLine.class,Wall2.class,Wall.class);
        
    }
    
    public void started(){
        newWorld.eiei.play();
    }
    
    public void stopped(){
        newWorld.eiei.stop();
    }
    
    public void act(){
       newWorld.eiei.setVolume(50);
       easyMode();
       mediumMode();
       hardMode();
       
       if(nini.isDead()){
           newWorld.eiei.stop();
           Prize prize = new Prize();
           prize.fall.stop();
           Object ob = new Object();
           ob.ss.stop();
           Greenfoot.setWorld(new GameOverWorld());
        }
        
        
         if(count == 601){
             removeObject(spacebar);
             removeObject(point);
            }else{
                count++;
            }
                
        if(count % 30 == 0){
            addObject(spacebar,getWidth()/2,574);
        }

        if(count % 60 == 0){
            removeObject(spacebar);
            addObject(point,getWidth()/2,130);
        } 
        
         if(count % 90 == 0){
            removeObject(point);
            }
        
        
           
    }
    
    public NewWorld getNewWorld(){
        return newWorld;
    }
    
    public Score getScore(){
        return score;
    }
    
    public void easyMode(){
        if(Greenfoot.isKeyDown("escape")){
            Greenfoot.setWorld(new NewWorld());
        }
        
        if(newWorld.isEasyMode()){
             time++;
             nini.setRunSpeed(5);
             nini.setJumpSpeed(8, 1);
             if(time == 1|| time == 25){
                 addObject(new Wall(), 26, -100);
                 addObject(new Wall(), 375, -100);
                } 
           
            if(time == 10 &&Greenfoot.getRandomNumber(100)< 5){
                addObject(new ClothesLine(), getWidth()/2, 0);
           
            }
        
            if(time == 20 || time == 40){
                addObject(new Cloud(), getWidth()/2,Greenfoot.getRandomNumber(20)+50);
            }
        
            if(time== 30 && (Greenfoot.getRandomNumber(10)< 8)){
                addObject(new Window(), decPosition[Greenfoot.getRandomNumber(decPosition.length)], -100);
            }
           
            if(time == 20|| time == 40){
                addObject(new Wall2(), 26, -100);
                addObject(new Wall2(), 375, -100);
          
            }
        
            if(time == 60){ //
                ranNum = Greenfoot.getRandomNumber(100);
                if(ranNum <50){
                    if(ranNum <25){
                        addObject(new LBalcony(), 106, -100);
                    }else{
                        addObject(new RBalcony(), 295, -100);
                    }
                } 
            
                if(ranNum < 10){
                addObject(new Prize(), getWidth()/2,0);
               } 
            
               if(ranNum < 40){
                   if(ranNum < 20){
                       addObject(new Star() ,106,0);
                    }else{
                        addObject(new Star() ,295,0);
                    }
                }
            
                if(ranNum < 30){
                    if(ranNum <15){
                        addObject(new Object(), getWidth()/2,0);
                    }
                }
           
                time = 0;
          }
       
        }
    }
    
    public void mediumMode(){
        if(Greenfoot.isKeyDown("escape")){
            Greenfoot.setWorld(new NewWorld());
        }
        
        if(newWorld.isMediumMode()){
            time++;
            nini.setRunSpeed(8);
            nini.setJumpSpeed(10, 1);
            if(time == 1|| time == 25){
                addObject(new Wall(), 26, -100);
                addObject(new Wall(), 375, -100);
            } 
        
            if(time == 10 &&Greenfoot.getRandomNumber(100)< 5){
                addObject(new ClothesLine(), getWidth()/2, 0);
           
            }
        
            if(time == 20 || time == 40){
                addObject(new Cloud(), getWidth()/2,Greenfoot.getRandomNumber(20)+50);
            }
        
            if(time== 30 && (Greenfoot.getRandomNumber(10)< 8)){
                addObject(new Window(), decPosition[Greenfoot.getRandomNumber(decPosition.length)], -100);
            }
           
            if(time == 50){
                addObject(new Wall2(), 26, -100);
                addObject(new Wall2(), 375, -100);
          
            }
        
            if(time == 60|| time == 30){ //
                ranNum = Greenfoot.getRandomNumber(100);
                
                if(ranNum <50){
                    if(ranNum <25){
                        addObject(new LBalcony(), 106, -100);
                    }else{
                        addObject(new RBalcony(), 295, -100);
                    }
                } 
            
                if(ranNum < 10){
                    addObject(new Prize(), getWidth()/2,0);
                }
                
                if(ranNum < 40){
                    if(ranNum < 20){
                        addObject(new Star() ,106,0);
                    }else{
                        addObject(new Star() ,295,0);
                    }
                }
            
                if(ranNum < 10){
                    if(ranNum <5){
                        addObject(new Object(), getWidth()/2,0);
               
                    }
                }   
            
                if(time == 60){
                    time =0;
                }
            }
        }   
    }
    
   public void hardMode(){
       if(Greenfoot.isKeyDown("escape")){
            Greenfoot.setWorld(new NewWorld());
        }
        
        if(newWorld.isHardMode()){
             time++;
             nini.setRunSpeed(10);
             nini.setJumpSpeed(12, 1);
             
       if(time == 1|| time == 30){
          addObject(new Wall(), 26, -100);
          addObject(new Wall(), 375, -100);
       } 
        
       if(time == 10 &&Greenfoot.getRandomNumber(100)< 5){
           addObject(new ClothesLine(), getWidth()/2, 0);
           
        }
        
       if(time == 20 || time == 40){
          addObject(new Cloud(), getWidth()/2,Greenfoot.getRandomNumber(20)+50);
        }
        
       if(time == 30 || time == 60){
         addObject(new Window(), decPosition[Greenfoot.getRandomNumber(decPosition.length)], 0);
       }
           
       if(time == 10|| time == 50){
           addObject(new Wall2(), 26, -100);
           addObject(new Wall2(), 375, -100);
          
        }
        
       if(time == 20|| time == 40|| time == 60 ){ //
            ranNum = Greenfoot.getRandomNumber(100);
            if(ranNum <50){
               
              if(ranNum <25){
               addObject(new LBalcony(), 106, -100);
             }else{
               addObject(new RBalcony(), 295, -100);
                }
            } 
            
            if(ranNum < 10){
                addObject(new Prize(), getWidth()/2,0);
            }
            if(ranNum < 40){
                if(ranNum < 20){
                addObject(new Star() ,106,0);
               }else{
                addObject(new Star() ,295,0);
                }
            }
            
            if(ranNum < 10){
               
                addObject(new Object(), getWidth()/2,0);
               
            
            } 
            if(time == 60){
                time =0;
            }
            
        
         }
            
        }
        
    }
}
   
