
public class Fraccion {
    private int num;
    private int den;

    
   // Constructores==============
    Fraccion ()
    {
        Asigna (0,1);
    }
    
    Fraccion (int miNum, int miDen)
    {
        Asigna(miNum,miDen);
    }
    
    Fraccion (Fraccion f)
    {
        Asigna(f);
    }
    //============================
    
    void Asigna(int miNum, int miDen)
    {
        setNum(miNum);
        setDen(miDen);
    }
    
    void Asigna(Fraccion f)
    {
        Asigna(f.getNum(),f.getDen());
    }
    
    /**
     * @return the num
     */
    public int getNum()
    {
        return num;
    }
    
    /**
     * @param miNum el numerador a establecer
     */
    public void setNum(int miNum)
    {
        this.num = miNum;
    }
    
    /**
     * @return the den
     */
    public int getDen()
    {
        return den;
    }
    
    /**
     * @param miDen El denominador a establecer
     */
    public void setDen(int miDen)
    {
        this.den = miDen;
    }

    Fraccion suma(Fraccion f)
    {
        Fraccion resultado = new Fraccion();
        resultado.setNum(num*f.getDen()+den*f.getNum());
        resultado.setDen(den*f.getDen());
        return resultado;
    }
    
    void Pinta()
    {
        System.out.println("("+num+"/"+den+")");
    }
    
    public static void main(String[] args)
    {
        Fraccion x1 = new Fraccion();
        Fraccion x2 = new Fraccion(1,2);
        Fraccion x3 = new Fraccion (x2);
        
        x1.Pinta();
        x2.Pinta();
        x3.Pinta();
        
        x1.Asigna(x2.suma(x3)); // x1=x2+x3
        x1.Pinta();
    }
    
}
