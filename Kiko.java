import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Animacion de kiko moviendose.
 * 
 * @author (Daniel) 
 * @version (1)
 */
public class Kiko extends Enemigos
{ 
    public Kiko(int iVel)
    {
        eArray[0] = new GreenfootImage("kiko1.png");
        eArray[1] = new GreenfootImage("kiko1izq.png");
        eArray[2] = new GreenfootImage("kiko2.png");
        eArray[3] = new GreenfootImage("kiko2izq.png");
        eArray[4] = new GreenfootImage("kiko3.png");
        eArray[5] = new GreenfootImage("kiko3izq.png");
        eArray[6] = new GreenfootImage("kiko4.png");
        eArray[7] = new GreenfootImage("kiko4izq.png");
        eArray[8] = new GreenfootImage("kiko5.png");
        eArray[9] = new GreenfootImage("kiko5izq.png");
    }

    public void act() 
    {
        condicionMovimiento();
    }
}
