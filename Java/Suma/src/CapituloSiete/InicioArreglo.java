
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class InicioArreglo {
    public static void main(String[]args){
        int arreglo1[][]={{1,2,3},{4,5}};
        int arreglo2[][]={{1,2},{3,4,5}};
        System.out.println("Loa valores en el arreglo uno por fila son:");
        imprimirArreglo(arreglo1);
        System.out.println("Los valores del arreglo dos por fila son:");
        imprimirArreglo(arreglo2);       
    }//fin del main
    public static void imprimirArreglo(int arreglo[][]){
        for(int fila=0;fila<arreglo.length;fila++){
            for(int columna=0;columna<arreglo[fila].length;columna++){
                System.out.print(arreglo[fila][columna]+"\t");
            }//fin del for interior
            System.out.println();
        }//fin del for exterior
    }//fin del metodo imprimirarreglo
}//fin de la clase inicioarreglo
