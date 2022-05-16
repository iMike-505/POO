
import edu.epromero.util.LienzoStd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernes_000
 */
public class Bola {
    private double columna;
    private double renglon;
    private double cy;
    private double componenteX;
    private String sprite;
    public final double DERECHA = 1;
    public final double IZQUIERDA = -1;
    public final double ARRIBA = 1;
    public final double ABAJO = -1;
    public Bola() {
        setColumna(0);
        setRenglon(0);
        setSprite("*");
        setComponenteX(DERECHA);
        setCy(ARRIBA);
    }
    public Bola(double col, double ren) {
        setColumna(col);
        setRenglon(ren);
        setSprite("*");
        setComponenteX(DERECHA);
        setCy(ARRIBA);
    }
    public void Pinta()
    {
        LienzoStd.dibujo(getColumna(), getRenglon(), "C:\\Users\\ernes_000\\Documents\\NetBeansProjects\\FesPonga\\src\\pelota.png");
        //LienzoStd.texto(getColumna(), getRenglon(), getSprite());
    }
    

    public double getColumna() {
        return columna;
    }

    public void setColumna(double columna) {
        this.columna = columna;
    }

    public double getRenglon() {
        return renglon;
    }

    public void setRenglon(double renglon) {
        this.renglon = renglon;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public double getComponenteX() {
        return componenteX;
    }

    public void setComponenteX(double cx) {
        this.componenteX = cx;
    }
    
    void Mueve()
    {
        //Averiguar si se sale por la derecha
        if (columna > LienzoStd.pideLimiteXMax() )
            //cambiar el sentido
            setComponenteX(IZQUIERDA);
        //Averiguar si se sale por la izq
        if (columna < LienzoStd.pideLimiteXMin())
            setComponenteX(DERECHA);
        if (renglon > LienzoStd.pideLimiteYMax())
            setCy(ABAJO);
        if (renglon < LienzoStd.pideLimiteYMin())
            setCy(ARRIBA);
        
        //calculamos la posicion
        columna = columna + componenteX;
        renglon = renglon + cy;
        System.out.println("x :"+columna+" y: "+renglon+" cx: "+componenteX+ " cy: "+cy);
    }
}
