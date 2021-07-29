import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ardilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ardilla extends Actor
{
    //Se establecen las variables de las diferentes direcciones
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    int direccionDisparo=2;
    boolean isDisparo=false;
    boolean isBellota=false;
    // Se establce la clase de ardilla
    public void ardilla(){
        
    }
    // Se indica mediante metodos la direccion en la que se moverá la ardilla 
    //con las teclas direccionales
    public void act()
    {
        if(Greenfoot.isKeyDown("up")){
            setDirection(UP);
            direccionDisparo=0;
        }
        if(Greenfoot.isKeyDown("down")){
            setDirection(DOWN);
            direccionDisparo=1;
        }
        if(Greenfoot.isKeyDown("left")){
            setDirection(LEFT);
            direccionDisparo=3;
        }
        if(Greenfoot.isKeyDown("right")){
            setDirection(RIGHT);
            direccionDisparo=2;
        }
        setDisparo(direccionDisparo);
    } 
    // la direccion y teclas con las que se activan los dos disparos son programadas.
    public void setDisparo(int direccion){
        if(isDisparo && Greenfoot.isKeyDown("x")){
            disparo d1 = new disparo(direccion);
            getWorld().addObject(d1, getX(),getY());
            isDisparo=false;
        }
        if (!isDisparo && !Greenfoot.isKeyDown("x")){
            isDisparo=true;
            //Greenfoot.playSound("disparo.wav");
        }
        if(isBellota && Greenfoot.isKeyDown("z")){
            bellota b1 = new bellota(direccion);
            getWorld().addObject(b1, getX(),getY());
            isBellota=false;
        }
        if (!isBellota && !Greenfoot.isKeyDown("z")){
            isBellota=true;
            Greenfoot.playSound("bellota.wav");
        }
    }
    // Se establece la rotacion de movimiento y el aceleramiento con la tecla
    // de espacio.
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
    
