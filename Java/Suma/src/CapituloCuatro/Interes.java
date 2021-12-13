//Calculo de un interes compuesto
package CapituloCuatro;

/**
 *
 * @author Emmanuel 23dms
 */
public class Interes {
    public static void main(String[]args){
        double monto,principal=1000.0,tasa=0.05;
        System.out.println("\nAnio\tMonto de deposito");
        for(int counter=1;counter<=10;counter++){
            monto=principal*Math.pow(1.0+tasa,counter);
            System.out.println("\n"+counter+"\t"+monto);
        }//Fin del for       
    }//Fin del main
}//Fin de la clase interes 
