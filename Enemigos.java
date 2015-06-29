import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Muestra en pantalla a los enemigos del chavo
 * Esta clase heredara a sus subclases el movimiento de los enemigos
 * 
 * @author (Daniel) 
 * @version (13/06/15)
 */
public class Enemigos extends Actor
{
    private int iDireccion;
    private int iMovimiento;
    private int iC;
    protected GreenfootImage[] eArray = new GreenfootImage[10]; 
    public Enemigos()
    {
        iDireccion = 1;
        iMovimiento = 0; 
        for(iC=0; iC<10; iC++)
        {
            eArray[iC] = null;
        }
    }

    public void condicionMovimiento()
    {
        if(isTouching(Plataforma.class)){
            movimiento();
        }
        else{
            if(!isTouching(Plataforma.class)&&(iDireccion == 1)){
                iDireccion = 2;
                move(-2);
                setImage(eArray[1]);
                iMovimiento = 1;
            }
            if(!isTouching(Plataforma.class)&&(iDireccion == 2)){
                iDireccion = 1;
                move(2);
                setImage(eArray[0]);
                iMovimiento = -1;
            }            
        }

    }

    public void movimiento()
    {
        /**
         * iMovimiento se encarga de la animacion del personaje.
         */
        if(iDireccion == 1){
            move(2);
            if(iMovimiento == 1){
                setImage(eArray[0]);
            }
            if(iMovimiento == 4){
                setImage(eArray[2]);
            }
            if(iMovimiento == 7){
                setImage(eArray[4]);
            }
            if((!isTouching(Chavito.class))&&(iMovimiento == 10)){
                iMovimiento = 0;
                setImage(eArray[0]);
            }
            if(isTouching(Chavito.class)){
                if(iMovimiento == 13){
                    setImage(eArray[6]);
                    iMovimiento++;
                }
                if(iMovimiento == 16){
                    setImage(eArray[8]);
                    iMovimiento = 0;
                }
            }
            iMovimiento++;
        }
        if(iDireccion == 2){
            move(-2);
            if(iMovimiento == -1){
                setImage(eArray[1]);
                iMovimiento--;
            }
            if(iMovimiento == -4){
                setImage(eArray[3]);
                iMovimiento--;
            }
            if(iMovimiento == -7){
                setImage(eArray[5]);
                iMovimiento--;
            }
            if((!isTouching(Chavito.class))&&(iMovimiento == -10)){
                iMovimiento = 0;
                setImage(eArray[1]);
            }
            if(isTouching(Chavito.class)){
                if(iMovimiento == -13){
                    setImage(eArray[7]);
                    iMovimiento--;
                }
                if(iMovimiento == -16){
                    setImage(eArray[9]);
                    iMovimiento = 0;
                }
            }
            iMovimiento--;
        }
    }
}