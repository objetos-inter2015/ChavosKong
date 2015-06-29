import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ramon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ramon extends Enemigos
{
    public Ramon(int iVel)
    {
        eArray[0] = new GreenfootImage("ramon1.png");
        eArray[1] = new GreenfootImage("ramon1izq.png");
        eArray[2] = new GreenfootImage("ramon2.png");
        eArray[3] = new GreenfootImage("ramon2izq.png");
        eArray[4] = new GreenfootImage("ramon3.png");
        eArray[5] = new GreenfootImage("ramon3izq.png");
        eArray[6] = new GreenfootImage("ramon4.png");
        eArray[7] = new GreenfootImage("ramon4izq.png");
        eArray[8] = new GreenfootImage("ramon5.png");
        eArray[9] = new GreenfootImage("ramon5izq.png");
    }

    public void act()
    {
        condicionMovimiento();
    }  
}
