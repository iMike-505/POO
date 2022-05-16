
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
public class RaquetaSinI {
     private double columna;
    private double renglon;
    private double componenteY;
    private double componenteX;
    private String sprite;
    private int vidas;

    public RaquetaSinI() {
        setSprite("|");
        inicia();
        
    }
    void inicia()
    {
        setColumna(LienzoStd.pideLimiteXMin()+1);
        setRenglon(LienzoStd.pideLimiteYMax()/2);
        setVidas(3);
    }
    void Pinta()
    {
         LienzoStd.dibujo(getColumna(), getRenglon(), "C:\\Users\\ernes_000\\Documents\\NetBeansProjects\\FesPonga\\src\\raqueta.png");
       /*
        LienzoStd.texto(columna, renglon-1, sprite);
        LienzoStd.texto(columna, renglon, sprite);
        LienzoStd.texto(columna, renglon+1, sprite);
*/
    }
    void Mueve(int tecla,Bola b)
    {
        if (tecla == 1)
            if (renglon +5 < LienzoStd.pideLimiteYMax())
            renglon = renglon+5;
        if (tecla == -1)
            if (renglon -5 > LienzoStd.pideLimiteYMin())
            renglon -= 5;
      
        if (b.getColumna() == getColumna())
            if (b.getRenglon() != getRenglon() )
               vidas-- ;
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

    public double getComponenteY() {
        return componenteY;
    }

    public void setComponenteY(double componenteY) {
        this.componenteY = componenteY;
    }

    public double getComponenteX() {
        return componenteX;
    }

    public void setComponenteX(double componenteX) {
        this.componenteX = componenteX;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
