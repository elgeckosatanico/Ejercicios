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
public class Ascii {
    public static void main(String []args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num=entrada.nextInt();
        char caracter=(char)num;
        System.out.println("Para el numero"+num+"le corresponde el caracter '"+caracter+"'");
    }
}
