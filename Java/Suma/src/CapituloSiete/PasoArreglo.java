
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class PasoArreglo {
    public static void main(String[]args){
        int arreglo[]={1,2,3,4,5};
        System.out.println("valores del arreglo original:\n");
        for(int valor:arreglo)
            System.out.print(valor+"\t");
        modificarArreglo(arreglo);
        System.out.printf("\nLos valoress del arreglo modificado son:\n");
        for(int valor:arreglo)
            System.out.print(valor+"\t");
        System.out.printf("\narreglo[3] antes de modificar elemento:"+arreglo[3]);
        modificarElemento(arreglo[3]);
        System.out.printf("arreglo[3] despues de modificarElemento:"+arreglo[3]+"\n");        
    }//fin del main
    public static void modificarArreglo(int arreglo2[]){
        for(int contador=0;contador<arreglo2.length;contador++)
            arreglo2[contador]*=2;        
    }//fin del metodo modificararreglo
    public static void modificarElemento(int elemento){
        elemento*=2;
        System.out.println("\nvalor del elemento en modificar elemento:"+elemento);
    }//fin del metodo modificarelemento
}//fin de la clase pasoarreglo
