import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Top here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Top extends Actor
{
    /**
     * Act - do whatever the Top wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean hit = false;
    
    public void act() 
    {
        // Add your action code here.
        intersect();
    }    
    
    public void intersect() {
        if (isTouching(Cubebert.class) && !hit) {
            setImage("top3.png");
            ((MyWorld)getWorld()).points++;
            hit = true;
        }
    }
}
