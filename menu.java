import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1); 
        prepare();
        
      
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        oldTitle oldTitle = new oldTitle();
        addObject(oldTitle,492,185);
        
        addObject(new playButton(), 500, 500);
        
    }
    
    public void act() {
        two t = new two();
        addObject(t,642,345);
        Greenfoot.delay(10);
        
        point p = new point();
        addObject(p,742,368);
        Greenfoot.delay(10);
        
        o o = new o();
        addObject(o,824,340);
        Greenfoot.delay(10);
        
        removeObject(t);
        Greenfoot.delay(10);
        
        removeObject(p);
        Greenfoot.delay(10);
        removeObject(o);
        Greenfoot.delay(10);
    }
}
