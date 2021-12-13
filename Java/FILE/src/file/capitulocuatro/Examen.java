/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulocuatro;
import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class Examen {
    
    public void aplicarExamen(){
        Scanner entrada=new Scanner(System.in);
        int contadorAprobados=0,contadorReprobados=0;
        for(int i=0;i<=9;i++){
            System.out.println("Escriba 1 para aprobado y 2 para reprobado: ");
            int resultado=entrada.nextInt();
            
            if(resultado==1){
                contadorAprobados=contadorAprobados+1;
            }
            else{
                contadorReprobados=contadorReprobados+1;
            }
        
        }   
        System.out.println("El numero de Aprobados es: "+contadorAprobados+" El numero de reprobados es: "+contadorReprobados);
        if(contadorAprobados>8){
            System.out.println("se aumenta la colegiatura");
        }
    }
    
}
