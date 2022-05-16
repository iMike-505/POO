public class HolaClase {
    
    static double cuadrado(double x)
    {
        double res;
        res = x*x;
        return res;
    }
    public static void main(String[] args) {
        Hora ahorita;
        Hora horaFeliz = new Hora();        
        horaFeliz.estableceHora(34);
        horaFeliz.estableceMinuto(920);
        ahorita = new Hora();
        ahorita.estableceHora(12);
        ahorita.estableceMinuto(30);       
        //System.out.print(ahorita.hora+":"+ahorita.minuto+"\n");
        //System.out.print(horaFeliz.hora+":"+horaFeliz.minuto+"\n");
        ahorita.Pinta();
        horaFeliz.Pinta();
        
    }
    
}
