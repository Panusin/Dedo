import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ninja extends Actor
{
   
    
    private int time = 0;
    static  int vSpeedX =8 ; //10
    static  int vSpeedY =1 ;//5
    static int runSpeed = 5;
    private boolean leftToRight ;
    private boolean rightToLeft ;
    private int frame = 0;
    
    public Ninja(){ 
        GreenfootImage img = getImage();
        img.scale(50,50); 
        setRotation(90);
        setImage(img);
        //setJumpSpeed(8,1);
        //setRunSpeed(5);
    }
    
   
    
    public Ninja(String imagefile){ 
        GreenfootImage img = new GreenfootImage(imagefile);
        img.scale(50,50); 
        //setRotation(90);
        setImage(img);
    }
    
    
    public void act() 
    {
        
       
        //time++; 
        animationRun();
        checkKey();  
        fall();
        checkJump();
        setToOnWallPosition();
        if(isDead()){
            Greenfoot.playSound("dead.wav");
        }
         
    } 
 
    public void checkKey(){// we check if this actor is on the lift or right wall 
        //then we allow to jump only on the wall.
        //jumpToLeft mean allow to jump to the left wall.
        if(Greenfoot.isKeyDown("space")&& rightToLeft == false && onRightWall() ){        
            setLocation(getX()-1,getY()); 
            playSound("jump.wav");
            rightToLeft = true;
            //means allow actoe jump to the left wall.
        }
        //jumpToright;
         if(Greenfoot.isKeyDown("space") && leftToRight == false && onLeftWall()){
            setLocation(getX()+1,getY());
            playSound("jump.wav");
            leftToRight = true;
            //means allow actor jump to right  wall.
        }
        
    }
  
    public void setImage(String name,int rota){ // set image and set rotation
        GreenfootImage img = new GreenfootImage(name);
        img.scale(50,50);
        setRotation(rota);
        setImage(img);
    }    
   
     public void setToOnWallPosition(){//set actor back on wall 
         if(getX() < 100){//go out of left wall
           setImage("runLeft1.png",90);
           setLocation(100,getY());
           rightToLeft = false;
        }
        
        if(getX() > 300 ){//go out of right wall
           setImage("runRight1.png",-90);
           setLocation(300,getY());
           leftToRight = false; 
        }
        
    }
    
    public void fall(){ // falling when the actor get Y location is less than Y =500
       if((onLeftWall() || onRightWall()) && getY() < 500){
          //checkPosition();
          setLocation(getX(),getY()+(getRunSpeed()*2/3));
         
       }
        
    }
    
    public boolean isJump(){ // check actor is jumping or not
        if(!onLeftWall() && !onRightWall()){
        return true;
       }else{
        return false;
        }
    }
    
    public void checkJump(){
            jump();
            
    }
    
    public void jump(){
        // jump when not on the wall
        if(leftToRight ){
            setImage("leftJump.png",0);
            setLocation(getX()+vSpeedX,getY()-vSpeedY); // jumptoRigth
       }
       
       if(rightToLeft){  
           setImage("rightJump.png",0);
           setLocation(getX()-vSpeedX,getY()-vSpeedY); // jumptoLeft
       }
    }
    
    public boolean isDead(){
        Actor obstacle ;
         obstacle = getOneObjectAtOffset(0,0,Obstacle.class); 
        return obstacle != null;
    }
     
    
    public void animationRun(){ //Image animation actor
        frame++;
        if(onLeftWall()){
            
           if(frame == 20-getRunSpeed()){
               setImage("runLeft2.png",90);
           }
           if(frame == 40-getRunSpeed()){
               setImage("runLeft3.png",90);
            }
            
           if(frame == 60-getRunSpeed()){
               setImage("runLeft1.png",90);
               frame=0;
            }
        }
        
         if(onRightWall()){
            
           if(frame == 20-getRunSpeed()){
               setImage("runRight2.png",-90);
           }
              
           if(frame == 40-getRunSpeed()){
               setImage("runRight3.png",-90);
           }
           
           if(frame == 60-getRunSpeed()){
               setImage("runRight1.png",-90);
               frame=0;
            }
        }
        
        if(!onLeftWall() && !onRightWall()){
            frame = 0;
        }
    
       
    }
    
    public void setJumpSpeed(int vx,int vy){ 
        vSpeedX = vx;
        vSpeedY = vy;
    }
    
    public void setRunSpeed(int runspeed){ 
        runSpeed = runspeed;
    }
    
    public int getRunSpeed(){
        return runSpeed;
    }
 
    
    public boolean onRightWall(){
      Actor wall = getOneObjectAtOffset(getImage().getHeight()/2,0,Wall.class);
      return wall != null;
    }
    
    public boolean onLeftWall(){
      Actor wall = getOneObjectAtOffset(-(getImage().getHeight()/2),0,Wall.class);
      return wall != null;
    }
    
    public void playSound(String x){
        GreenfootSound jump = new GreenfootSound(x);
        jump.setVolume(80);
        jump.play();
    }
}
