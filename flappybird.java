import greenfoot.*;

public class flappybird extends Actor
{
    private int velocity = 0;
    private int gravity = 1;
    
    public flappybird()
    {
        GreenfootImage image = getImage();
        image.scale(50, 50);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            velocity = -5;
        }
        velocity += gravity;
        setLocation(getX(), getY() + velocity);
        
        if(getY() >= getWorld().getHeight() - 1)
        {
            Greenfoot.stop();
        }
        
        if(isTouching(Rocket.class) || isTouching(bee.class) || isTouching(butterfly.class))
        {
            Greenfoot.stop();
        }
    }
}