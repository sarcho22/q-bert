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
    public String direction = "right";
    boolean fall = false;
    public boolean dino = true;
    public int timer = 20;
    public Cubebert() {
    }
    public void act() 
    {
       setImage("standing.png");
       if (timer <= 0) {
        move();
        timer = 20;
    }
        timer--;
        fall();
    }    
    
    public void move() {
        
        if (Greenfoot.isKeyDown("q")) {
            //jump up and left
                setImage("jumping-left.png");
                setLocation(getX()-4, getY()-3);
                setLocation(getX()-4, getY()-4);
                setLocation(getX()-2, getY()-6);
            }
        
        if (Greenfoot.isKeyDown("w")) {
            //jump up and right
                setImage("jumping.png");
                setLocation(getX()+4, getY()-3);
                setLocation(getX()+4, getY()-4);
                setLocation(getX()+2, getY()-6);
            }
        
        if (Greenfoot.isKeyDown("a")) {
            //jump down and left
                setImage("falling-left.png");
                //setLocation(getX()-38, getY()+55);
                setLocation(getX()-10, getY()-2);
                setLocation(getX()-1, getY()+3);
                setLocation(getX()-1, getY()+5);
                setLocation(getX()-1, getY()+3);
            }
        
        if (Greenfoot.isKeyDown("s")) {
                setImage("falling.png");
                setLocation(getX()+4, getY()-2);
                setLocation(getX()+1, getY()+3);
                setLocation(getX()+1, getY()+5);
                setLocation(getX()+1, getY()+3);
        }
            //jump down and right
        
    }
    public void fall() {
      if (!this.isTouching(Bottom.class) && !this.isTouching(Top.class)) {
            fall = true;
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
}
