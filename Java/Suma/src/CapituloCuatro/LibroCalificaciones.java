//Switch
package CapituloCuatro;
import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class LibroCalificaciones {
    private String nombreDelCurso;
    private int counter;
    private int aCalif;
    private int bCalif;
    private int cCalif;
    private int dCalif;
    private int fCalif;
    private int total;

    public  LibroCalificaciones(String nombre) {
         nombreDelCurso=nombre;
    }//Fin del constructor
   
    public void establecerNombreDelCurso(String nombre){
     nombreDelCurso=nombre;
    }//Fin del metodo establecerNombreDelCurso

    public String obtenerNombreDelCurso(){
     return nombreDelCurso;
    }//Fin del metodo obtenerNombreDelCurso

    public void mensaje(){
     System.out.println("\nBienvenido al libro de calificaciones para el curso\t"+obtenerNombreDelCurso());
    }//Fin del metodo mensaje

    public void introducirCalif(){
         Scanner entrada=new Scanner(System.in);
         int calificacion;
         System.out.printf("Escriba las calificaciones entera en un rango de 0 a 100"+
            "\nEscriba el indicador de fin de archivo para terminar la entrada:"+
            "\nEn UNIX/Linux/Mac OS X escriba <ctrl> d y después oprima Intro"+
            "\nEn Windows escriba <ctrl> z y después oprima Intro\n");
         while(entrada.hasNext()){
             calificacion=entrada.nextInt();
             total+=calificacion;
             counter++;
            incrementarContadorCalifLetra(calificacion);
        }//Fin del while
    }//Fin del metodo introducirCalif

    public void incrementarContadorCalifLetra(int calificacion){
         switch(calificacion/10){
             case 10:
             case 9:
                 ++aCalif;
                 break;        
             case 8:
                 ++bCalif;
                 break;           
             case 7:
                 ++cCalif;
                 break;            
             case 6:
                 ++dCalif;
                 break;            
             default:
                 ++fCalif;
                 break;
        }//Fin del switch
    }//Fin del metodo incrementarContadorCalifLetra

    public void mostrarReporteCalif(){
         System.out.println("\nReporte de calificaciones:");
         if(counter!=0){
             double promedio=(double) total/counter;
             System.out.println("\nEl total de las\t"+counter+"\tintroducidas es:\t"+total);
             System.out.println("\nEl promedio de la clase es:\t"+promedio);
             System.out.println("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n"+
                "Numero de estudiantes que recibieron las siguientes calificaciones:"+
                "A:"+aCalif+
                "B:"+bCalif+
                "C:"+cCalif+
                "D:"+dCalif+
                "F:"+fCalif);
         }//Fin del if
         else
             System.out.println("\nNo se introdujeron calificaciones");
    }//Fin del metodo mostrarReporteCalif
}//Fin de la clase LibroCalificaciones
