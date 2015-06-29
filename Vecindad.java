import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Crea todo lo que interactuara en el mundo.
 * 
 * @author (Daniel)
 * @version (5)
 */
public class Vecindad extends World
{
    private GreenfootSound soundBoton = new GreenfootSound("musica-01.wav");
    private List listAux = new ArrayList();
    private List listAux2 = new ArrayList();
    private List<Enemigos> listAux3 = new ArrayList<Enemigos>();
    private List<Animacion> listAux4 = new ArrayList<Animacion>();
    private Chavito chavo;
    private Chilindrina chilin;
    private Plataforma1 plataforma;
    private Plataforma2 plataforma1;
    private Plataformita p1;
    private Plataforma pla1;
    private Plataforma pla2;
    private Plataforma pla3;
    private Escalera stair;
    private Escalera stair2;
    private Escalera stair3;
    private Escalera stair4;
    private Escalera stair5;
    private Escalera stair6;
    private Escalera stair7;
    private Escalera stair8;
    private Paty popis;
    private Vecindad1 esc1;
    private Vecindad2 esc2;
    private Vecindad3 esc3;
    private Vecindad4 esc4;
    private Vecindad5 esc5;
    private int iNivel;
    private LifeSpawn barra;
    private donRamonAnimacion1 ramon;
    private jirafalesAnimacion1 jirafa;
    private kikoAnimacion1 federico;
    private srBarriga barriga;
    private Godinez godi;
    private Jaimito cartero;
    private Kiko cachetes;
    private Ramon ronDamon;
    private int iVelos;
    /**
     * Crea todos los objetos;
     */
    public Vecindad()
    {    
        super(1020, 544, 1);
        barra = new LifeSpawn(0);
        iNivel = 1;
        iVelos = iNivel;
        chavo = new Chavito();
        chilin = new Chilindrina();
        plataforma = new Plataforma1();
        plataforma1 = new Plataforma2();
        pla1 = new Plataforma();
        pla2 = new Plataforma();
        pla3 = new Plataforma();
        stair = new Escalera();
        stair2 = new Escalera();
        stair3 = new Escalera();
        stair4 = new Escalera();
        stair5 = new Escalera();
        stair6 = new Escalera();
        stair7 = new Escalera();
        popis = new Paty();    
        esc1 = new Vecindad1();
        esc2 = new Vecindad2();
        esc3 = new Vecindad3();
        esc4 = new Vecindad4();
        esc5 = new Vecindad5();
        ramon = new donRamonAnimacion1();
        jirafa = new jirafalesAnimacion1();
        federico = new kikoAnimacion1();
        barriga = new srBarriga();
        godi = new Godinez(iVelos*2);
        cartero = new Jaimito(iVelos*2);
        cachetes = new Kiko(iVelos*3);
        ronDamon = new Ramon(iVelos*3);
    }

    /**
     * Llama al metodo que crea todo el mundo.
     */
    public void act()
    {
        setAddObjects(iNivel);
    }

    public void setAddObjects(int iAcomodar)
    {
        /**
         * Dependiendo del nivel
         * se añadiran en cierto orden las ecaleras
         * y tambien las plataformas.
         */
        soundBoton.play();
        iNivel = iAcomodar;
        if(iNivel == 1){
            addObject(esc1,(getWidth()/2),(getHeight()/2));
            addObject(barra,80,50);
            addObject(pla1,511,245);
            addObject(pla2,473,395);
            addObject(pla3,549,95);
            addObject(plataforma,511,282);
            addObject(stair,280,450);
            addObject(stair2,750,450);
            addObject(stair3,640,298);
            addObject(stair4,465,145);
            addObject(stair5,750,145);
            addObject(chavo,100,485);
            addObject(chilin,600,40);
            addObject(popis,800,40);
            addObject(ramon,(getWidth()-80),485);
            addObject(barriga,300,190);
            addObject(godi,400,340);
            addObject(cartero,500,40);
        }
        if(iNivel == 2){ 
            addObject(esc2,(getWidth()/2),(getHeight()/2));
            addObject(barra,80,50);
            addObject(pla1,511,245);
            addObject(pla2,473,395);
            addObject(pla3,549,95);
            addObject(plataforma,511,282);
            addObject(stair,300,450);
            addObject(stair2,750,450);
            addObject(stair3,500,298);
            addObject(stair4,600,145);
            addObject(stair5,400,145);
            addObject(stair7,700,145);
            addObject(chavo,100,485);
            addObject(chilin,600,40);
            addObject(popis,800,50);
            addObject(jirafa,(getWidth()-80),485);
            addObject(cachetes,300,190);
            addObject(ronDamon,400,340);
            addObject(cartero,500,40);
        }
        if(iNivel == 3){
            addObject(esc3,(getWidth()/2),(getHeight()/2));
            addObject(barra,80,50);
            addObject(pla1,511,245);
            addObject(pla2,473,395);
            addObject(pla3,549,95);
            addObject(plataforma,511,282);
            addObject(stair,280,450);
            addObject(stair2,750,450);
            addObject(stair3,640,298);
            addObject(stair4,465,145);
            addObject(stair5,750,145);
            addObject(chavo,100,485);
            addObject(chilin,600,40);
            addObject(popis,800,50);
            addObject(federico,(getWidth()-80),485);
            addObject(ronDamon,300,190);
            addObject(barriga,400,340);
            addObject(cartero,500,40);
        }
        if(iNivel == 4){
            addObject(esc4,(getWidth()/2),(getHeight()/2));
            addObject(barra,80,50);
            addObject(pla1,511,245);
            addObject(pla2,473,395);
            addObject(pla3,549,95);
            addObject(plataforma,511,282);
            addObject(stair,300,450);
            addObject(stair2,750,450);
            addObject(stair3,500,298);
            addObject(stair4,600,145);
            addObject(stair5,400,145);
            addObject(stair7,700,145);
            addObject(chavo,100,485);
            addObject(chilin,600,40);
            addObject(popis,800,50);
            addObject(ramon,(getWidth()-80),485);
            addObject(jirafa,(getWidth()-180),485);
            addObject(barriga,300,190);
            addObject(godi,400,340);
            addObject(cartero,500,40);
        }
        if(iNivel == 5){
            addObject(esc5,(getWidth()/2),(getHeight()/2));
            addObject(barra,80,50);
            addObject(pla1,511,245);
            addObject(pla2,473,395);
            addObject(pla3,549,95);
            addObject(plataforma,511,282);
            addObject(stair,280,450);
            addObject(stair2,750,450);
            addObject(stair3,640,298);
            addObject(stair4,465,145);
            addObject(stair5,750,145);
            addObject(chavo,100,485);
            addObject(chilin,600,40);
            addObject(popis,800,50);
            addObject(federico,(getWidth()-80),485);
            addObject(jirafa,(getWidth()-180),485);
            addObject(barriga,300,190);
            addObject(godi,400,340);
            addObject(cartero,500,40);
        }
    }

    /**
     * Remueve todos los objetos al cambiar de nivel.
     */
    public void eliminaVecindad(int Acomodar)
    {      
        removeObject(chilin);
        removeObject(barra);
        removeObject(chavo);
        removeObject(popis);
        removeObject(pla1);
        removeObject(pla2);
        removeObject(pla3);
        removeObject(plataforma);
        removeObject(plataforma1);
        removeObject(stair);
        removeObject(stair2);
        removeObject(stair3);
        removeObject(stair4);
        removeObject(stair5);
        removeObject(stair6);
        removeObject(stair7);
        removeObject(p1);
        listAux = getObjects(Obstaculos.class);
        listAux2 = getObjects(Torta.class);
        listAux3 = getObjects(Enemigos.class);
        listAux4 = getObjects(Animacion.class);
        removeObjects(listAux);
        removeObjects(listAux2);
        removeObjects(listAux3);
        removeObjects(listAux4);
        iNivel = iNivel +1;
        setCreate(iNivel);
    }

    /**
     * Despues de eliminar el mundo crea uno nuevo con nuevas condiciones.
     */
    public void setCreate(int Acomodar)
    {
        //iNivel = iNivel + 1;
        if(Acomodar == 1){
            esc1 = new Vecindad1();
        }
        if(Acomodar == 2){
            esc2 = new Vecindad2();
        }
        if(Acomodar == 3){
            esc3 = new Vecindad3();
        }
        if(Acomodar == 4){
            esc4 = new Vecindad4();
        }
        if(Acomodar == 5){
            esc5 = new Vecindad5();
        }
        barra = new LifeSpawn(0);
        chavo = new Chavito();
        chilin = new Chilindrina();
        plataforma = new Plataforma1();
        plataforma1 = new Plataforma2();
        pla1 = new Plataforma();
        pla2 = new Plataforma();
        pla3 = new Plataforma();
        stair = new Escalera();
        stair2 = new Escalera();
        stair3 = new Escalera();
        stair4 = new Escalera();
        stair5 = new Escalera();
        stair6 = new Escalera();
        stair7 = new Escalera();
        popis = new Paty();
        setAddObjects(iNivel);
    }
}