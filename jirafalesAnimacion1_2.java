import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Muestra en pantalla una animacion de el Profesor Jirafales
 * 
 * @author (Daniel) 
 * @version (1)
 */
public class jirafalesAnimacion1 extends Animacion
{
    /**
     * Hereda de su superclase la variable eErray y la inicialisa con las imagenes 
     * correspondientes a la animacion
     */
    public jirafalesAnimacion1(){
        eArray[0] = new GreenfootImage("jirafalesanimacion1.png");
        eArray[1] = new GreenfootImage("jirafalesanimacion2.png");
        eArray[2] = new GreenfootImage("jirafalesanimacion3.png");
    }

    /**
     * Hereda el metodo Animacion1 de su superclase animacion
     */
    public void act(){ 
        Animacion1();
    }    
}

