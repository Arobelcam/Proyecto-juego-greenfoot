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
    public Tablero(int c,String msj)
    {
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("Verdana",24));
        dibuja();
    }
    
    public void dibuja()
    {
        imagen.clear();
        imagen.drawString(mensaje+cont,20,20);
        setImage(imagen);
    }
    public void incrementar()
    {
        cont++;
        dibuja();
    }
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
