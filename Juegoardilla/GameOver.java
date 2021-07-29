import greenfoot.*;

  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Se crea el metodo de gameover para mostrar el mensaje de juego terminado al perder las tres vidas del actor principal.
    GreenfootImage imagen;
    String mensaje;
    public GameOver()
    {
        imagen=new GreenfootImage(400,300);
        imagen.setColor(new Color(250,100,0,255));
        imagen.setFont(new Font("Verdana", 34));
        imagen.drawString("Fin del Juego",0,30);
        setImage(imagen);
        Greenfoot.stop();
    }
    public void act()
    {
        // Add your action code here.
    }
}
