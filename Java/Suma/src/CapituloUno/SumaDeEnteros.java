//Suma de enteros
package CapituloUno;
import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class SumaDeEnteros {
    public static void main(String args[]){
        Scanner numero = new Scanner(System.in);
        double num1,num2,suma,producto;//Variables a sumar
        System.out.println("Escriba un numero");
        num1=numero.nextDouble();//Primer numero
        System.out.println("Escriba un segundo numero");
        num2=numero.nextDouble();
        suma=num1+num2;//Segundo numero
        producto=num1*num2;
        System.out.println("La suma es\t"+suma);
        System.out.println("El producto es\t"+producto);
    }//Fin del main
    
}//Fin de la clase principal
