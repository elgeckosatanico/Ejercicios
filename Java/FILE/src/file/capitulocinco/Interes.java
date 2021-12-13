/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulocinco;
import java.math.*;

/**
 *
 * @author Emmanuel 23dms
 */
public class Interes {
    public static void main(String []args){
        double monto,principal=1000,tasa=0.05;
        
        System.out.println("Año "+" Monto");
        
        for(int i=1;i<=10;i++){
            monto = principal*Math.pow(1+tasa, i);
            System.out.println(""+i +"     "+ monto);
        }
        
    }
    
}
