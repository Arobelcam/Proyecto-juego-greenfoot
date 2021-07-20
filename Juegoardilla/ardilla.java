import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ardilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ardilla extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    public void ardilla(){
        
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            setDirection(UP);
        }
        if(Greenfoot.isKeyDown("down")){
            setDirection(DOWN);
        }
        if(Greenfoot.isKeyDown("left")){
            setDirection(LEFT);
        }
        if(Greenfoot.isKeyDown("right")){
            setDirection(RIGHT);
        }
    }   
    public void setDirection(int direccion){
        switch(direccion){
            case UP:
            setRotation(270);
            if(Greenfoot.isKeyDown("space")){
            setLocation(getX(),getY()-10);    
        }
        else{
            setLocation(getX(),getY()-1);
        }
            break;
            case DOWN:
            setRotation(90);
            if(Greenfoot.isKeyDown("space")){
            setLocation(getX(),getY()+10);    
        }
        else{
            setLocation(getX(),getY()+1);
        }
            break;
            case LEFT:
            setRotation(180);
            if(Greenfoot.isKeyDown("space")){
            setLocation(getX()-10,getY());    
        }
        else{
            setLocation(getX()-1,getY());
        }
            break;
            case RIGHT:
            setRotation(0);
            if(Greenfoot.isKeyDown("space")){
            setLocation(getX()+10,getY());    
        }
        else{
            setLocation(getX()+1,getY());
        }
            break;
    }
}
}
    
