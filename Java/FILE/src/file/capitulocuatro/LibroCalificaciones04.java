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
public class LibroCalificaciones04 {
    String nombre;
    
    public LibroCalificaciones04(String nombreDelCurso){
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
        
        while(i<=10){
            System.out.println("Escriba calificacion ");
            calificacion=entrada.nextFloat();
            total=total+calificacion;
            i++;            
        }
        promedio=total/10;
        System.out.println("El total de las calificaciones es: "+total);
        System.out.println("El promedio de las calificaciones es: "+promedio);
    }
}
