/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file01;
import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class ParOImpar {
    public static void main(String []args){
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduzca un numero");
        int numero=entrada.nextInt();
        
        if(numero%2==0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
        
    }
}
