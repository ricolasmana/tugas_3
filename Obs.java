import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obs extends Actor
{
    private boolean isalive = true;
    /**
     * Act - do whatever the Obs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }
    
    private void move()
    {
        setLocation(getX() - 2, getY());
        if(getX() < 0)
        {
            getWorld().removeObject(this);
        }
    }
}

