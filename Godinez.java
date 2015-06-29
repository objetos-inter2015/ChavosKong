import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Muestra a Godinez
 * 
 * @author (Daniel) 
 * @version (13/06/15)
 */
public class Godinez extends Enemigos
{
    public Godinez(int iVel)
    {
        eArray[0] = new GreenfootImage("godinez1.png");
        eArray[1] = new GreenfootImage("godinez1izq.png");
        eArray[2] = new GreenfootImage("godinez2.png");
        eArray[3] = new GreenfootImage("godinez2izq.png");
        eArray[4] = new GreenfootImage("godinez3.png");
        eArray[5] = new GreenfootImage("godinez3izq.png");
        eArray[6] = new GreenfootImage("godinez4.png");
        eArray[7] = new GreenfootImage("godinez4izq.png");
        eArray[8] = new GreenfootImage("godinez5.png");
        eArray[9] = new GreenfootImage("godinez5izq.png");
    }

    public void act() 
    {
        condicionMovimiento();
    }
}

