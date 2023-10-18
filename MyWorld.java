import greenfoot.*;

public class MyWorld extends World
{
    private static final int MAX_ROCKETS = 2;
    private static final int MAX_BEE = 2;
    private static final int MAX_BUTTERFLY = 2;

    public MyWorld()
    {    
        super(800, 400, 1); 
        addObject(new flappybird(), 100, getHeight() / 2);
        prepare();
    }

    public void act()
    {
        int rocketCount = getObjects(Rocket.class).size();
        int beeCount = getObjects(bee.class).size();
        int butterflyCount = getObjects(butterfly.class).size();

        if (Greenfoot.getRandomNumber(100) < 2 && rocketCount < MAX_ROCKETS)
        {
            addObject(new Rocket(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }

        if (Greenfoot.getRandomNumber(100) < 2 && beeCount < MAX_BEE)
        {
            addObject(new bee(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
        
        if (Greenfoot.getRandomNumber(100) < 2 && butterflyCount < MAX_BUTTERFLY)
        {
            addObject(new butterfly(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    
    private void prepare()
    {
    }
}