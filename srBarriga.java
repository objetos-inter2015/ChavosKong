import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Muestra al sr Barriga
 * 
 * @author (Daniel) 
 * @version (13/06/15)
 */
public class srBarriga extends Enemigos
{
    public srBarriga()
    {
        eArray[0] = new GreenfootImage("srbarriga1.png");
        eArray[1] = new GreenfootImage("srbarriga1izq.png");
        eArray[2] = new GreenfootImage("srbarriga2.png");
        eArray[3] = new GreenfootImage("srbarriga2izq.png");
        eArray[4] = new GreenfootImage("srbarriga3.png");
        eArray[5] = new GreenfootImage("srbarriga3izq.png");
        eArray[6] = new GreenfootImage("srbarriga4.png");
        eArray[7] = new GreenfootImage("srbarriga4izq.png");
        eArray[8] = new GreenfootImage("srbarriga5.png");
        eArray[9] = new GreenfootImage("srbarriga5izq.png");
    }
    public void act()
    {
        condicionMovimiento();
    }
}

