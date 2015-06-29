import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Muestra en pantalla una animacion de Don Ramon
 * 
 * @author (Daniel) 
 * @version (1)
 */
public class donRamonAnimacion1 extends Animacion
{
    /**
     * Hereda de su superclase la variable eErray y la inicialisa con las imagenes 
     * correspondientes a la animacion
     */
    public donRamonAnimacion1(){
        eArray[0] = new GreenfootImage("dranimacion1.png");
        eArray[1] = new GreenfootImage("dranimacion2.png");
    }

    /**
     * Hereda Animaicon2 de su superclase Animacion
     */
    public void act(){ 
        Animacion2();
    }    
}
