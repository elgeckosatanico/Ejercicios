
package CapituloCuatro;
import java.util.Scanner;

/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaLibroCalificaciones {
    public static void main(String[]args){
       LibroCalificaciones mlc=new LibroCalificaciones("Introduccion a la programacion en java");
       mlc.mensaje();
       mlc.introducirCalif();
       mlc.mostrarReporteCalif();
    }//Fin del main
}//Fi de la clase PruebaLibroCalificaciones
