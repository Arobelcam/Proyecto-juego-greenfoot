import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bosque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bosque extends World
{
    
    
    /**
     * Constructor for objects of class bosque.
     * 
     */
    public bosque()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1);
        ardilla a1=new ardilla();
        addObject(a1,40, 200);
        crearSerpientes(6);
    }
    public void crearSerpientes(int numero){
        for(int i=0;i<numero;i++){
            serpiente s=new serpiente();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(s,x,y);
        }
    }
    
}
