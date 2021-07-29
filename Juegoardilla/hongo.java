import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hongo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hongo extends Actor
{
    /**
     * Act - do whatever the hongo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        bosque bosq=(bosque)getWorld();
        Actor act=getOneIntersectingObject(ardilla.class);
        if(act!=null)
        {
          for( int i=1;i<=10;i++)
              bosq.puntos.incrementar();
          getWorld().removeObject(this);
          Greenfoot.playSound("hongo.wav");
        }
    
}
}
