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
    public Cubebert() {
        getImage().scale(105,105);
    }
    public void act() 
    {
       setImage("standing.png");
       getImage().scale(105,105);

        move();
        fall();
    }    
    
    public void move() {
        if (Greenfoot.isKeyDown("q")) {
            setImage("jumping.png");
            //jump up and left
            if (direction == "right") {
                getImage().mirrorHorizontally();
            }
        }
        if (Greenfoot.isKeyDown("w")) {
            setImage("jumping.png");
            //jump up and right
        }
        if (Greenfoot.isKeyDown("a")) {
            setImage("falling.png");
            //jump down and left
        }
        if (Greenfoot.isKeyDown("s")) {            
            setImage("falling.png");

            //jump down and right
        }
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
