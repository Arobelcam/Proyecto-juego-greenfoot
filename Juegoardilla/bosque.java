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
    // se establece la clase dle bosque
    public bosque()
    {    
        // Se crea el mundo con la dimensiones deseadas en conjunto con las
        //serpientes en el mapa
        super(800, 500, 1);
        ardilla a1=new ardilla();
        addObject(a1,40, 200);
        crearSerpientes(6);
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
    
}
