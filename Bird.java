import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public boolean fall = false;
    public int timer1 = 30;
    
    
    public void act() 
    {
        if(timer1 <= 0) {
        
        
        int n = (int)(Math.random()*8);
        if (n == 0) {
            setImage("bird-left.png");
            setLocation(getX()-6, getY());
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                
                 setLocation(getX()-4, getY());
                 
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                 
                 setLocation(getX()-5, getY()-9);
                
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                 
                 setLocation(getX()-4, getY()-11);
                
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                 
                 setLocation(getX()-7, getY()-14);
                 
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                 
                 setLocation(getX()-6, getY()-6);
               
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                 
                 setLocation(getX()-4, getY()-7);
                
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                 
                 setLocation(getX()-4, getY()-8);
                 
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                 fall();
        }
        else if (n == 1) {
            setImage("bird.png");
            setLocation(getX()+6, getY());
                 
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                
                 setLocation(getX()+4, getY());
                 
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                 
                 setLocation(getX()+5, getY()-9);
                
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                 
                 setLocation(getX()+4, getY()-11);
                
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                 
                 setLocation(getX()+7, getY()-14);
                 
                 for(int i = 0; i < 30000; i++) {
                     i = i;
                 }
                 
                 setLocation(getX()+6, getY()-6);
               
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()+4, getY()-7);
                
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()+4, getY()-8);
                 
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 fall();
        }
        else if (n == 2 || n == 3 || n == 4) {
            setImage("bird-left.png");
            setLocation(getX()-6, getY()-2);
             
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                
                 setLocation(getX()-4, getY()-1);
                 
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()-5, getY()+9);
               
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()-4, getY()+11);
               
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()-7, getY()+14);
                
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()-6, getY()+6);
               
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()-4, getY()+7);
                
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()-4, getY()+11);
                 
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 fall();
        }
        else {
            
            setImage("bird.png");
            setLocation(getX()+6, getY()-2);
             
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                
                 setLocation(getX()+4, getY()-1);
                 
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()+5, getY()+9);
               
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()+4, getY()+11);
               
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()+7, getY()+14);
                
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()+6, getY()+6);
               
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()+4, getY()+7);
                
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 
                 setLocation(getX()+4, getY()+11);
                 
                 for(int i = 0; i < 30000; i++) {                     i = i;                 }
                 fall();
        }
        timer1 = 30;
    }
    timer1--;
    }    
    
    public void fall() {
      if (!this.isTouching(Top.class) ||  getY() > 559-getImage().getHeight()/2) {
            ((MyWorld)getWorld()).removeObject(this);
        }
        
        
    }
}
