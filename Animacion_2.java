import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Animacion extends Actor
{
    protected GreenfootImage[] eArray = new GreenfootImage[3]; 
    public int iAnimacion;
    private int iC;
    /**
     * Inicialisa en null el array, ya que despues las subclases lo inicialisaran de manera correcta
     */
    public Animacion()
    {
        iAnimacion = 0;
        for(iC=0; iC<3; iC++)
        {
            eArray[iC] = null;
        }
    }

    /**
     * Animacion1 es la animacion a 3 imagenes
     */
    public void Animacion1() 
    {
        if(iAnimacion == 0){
            setImage(eArray[0]);
        }
        if(iAnimacion == 30){
            setImage(eArray[1]);
        }
        if(iAnimacion == 60){
            setImage(eArray[2]);
        }
        if(iAnimacion == 80){
            iAnimacion = -1;
        }
        iAnimacion++;
    }
    
    /**
     * Animacion2 es la animacion a 2 imagenes
     */
    public void Animacion2()
    {
        if(iAnimacion == 0){
            setImage(eArray[0]);
        }
        if(iAnimacion == 30){
            setImage(eArray[1]);
        }
        if(iAnimacion == 60){
            iAnimacion = -1;
        }
        iAnimacion++;
    }

}
