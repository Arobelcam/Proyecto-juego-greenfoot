import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tablero extends Actor
{
    GreenfootImage imagen;
    int cont;
    String mensaje;
    // Se crea el metodo del tablero con sus respectivos atributos
    public Tablero(int c,String msj)
    {
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("Verdana",24));
        dibuja();
    }
    // Se crean los metodos que permiten que el tablero se grafique en la pantalla principal, y que cuando los puntos aumenten o las vidas disminuya esto
    //se vea reflejado en el tablero.
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje+cont,20,20);
        setImage(imagen);
    }
    //El el metodo para incrementar puntos en el tablero
    public void incrementar()
    {
        cont++;
        dibuja();
    }
    //Es el metodo para disminuir vidas del personaje en el tablero
    public void Disminuir()
    {
        cont--;
        dibuja();
    }
    public int obtenerValor()
    {
        return cont;
    }
}
