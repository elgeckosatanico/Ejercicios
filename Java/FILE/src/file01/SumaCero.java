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
public class SumaCero {
    public static void main(String[]args){
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Escribe hasta que numero decea sumar");
        int num=entrada.nextInt();
        
        if(num<=1) System.out.println("Erros el numero debe ser mayor a 1"); 
        else{
          int i=1;
          int sum=0;
          while(i<=num){
              sum=sum+i;                            
              i++;              
          }   
          System.out.println(sum);  
        }        
    }
}
