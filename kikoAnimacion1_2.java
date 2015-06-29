import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Muestra una anicaion en pantalla
 * 
 * @author (Daniel) 
 * @version (1)
 */
public class kikoAnimacion1 extends Animacion
{
    /**
     * Hereda de su superclase la variable eErray y la inicialisa con las imagenes 
     * correspondientes a la animacion
     */
    public kikoAnimacion1(){
        eArray[0] = new GreenfootImage("kikoanimacion1.png");
        eArray[1] = new GreenfootImage("kikoanimacion2.png");
        eArray[2] = new GreenfootImage("kikoanimacion3.png");
    }

    /**
     * Hereda el metodo Animacion1 de su superclase animacion
     */
    public void act(){ 
        Animacion1();
    }   
}

