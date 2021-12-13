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
public class MenosUno {
    public static void main(String[]args){
        int num=0;
        Scanner entrada=new Scanner(System.in);
        
        while(num!=-1){
            System.out.println("Introduce un numero");
            num=entrada.nextInt();
            if(num==-1){
                System.out.println("Fin del programa");
            }
        }
       
    }
}
