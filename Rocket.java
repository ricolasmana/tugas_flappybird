import greenfoot.*;

public class Rocket extends Obs
{
    private static final int LEFT_EDGE = 2;

    public void act()
    {
        super.act();
        moveRocket();
    }

    private void move()
    {
        setLocation(getX() - 3, getY());
        
        if (getX() < LEFT_EDGE)
        {
            getWorld().removeObject(this);
        }
    }

    private void moveRocket()
    {
        
    }
}