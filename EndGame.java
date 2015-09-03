import greenfoot.*;

/**
 * Write a description of class EndGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGame extends World
{

    /**
     * Constructor for objects of class EndGame.
     * 
     */
    public EndGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 320, 1);
//        showText("Score:"+score,600,100);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Background());
        }
    }
}
