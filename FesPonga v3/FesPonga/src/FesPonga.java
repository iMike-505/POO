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
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
public class FesPonga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i;
       String s;
       Juego azteca= new Juego();

        try {
       while(azteca.getYo().getVidas() > 0)
       {
           
           azteca.Mueve();
           azteca.Pinta();
           LienzoStd.mostrar(0);
           sleep(50);
           LienzoStd.mostrar(0);
           azteca.Borra();
       }
       } catch (InterruptedException ex) {
               StdOut.print("No se durmio");
               Logger.getLogger(FesPonga.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    
}
