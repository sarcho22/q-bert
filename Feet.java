import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Feet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Feet extends Actor
{
    /**
     * Act - do whatever the Feet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(((MyWorld)getWorld()).c.getX(),(((MyWorld)getWorld()).c.getY()) + 26);
    }    
}
