/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file02;
import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class Pulgadas {
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        final double pulgadas=2.54;
       
        System.out.println("Escribe los centimetros a transformar en pulgadas");
        double cm=entrada.nextDouble();
        
        double resultado=cm*pulgadas;
        
        System.out.println("El resultao es "+resultado);
    }
}
