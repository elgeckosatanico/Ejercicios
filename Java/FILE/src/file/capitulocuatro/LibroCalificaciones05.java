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
public class LibroCalificaciones05 {
    String nombre;
    
    public LibroCalificaciones05(String nombreDelCurso){
        nombre=nombreDelCurso;
    }
    public void establecerNombreDelCurso(String nombreDelCurso){
        nombre=nombreDelCurso;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void mensaje(){
        System.out.println("Bienvenido al curso de "+obtenerNombre());
    }
    public void determinarPromedio(){
        Scanner entrada=new Scanner(System.in);
        
        float total=0,i=1,calificacion,promedio;
        
        System.out.println("Escriba calificacion 0 -1 para terminar");
        calificacion=entrada.nextFloat();
        
        while(calificacion!=-1){
            total=total+calificacion;
            i++;   
            System.out.println("Escriba calificacion ");
            calificacion=entrada.nextFloat();
        }
        if(i!=0){
          promedio=total/10;
          System.out.println("El total de las calificaciones es: "+total);
          System.out.println("El promedio de las calificaciones es: "+promedio);  
        }
        else{
            System.out.println("No se introdujeron calificaciones ");
        }
    }
    
}
