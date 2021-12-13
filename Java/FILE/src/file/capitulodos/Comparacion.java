/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulodos;

import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class Comparacion {
    public static void main(String[]args){
        
        Scanner num=new Scanner(System.in);
        
        int num1,num2;
        
        System.out.println("Escriba un numero");
        num1=num.nextInt();
        
        System.out.println("Escriba el otro numero");
        num2=num.nextInt();
        
        if(num1==num2){
            System.out.println(num1+" y "+num2+" son iguales");
        }
        else
            if(num1<num2){
                System.out.println(num1+" es menor a "+num2);
            }
            else
                System.out.println(num1+" es mayor a "+num2);   
    }  
}
