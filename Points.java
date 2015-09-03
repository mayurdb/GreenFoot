import greenfoot.*;

/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points extends Actor
{   
    public boolean flag = true;
    public int count = 0;
    public int count1 = 0;
    /**
     * Act - This method runs every time.
     * 
     */
    public void act() 
    {
       Background bg = (Background) getWorld();
       if ( bg. Helicopter ){
           if (count <= 10 && count1 < 70){
               setLocation(getX(), getY()+3);
               count ++;
               count1 = 0;
           }
           if (count >10 && count1 < 70 ){
               setLocation(getX(), getY()-3);
               count ++;
               count1 = 0;
           }
           if ( count == 20 ){
               count = 0;
           }
       }    
       move(-1*bg.scrollSpeed);
       if ( isAtEdge()){
           bg.removeObject(this);
       }
    }    
}
