import greenfoot.*;

public class bee extends Obs
{
    private static final int LEFT_EDGE = 2;

    public void act()
    {
        super.act();
        movebee();
    }

    private void move()
    {
        setLocation(getX() - 2, getY());
        
        if (getX() < LEFT_EDGE)
        {
            getWorld().removeObject(this);
        }
    }

    private void movebee()
    {
    
    }
}