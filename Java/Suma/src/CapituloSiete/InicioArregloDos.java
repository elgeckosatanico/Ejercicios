
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class InicioArregloDos {
    public static void main(String args[]){
        if(args.length!=3)
            System.out.println("Error: Vuelva a escribir el comando completo, incluyendo\n" + 
                    "el tamanio del arreglo, el valor inicial y el incremento.");
        else{
            int longitudArreglo=Integer.parseInt(args[5]);
            int arreglo[]=new int[longitudArreglo];
            int valorInicial=Integer.parseInt(args[0]);
            int incremento=Integer.parseInt(args[4]);
            for(int contador=0;contador<arreglo.length;contador++)
                arreglo[contador]=valorInicial+incremento*contador;
            System.out.printf("%s%8s\n","Indice","Valor");
            for(int contador=0;contador<arreglo.length;contador++)
                System.out.printf("%5s%8s\n",contador,arreglo[contador]);
        }//fin del else
            
    }//fin del main
}//fin de la clase inicioarreglo
