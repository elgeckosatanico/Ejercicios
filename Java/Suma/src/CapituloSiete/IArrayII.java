
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class IArrayII {
    public static void main(String[]args){
        final int LONGITUD_ARREGLO=10;
        int arreglo[]=new int[LONGITUD_ARREGLO];
        for(int contador=0;contador<arreglo.length;contador++)
            arreglo[contador]=2+2*contador;        
        System.out.println("Indice\tValor");
        for(int contador=0;contador<arreglo.length;contador++)
            System.out.println(contador+"\t"+arreglo[contador]);
    }//end of the main
}//end of the class iarrayii
