//Compara dos enteros
package CapituloUno;
import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class Comparacion {
    public static void main(String []args){
        Scanner entrada= new Scanner(System.in);
        double numero1,numero2;
        System.out.println("Ingrese un numero");
        numero1=entrada.nextDouble();
        System.out.println("Ingrese un segundo numero");
        numero2=entrada.nextDouble();
        if(numero1<numero2)
            System.out.println(numero2+"\tEs mayor que\t"+numero1);
        //Fin del if comparacion numero2 mayor que numero1
         if(numero1>numero2)
            System.out.println(numero1+"\tEs mayor que\t"+numero2); 
        //Fin del if comparacion de numero1 mayor que numero2   
        if(numero1==numero2)
            System.out.println(numero1+"\ty\t"+numero2+"\tson numeros iguales");
        //Fin del if comparacion de dos numeros iguales
    }//Fin del main    
}//Fin de la clase comparacio
