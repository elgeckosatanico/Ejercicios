
package fes.aragon.Prefija;

import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class Inicio {
   public static void main(String[] args) {
        String cadena  ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una expresion: ");
        cadena = scan.next();
        ArbolBinario ar = new ArbolBinario(cadena);   
        ar.crearArbol(); 
        ar.imprimirNivel();
            System.out.println("---------------");
            Evaluacion eval=new Evaluacion(ar);
        System.out.println("");
        eval.evaluar();
        System.out.println(eval.getEvaluacion());
           
    } 
}
