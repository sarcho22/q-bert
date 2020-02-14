import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cubebert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubebert extends Actor
{
    /**
     * Act - do whatever the Cubebert wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer_animation = 20;
    public String direction = "right";
    boolean fall = false;
    boolean canMove = true;
    public boolean dino = true;
    public int timer = 25;
    public int count = 20;
    public int timer3 = 40;
    public boolean isFalling;
    public Cubebert() {
    }
    public void act() 
    {
       setImage("standing.png");
       if (timer <= 0) {
           if(canMove) {
               move();
        timer = 25;
            }
        
    }
        timer--;
        timer3--;
        fall();       
        count--;
        if(isTouching(dino.class) && timer <= 0) {
            ((MyWorld)getWorld()).removeLives();
            count = 25;
            
        }
        checkMobs();
    }    
    
    public void move() {
        
        if (Greenfoot.isKeyDown("q")) {
                 //jump up and left
                 setImage("jumping-left.png");
                 setLocation(getX()-6, getY());
                 ((MyWorld)getWorld()).f.setLocation(getX()-6, getY());
                 Greenfoot.delay(2);
                
                 setLocation(getX()-4, getY());
                 ((MyWorld)getWorld()).f.setLocation(getX()-4, getY());
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-5, getY()-9);
                 ((MyWorld)getWorld()).f.setLocation(getX()-5, getY()-9);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-4, getY()-11);
                 ((MyWorld)getWorld()).f.setLocation(getX()-4, getY()-11);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-7, getY()-14);
                 ((MyWorld)getWorld()).f.setLocation(getX()-7, getY()-14);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-6, getY()-6);
                 ((MyWorld)getWorld()).f.setLocation(getX()-6, getY()-6);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-4, getY()-7);
                 ((MyWorld)getWorld()).f.setLocation(getX()-4, getY()-7);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-4, getY()-8);
                 ((MyWorld)getWorld()).f.setLocation(getX()-4, getY()-8);
                 Greenfoot.delay(2);
            
            }
        
        if (Greenfoot.isKeyDown("w")) {
            //jump up and right
                 setImage("jumping.png");
                 setLocation(getX()+6, getY());
                 ((MyWorld)getWorld()).f.setLocation(getX()+6, getY());
                 Greenfoot.delay(2);
                
                 setLocation(getX()+4, getY());
                 ((MyWorld)getWorld()).f.setLocation(getX()+4, getY());
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+5, getY()-9);
                 ((MyWorld)getWorld()).f.setLocation(getX()+5, getY()-9);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+4, getY()-11);
                 ((MyWorld)getWorld()).f.setLocation(getX()+4, getY()-11);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+7, getY()-14);
                 ((MyWorld)getWorld()).f.setLocation(getX()+7, getY()-14);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+6, getY()-6);
                 ((MyWorld)getWorld()).f.setLocation(getX()+6, getY()-6);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+4, getY()-7);
                 ((MyWorld)getWorld()).f.setLocation(getX()+4, getY()-7);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+4, getY()-8);
                 ((MyWorld)getWorld()).f.setLocation(getX()+4, getY()-8);
                 Greenfoot.delay(2);
            }
        
        if (Greenfoot.isKeyDown("a")) {
            //jump down and left
                 setImage("falling-left.png");
                 //setLocation(getX()-40, getY()+55);
                 setImage("jumping.png");
                 
                 setLocation(getX()-6, getY()-2);
                 ((MyWorld)getWorld()).f.setLocation(getX()-6, getY()-2);
                 Greenfoot.delay(2);
                
                 setLocation(getX()-4, getY()-1);
                 ((MyWorld)getWorld()).f.setLocation(getX()-4, getY()-1);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-5, getY()+9);
                 ((MyWorld)getWorld()).f.setLocation(getX()-5, getY()+9);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-4, getY()+11);
                 ((MyWorld)getWorld()).f.setLocation(getX()-4, getY()+11);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-7, getY()+14);
                 ((MyWorld)getWorld()).f.setLocation(getX()-7, getY()+14);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-6, getY()+6);
                 ((MyWorld)getWorld()).f.setLocation(getX()-6, getY()+6);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-4, getY()+7);
                 ((MyWorld)getWorld()).f.setLocation(getX()-4, getY()+7);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()-4, getY()+11);
                 ((MyWorld)getWorld()).f.setLocation(getX()-4, getY()+11);
                 Greenfoot.delay(2);
                
                
            }
        
        if (Greenfoot.isKeyDown("s")) {
                 setImage("falling.png");
                 setLocation(getX()+6, getY()-2);
                 ((MyWorld)getWorld()).f.setLocation(getX()+6, getY()-2);
                 Greenfoot.delay(2);
                
                 setLocation(getX()+4, getY()-1);
                 ((MyWorld)getWorld()).f.setLocation(getX()+4, getY()-1);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+5, getY()+9);
                 ((MyWorld)getWorld()).f.setLocation(getX()+5, getY()+9);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+4, getY()+11);
                 ((MyWorld)getWorld()).f.setLocation(getX()+4, getY()+11);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+7, getY()+14);
                 ((MyWorld)getWorld()).f.setLocation(getX()+7, getY()+14);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+6, getY()+6);
                 ((MyWorld)getWorld()).f.setLocation(getX()+6, getY()+6);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+4, getY()+7);
                 ((MyWorld)getWorld()).f.setLocation(getX()+4, getY()+7);
                 Greenfoot.delay(2);
                 
                 setLocation(getX()+4, getY()+11);
                 ((MyWorld)getWorld()).f.setLocation(getX()+4, getY()+11);
                 Greenfoot.delay(2);
        }
            //jump down and right
        
    }
    public void fall() {
      if (!this.isTouching(Top.class) ||  getY() > 559-getImage().getHeight()/2) {
            fall = true;
            canMove = false;
        }
      if (fall == true) {
            setLocation(getX(), getY()+10);
            if (getY() > 650) {
                setLocation(getX(), 650);
            }
            if (dino) {
                  getWorld().addObject(new dino(),0, 650);
                  dino = false;
            }
        }
        
        
    }
    public void setDefault() {
            setLocation(505,170);
            fall = false;
            canMove = true;
            dino = true;
    }
    
    public void checkMobs() {
        if(timer3 <= 0) {
        if(isTouching(Bird.class)) {
            ((MyWorld)getWorld()).removeLives();
        }
        timer3 = 40;
    }
    }
}
