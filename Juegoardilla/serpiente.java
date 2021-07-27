import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class serpiente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class serpiente extends Actor
{
    public void act()
    {
        // Se define el movimiento aleatorio que tendrán las serpiente en el mapa
        move(2);
        World m=getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
            turn(Greenfoot.getRandomNumber(90-45));
        }
        // Con el metodo move y getrandom se logra el movimiento aleatorio
        }
        if(getY()>=m.getHeight()-5||getY()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
            turn(Greenfoot.getRandomNumber(90-45));
        }
        }
         Actor ardilla=getOneObjectAtOffset(0,0,ardilla.class);
         if(ardilla!=null){
             bosque bosq=(bosque)getWorld();
             getWorld().removeObject(ardilla);
             bosq.objvida.Disminuir();
             getWorld().addObject(new ardilla(),50,300);
         }
        }
    }

