import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bugs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class butterfly extends Obs
{
    private static final int LEFT_EDGE = 2;

    public void act()
    {
        super.act();
        movebutterfly();
    }

    private void move()
    {
        setLocation(getX() - 3, getY());
        
        if (getX() < LEFT_EDGE)
        {
            getWorld().removeObject(this);
        }
    }

    private void movebutterfly()
    {
        
    }
}