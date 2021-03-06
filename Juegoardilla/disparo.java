import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class disparo extends Actor
{
    int disparoImage = 1;
    int velocidaddisparo= 2;
    int posicion;
    
    public disparo(int direccion){
        posicion=direccion;
    }
    //Se establecen los parametros principales para los disparos , como su direccion y velocidad en el mapa 
    public void act()
    {
        switch(posicion){
            case 0:
                setLocation(getX(),getY()-velocidaddisparo);
            break;
            case 1:
                setLocation(getX(),getY()+velocidaddisparo);
            break;
            case 2:
                setLocation(getX()+velocidaddisparo,getY());
            break;
            case 3:
                setLocation(getX()-velocidaddisparo,getY());
            break;  
        }
        Actor serpiente=getOneObjectAtOffset(0,0,serpiente.class);
        if(serpiente!=null){
            bosque bosq=(bosque)getWorld();
            getWorld().removeObject(serpiente);
            bosq.puntos.incrementar();
            bosq.crearSerpientes(1);
            //getWorld().removeObject(this);
        }
        if((getX()>=getWorld().getWidth()-5)||(getX()<=5)){
            getWorld().removeObject(this);
        }
        else
            if((getY()>=getWorld().getHeight()-5)||(getY()<=5)){
                getWorld().removeObject(this);
            }
        }
}
