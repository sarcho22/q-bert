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
    public void act() 
    {
        // Add your action code here.
        move();
    }    
    
    public void move() {
        if (Greenfoot.isKeyDown("q")) {
            //jump up and left
        }
        if (Greenfoot.isKeyDown("w")) {
            //jump up and right
        }
        if (Greenfoot.isKeyDown("a")) {
            //jump down and left
        }
        if (Greenfoot.isKeyDown("s")) {
            //jump down and right
        }
    }
}
