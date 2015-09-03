import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    public int speed = -5;

    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Background bg = (Background) getWorld();
        move((-1*bg.scrollSpeed)-3);
        if (isAtEdge())
        {
            bg.removeObject(this);
        }
        if ( ((bg.score % 50) == 0) && (bg.score > 0)){
            bg.scrollSpeed ++;
            speed = speed - 3;
            bg.score++;
        }
        //if ( getObjectsInRange(5, Opponent.class){
            
       
    }  
    
    
}
