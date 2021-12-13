
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class GraficoBarras {
    public static void main(String[]args){
        int arreglo[]={0,1,0,3,4,6,7,0,1,0};
        System.out.println("Distribucion de calificaciones");
        for(int contador=0;contador<arreglo.length;contador++){
            if(contador==10)
                System.out.printf("100:\t");
            else
                System.out.printf(contador*10+"-"+(contador*10+9)+":");
            for(int estrella=0;estrella<arreglo[contador];estrella++)
                System.out.printf("*");
            System.out.println();                                             
        }//fin del for
    }//fin del maini
}//fin de la clase graficobarras
