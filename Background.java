import greenfoot.*;
public class Background extends World
{
    protected int score = 0;
    protected int lifes = 0; 
    protected int count = 0;
    private static final GreenfootImage bgImage = new GreenfootImage("background.png");
    protected static int scrollSpeed = 5;
    private int count1 = 0;
    private GreenfootImage scrollingImage;
    private int scrollPosition = 0;
    protected boolean Helicopter=false;
    protected boolean Heli_flag=false;
    protected int freq = 5;
    protected int fly_count=0;
    protected GreenfootSound backgroundMusic = new GreenfootSound("123.wav");
    public Background()
    {   
        super(800, 320, 1);
        GreenfootImage background = new GreenfootImage(800, 400);
        scrollingImage = getScrollingImage(800, 400);
        addObject(new Player(),100,300);
    }
    public void act()
    {   
        backgroundMusic.playLoop();
        if(scrollSpeed > 0 && scrollPosition <= 0) {
            scrollPosition = getWidth();
        }
        if(scrollSpeed < 0 && scrollPosition >= getWidth()) {
            scrollPosition = 0;
        }
        scrollPosition -= scrollSpeed;
        paint(scrollPosition);
        showText("Score:"+score,100,20);
        showText("Lifes:"+lifes,700,20);
        count ++;
        add_objects();
        add_flies();
    }
    
    protected void add_objects(){
        if (Greenfoot.getRandomNumber(100)==1)
        {
            if (count > freq && !Helicopter)
            {
                addObject(new Snake(),800,Greenfoot.getRandomNumber(2)*70+230);
                count=0;
                count1 ++;
            }
        }
        if (Greenfoot.getRandomNumber(500)==1)
        {
            if ( count1 >= 2 )
            {
                addObject(new Life(),800,Greenfoot.getRandomNumber(2)*70+230);
                count1 = 0;
            }
            
        }

        if (Greenfoot.getRandomNumber(800)==1)
        {
            addObject(new Power1(),800,Greenfoot.getRandomNumber(2)*70+230);
        }
    }
    
    protected void add_flies(){
        if (Helicopter && Heli_flag)
        {
            fly_count++;
            if ((fly_count % 20 ==0)){
                addObject(new Points(),getWidth()-1, Greenfoot.getRandomNumber(200));
            }
            if ((fly_count % 30 ==0)){
                addObject(new Points(),getWidth()-1, Greenfoot.getRandomNumber(200));
            }
        }
        else{ 
            if (Greenfoot.getRandomNumber(150)==10){
                addObject(new Points(),800,Greenfoot.getRandomNumber(2)*70+230);
            }
            if (Greenfoot.getRandomNumber(150)==20){
            addObject(new Points(),800,Greenfoot.getRandomNumber(2)*70+230);
            }
        }
    }
    /**
     * Paint scrolling image at given position and make sure the rest of
     * the background is also painted with the same image.
     */

	// Code for scrolling image referance - http://www.greenfoot.org/topics/4238/0
    private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(scrollingImage, position, 0);
        bg.drawImage(scrollingImage, position - scrollingImage.getWidth(), 0);
    }
 
    /**
     * Returns an image with the given dimensions.
     */
    private GreenfootImage getScrollingImage(int width, int height)
    {
        GreenfootImage image = new GreenfootImage(width, height);
        for(int x = 0; x < width; x += bgImage.getWidth()) {
            for(int y = 0; y < height; y += bgImage.getHeight()) {
                image.drawImage(bgImage, x, y);
            }
        }
        return image;
    } 
}
