import greenfoot.*;

/**
 * Write a description of class Power1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Power1 extends Player
{
    /**
     * Act - do whatever the Power1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage("Heli_1.png");
        Background bg = (Background) getWorld();
        move((-1*bg.scrollSpeed)-3);
        if (isAtEdge())
        {
            bg.removeObject(this);
        }
    }    
}
