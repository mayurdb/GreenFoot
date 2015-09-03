import greenfoot.*;

/**
 * Write a description of class StartWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartWorld extends World
{
    /**
     * Constructor for objects of class StartWorld.
     * 
     */
    public StartWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 320, 1);     
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {   
                Greenfoot.delay(20);
                Greenfoot.setWorld(new Instructions());
       }
    }
}