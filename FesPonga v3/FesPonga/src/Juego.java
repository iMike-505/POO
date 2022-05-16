/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernes_000
 */
import edu.epromero.util.*;
import static java.awt.event.KeyEvent.*;
/**
 * Clase Juego
 * Administra los objetos del juego
 * DR. UNAM 2017
 * @author ernes_000
 */
public class Juego {
    private Bola  pelota;
    private RaquetaIA master;
    private RaquetaSinI yo;
    Juego ()
    {
        pelota = new Bola();
        master = new RaquetaIA();
        yo= new RaquetaSinI();
        inicia();
    }
    /** 
     * Inicia. Da valores iniciales a los objetos del juego
     */
    void inicia()
    {
       /* Establece la escala*/
       LienzoStd.ponEscalaX(0, 80);
       LienzoStd.ponEscalaY(0, 100);
       master.inicia();
       yo.inicia();
    }
    void Mueve()
    {
        double x,y;
        int tecla=0;
        x=LienzoStd.mouseX();
        y=LienzoStd.mouseY();
        
        if (LienzoStd.isKeyPressed(VK_UP))
        {
            tecla=1;
            LienzoStd.texto(x, y, "arriba");
        }
        else
        if (LienzoStd.isKeyPressed(VK_DOWN))
        {
            tecla=-1;
            LienzoStd.texto(x, y, "abajo");
        }
        else
        {
            if (y > yo.getRenglon())
        {
            tecla=1;
        }
        if (y < yo.getRenglon())
        {
            tecla = -1;
        }
        }
        LienzoStd.texto(x, y, "o");
        pelota.Mueve();
        master.Mueve(pelota);
        yo.Mueve(tecla,pelota);
        LienzoStd.texto(10, 10, "Vidas restantes"+yo.getVidas());
               
    }   
    void Pinta()
    {
        pelota.Pinta();
        master.Pinta();
        yo.Pinta();
    }
    void Borra()
    {
        
        LienzoStd.limpia();
    }

    public Bola getPelota() {
        return pelota;
    }

    public void setPelota(Bola pelota) {
        this.pelota = pelota;
    }

    public RaquetaIA getMaster() {
        return master;
    }

    public void setMaster(RaquetaIA master) {
        this.master = master;
    }

    public RaquetaSinI getYo() {
        return yo;
    }

    public void setYo(RaquetaSinI yo) {
        this.yo = yo;
    }
    
}
