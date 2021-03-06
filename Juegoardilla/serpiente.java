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
         // Se configura que al momento de que la serpiente pierda sus tres vidas, el "Fin del juego" de game over saldra en el centro del mapa.
        Actor ardilla=getOneObjectAtOffset(0,0,ardilla.class);
         if(ardilla!=null){
             bosque bosq=(bosque)getWorld();
             getWorld().removeObject(ardilla);
             bosq.vidas.Disminuir();
             Greenfoot.playSound("ardilla.wav");
             getWorld().addObject(new ardilla(),50,300);
             if(bosq.vidas.obtenerValor()==0){
                 GameOver t=new GameOver();
                 getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
             }
         }
        }
    }

