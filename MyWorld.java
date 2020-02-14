import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int points = 0;
    public int lives = 3;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        buildPyramid();
        
    }
    
    public void act() {
        if (points == 28) {
            win();
        }
    }
    
    public void buildPyramid() {
        int x = 265;
        int y = 559;
        for (int i = 0; i < 7; i++) {
            addObject(new Bottom(), x, y);
            addObject(new Top(), x, y-27); 
            x += 80;
        }
        
        x = 305;
        y = 504; 
        for (int i = 0; i < 6; i++) {
            addObject(new Bottom(), x, y);
            addObject(new Top(), x, y-27); 
            x += 80;
        }
        
        x = 345;
        y = 449; 
        for (int i = 0; i < 5; i++) {
            addObject(new Bottom(), x, y);
            addObject(new Top(), x, y-27); 
            x += 80;
        }
        
        x = 385;
        y = 394; 
        for (int i = 0; i < 4; i++) {
            addObject(new Bottom(), x, y);
            addObject(new Top(), x, y-27); 
            x += 80;
        }
        
        x = 425;
        y = 339; 
        for (int i = 0; i < 3; i++) {
            addObject(new Bottom(), x, y);
            addObject(new Top(), x, y-27); 
            x += 80;
        }
        
        x = 465;
        y = 284; 
        for (int i = 0; i < 2; i++) {
            addObject(new Bottom(), x, y);
            addObject(new Top(), x, y-27); 
            x += 80;
        }
        
        addObject(new Bottom(), 505, 229);
        addObject(new Top(), 505, 202);
    }
    
    public void win() {
        Win w = new Win();
        Greenfoot.setWorld(w);
    }
}
