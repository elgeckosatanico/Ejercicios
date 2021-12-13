//Prueba del libro de calificaciones
package CapituloDos;

import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaLibroCalificaciones {
    public static void main(String []args){
        
        
        LibroCalificaciones msj4=new LibroCalificaciones(
          " estructura de datos");
        LibroCalificaciones msj5=new LibroCalificaciones(
          " programacion en  java");
        
        
        /*LibroCalificaciones msj= new LibroCalificaciones();//Crea un objeto tipo LibroCalificaciones
        Scanner entrada= new Scanner(System.in);
        Scanner entrada1=new Scanner(System.in);
        LibroCalificaciones msj1= new LibroCalificaciones();
        LibroCalificaciones msj2=new LibroCalificaciones();
        //msj.mostrarMensaje();//Emplea el metodo mostrarMensaje a traves del objeto msj*/
        
        /*System.out.println("Escriba el nombre del curso");//Pide el nombredel curso
        String nombreDelCurso=entrada.nextLine();//Guarda el nombre del curso
        msj2.mostrarMensaje(nombreDelCurso);//Muestra el nombre del curso*/
        
        /*System.out.println("El nombre inicial del curso es\t"+msj2.obtenerNombreDelCurso()+"\n");
        System.out.println("Escriba el nombre del curso\n");
        String nombre=entrada1.nextLine();
        msj2.establecerNombreDelCrso(nombre);
        msj2.mostrarNombreDelCurso();*/
        
        System.out.println("El nombre actual del curso es"+msj4.obtenerNombreDelCurso());
        System.out.println("El nombre actual del curso es"+msj5.obtenerNombreDelCurso());
        
        
        
    }//Fin del main

   
}//Fin de la clase PruebaLibroCalificaciones
