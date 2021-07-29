import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class bosque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bosque extends World
{
    public vidas objvida;
    Tablero puntos;
    Tablero vidas;
    // se establece la clase dle bosque
    public bosque()
    {    
        // Se crea el mundo con la dimensiones deseadas en conjunto con las
        //serpientes en el mapa
        super(800, 500, 1);
        setPaintOrder(GameOver.class,Tablero.class,serpiente.class,ardilla.class);
        ardilla a1=new ardilla();
        addObject(a1,40, 200);
        crearSerpientes(6);
        objvida= new vidas();
        puntos=new Tablero(0,"Puntaje:");
        vidas=new Tablero(3, "Vidas:");
        addObject(puntos,150,85);
        addObject(vidas,300,85);
        crearhongo(3);
    }
    //Se indica que las serpientes aparezcan de forma aleatoria
    public void crearSerpientes(int numero){
        for(int i=0;i<numero;i++){
            serpiente s=new serpiente();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(s,x,y);
        }
    }
    //Metodo que permite la aparicion aleatoria de hongos en el mapa.
    public void crearhongo(int numero){
        for(int i=0; i<numero;i++){
            hongo h=new hongo();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            int hon=Greenfoot.getRandomNumber(5);
            if(hon==4)
                addObject(h,x,y);
        }
        
    }
    
}
