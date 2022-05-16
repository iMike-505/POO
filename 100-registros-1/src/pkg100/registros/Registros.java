package pkg100.registros;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Registros {
   
    public static void main(String[] args) 
           
            throws FileNotFoundException, IOException
    
    {
   
    String NombreAlumno, Plantel, NumCuenta, Semestre, Carrera,reg;
        int NumAlumnos;
        int registro ; 
        
        boolean prog =true;
      
        
        Scanner leerInt = new Scanner (System.in); 
        Scanner leerSt = new Scanner (System.in); 
        
          
          RandomAccessFile archivo;
          archivo= new RandomAccessFile( "100 registros.log","rw" );
          
          if (archivo.length()==0)
          {
            while (archivo.length()<5000)
          {
           for (int i =0;i<48;i++)
           {archivo.writeBytes( " " );}
           
          
          
           archivo.writeBytes( "\r\n" ); 
          }
          }
          System.out.println("total de registros: "+archivo.length()/50);
          do{
          
          System.out.println("Deseas capturar S/N");
          String a=leerSt.nextLine();
          if (a.equals("S")||a.equals("s"))
          {
          System.out.println("Numero de registro: ");

           registro=(leerInt.nextInt()*50)-50;
           
      
           System.out.println("Ingrese el nombre completo: ");
            NombreAlumno = leerSt.nextLine();
            System.out.println("Ingrese el numero de cuenta del alumno: ");
            NumCuenta = leerSt.nextLine();
            System.out.println("Ingrese el semestre del alumno (Numero): ");
            Semestre = leerSt.nextLine();
            System.out.println("Ingrese la clave de carrera: ");
            Carrera = leerSt.nextLine();
            System.out.println("Ingrese el plantel ");
            Plantel = leerSt.nextLine();
          
            archivo.seek(registro);
           
            archivo.writeBytes( NombreAlumno );
             for (int k = NombreAlumno.length(); k < 30; k++) 
                  archivo.writeBytes( " " );
            
             archivo.writeBytes( NumCuenta );
             for (int k = NumCuenta.length(); k < 10; k++) 
                  archivo.writeBytes( " " );
             
             archivo.writeBytes( Semestre );
             for (int k = Semestre.length(); k < 2; k++) 
                  archivo.writeBytes( " " );
             
             archivo.writeBytes( Carrera );
             for (int k = Carrera.length(); k < 3; k++) 
                  archivo.writeBytes( " " );
             
             archivo.writeBytes( Plantel );
             for (int k = Plantel.length(); k < 3; k++) 
             {
                 archivo.writeBytes( " " );
             }
                 
              
          }
       else
           prog=false;
          } 
         while(prog==true);
        
        System.out.println("¿Desea hacer una consulta [s/n]?");
        String cOpcion = leerInt.next();
        while(cOpcion.equals("s")||cOpcion.equals("S")){
         System.out.println("¿Que registro desea consultar?");
         
         registro=(leerInt.nextInt()*50)-50;
       reg = "";
        
         for ( int contador=registro;contador<registro+50;contador++){
                archivo.seek(contador);
             
               reg=reg+(char)archivo.readByte();

         }
             
                  System.out.println("Registro " + (registro+50)/50 + "\n "+reg);
              System.out.println("¿Desea hacer otra consulta? [s/n]"); 
             
              
         cOpcion = leerInt.next();
    }
    archivo.close();
    }
}
