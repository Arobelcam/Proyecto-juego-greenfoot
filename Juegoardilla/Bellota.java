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
    // Se programan el disparo especial con casi las mismas caracteristicas del anterior, pero como cambios la velocidad de este disparo es 3 veces la 
    //del anterior disparo y tambien al impactar con las serpientes se generan dos nuevas serpientes en el mapa.
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
        //se dan los argumntos para crear dos serpientes cuando se impacta
        //contra esta serpiente con la bellota
        Actor serpiente=getOneObjectAtOffset(0,0,serpiente.class);
        if(serpiente!=null){
            bosque bosq=(bosque)getWorld();
            getWorld().removeObject(serpiente);
            bosq.puntos.incrementar();
            bosq.crearSerpientes(2);
            //getWorld().removeObject(this);
        }
        //Se remueve el disparo al salir de los bordes de la pantalla
        if((getX()>=getWorld().getWidth()-5)||(getX()<=5)){
            getWorld().removeObject(this);
        }
        else
            if((getY()>=getWorld().getHeight()-5)||(getY()<=5)){
                getWorld().removeObject(this);
            }
    }
}