
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class SumaArreglo {
   public static void main(String[]args){
       int arreglo[]={9,10,11,20,22,23,24,25,27,31,32,33,55,99,666};
       int total=0;
       for(int contador=0;contador<arreglo.length;contador++)
           total+=arreglo[contador];
       System.out.println("La suma total es:\t"+total);
   } //fin del main
}//fin de la clase sumaarreglo
