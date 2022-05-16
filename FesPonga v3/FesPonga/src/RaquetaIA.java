
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
public class RaquetaIA {
    private double columna;
    private double renglon;
    private double componenteY;
    private double componenteX;
    private String sprite;

    public RaquetaIA() {
        setSprite("|");
        inicia();
        
    }
    void inicia()
    {
        setColumna(LienzoStd.pideLimiteXMax()-1);
        setRenglon(LienzoStd.pideLimiteYMax()/2);
    }
    void Pinta()
    {
         LienzoStd.dibujo(getColumna(), getRenglon(), "C:\\Users\\ernes_000\\Documents\\NetBeansProjects\\FesPonga\\src\\raqueta.png");
       
        /*LienzoStd.texto(columna, renglon-1, sprite);
        LienzoStd.texto(columna, renglon, sprite);
        LienzoStd.texto(columna, renglon+1, sprite);
*/
    }
    void Mueve(Bola laPelota)
    {
        setRenglon(laPelota.getRenglon());
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
}
