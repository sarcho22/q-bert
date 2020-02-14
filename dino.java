import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dino extends Actor
{
    /**
     * Act - do whatever the dino wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act() 
    { 
        walk();
        count++;
    } 
    public void walk() {
        setLocation(getX()+5, getY());
        if (count % 40 < 20) {
            setImage("dino-left-up.png");
        }
        else {
            setImage("Dino-right-up.png");
        }
    }   
}

