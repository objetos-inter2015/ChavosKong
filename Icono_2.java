import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Coloca las imagenes de los iconos en el menu
 * 
 * @author (Daniel) 
 * @version (a version number or a date)
 * Creditos para caracteres Larousse
 */
public class Icono extends Actor
{
    private int iNum;
    protected int desaparece;
    public void act() 
    {
        iNum = 0;
    }
    
    public void mouseSobreBoton(){
        if(Greenfoot.mouseMoved(this)){
            this.getImage().scale(160,60);
        }
        else{
            this.getImage().scale(150,50);
        }      
    }
        
}
