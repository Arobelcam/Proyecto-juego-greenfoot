import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
import java.util.*;
/**
 * Write a description of class bellota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class bellota extends Actor
{
    int disparoImage = 1;
    int velocidaddisparo= 8;
    int posicion;
    /**
     * Act - do whatever the bellota wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bellota(int direccion){
        posicion=direccion;
    }
    public void act(){
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
            bosq.crearSerpientes(2);
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