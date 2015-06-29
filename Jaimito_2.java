import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Jaimito extends Enemigos
{
    public Jaimito(int iVel)
    {
        eArray[0] = new GreenfootImage("jaimito1.png");
        eArray[1] = new GreenfootImage("jaimito1izq.png");
        eArray[2] = new GreenfootImage("jaimito2.png");
        eArray[3] = new GreenfootImage("jaimito2izq.png");
        eArray[4] = new GreenfootImage("jaimito3.png");
        eArray[5] = new GreenfootImage("jaimito3izq.png");
        eArray[6] = new GreenfootImage("jaimito4.png");
        eArray[7] = new GreenfootImage("jaimito4izq.png");
        eArray[8] = new GreenfootImage("jaimito5.png");
        eArray[9] = new GreenfootImage("jaimito5izq.png");
    }

    public void act() 
    {
        condicionMovimiento();
    }
}

