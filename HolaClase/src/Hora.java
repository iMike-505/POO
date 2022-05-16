
public class Hora {
    private int hora;
    private int minuto;
    void estableceMinuto(int miMinuto)
    {
        if (miMinuto>=0)
            minuto = miMinuto%60;
    }
    void estableceHora(int miHora)
    {
        if (miHora >= 0 && miHora <24)
            hora=miHora;
        else
            if (miHora > 0)
                hora = miHora%24;
            else
                System.out.println("Pocholongo");
    }
    void Pinta()
    {
      System.out.print(hora+":"+minuto+"\n");  
    }
    
}
