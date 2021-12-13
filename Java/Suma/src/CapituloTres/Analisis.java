
package CapituloTres;
import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class Analisis {
    public void procesadorDeResultadosExamen(){
        Scanner entrada=new Scanner(System.in);
        int reprobados=0,aprobados=0,contador=1,resultado;
        while(contador<=10){
            System.out.println("Escriba el resultado (1=aprobado, 2=reprobado)");
            resultado=entrada.nextInt();
            if(resultado==1)
                aprobados++;
            else 
                reprobados++;
            contador++;
        }//Fin del while
        System.out.println("\nAprobados:\t"+aprobados+"\treprobados;\t"+reprobados);
        if (aprobados>=8)
            System.out.println("Se aumenta la colegiatura");
        else
            System.out.println("No se aumenta la colegiatura");
    }//Fin del matodo
    
}//Fin de la clase Analisis
