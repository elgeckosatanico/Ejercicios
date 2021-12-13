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
public class DosNum {
    public static void main(String[]args){
        Scanner num=new Scanner(System.in);
        
        float num1, num2,suma,res,producto,div,resto;
        
        System.out.println("Escribe un numero");
        num1=num.nextFloat();
        
        System.out.println("Escribe el segundo numero");
        num2=num.nextFloat();
        
        suma=(num1+num2);
        res=(num1-num2);
        producto=(num1*num2);
        div=(num1/num2);
        resto=(num1%num2);
        
        System.out.println("Los resultados son:\n"+suma+"\n"+res+"\n"+producto+"\n"+div+"\n"+resto);
    }//Finish main
}
