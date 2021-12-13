//Metodo mostrar mensaje
package CapituloDos;

import java.util.Scanner;

/**
 *
 * @author Emmanuel 23dms
 */
public class LibroCalificaciones {
    private String nombreDelCurso;//Variable de instancia
    public LibroCalificaciones(String nombre){
        nombreDelCurso=nombre;
    }//Fin del constructor
    public void mostrarMensaje(){
        System.out.println("Bienvenido al libro de calificaciones para");
    }//Fin del metodo mostrar mensaje
    public void mostrarMensaje(String nombreDelCurso){
        System.out.println("Bienvenido al Libro de calificaciones para\t"+nombreDelCurso);
    }//Fin del metodo mostrarMensaje
    
    public void establecerNombreDelCrso(String nombre){//Variable local
        nombreDelCurso=nombre;
    }//Fin metodo establecerNombreDelCurso
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }//Fin del metodo obtener nombreDelCurso
    public void mostrarNombreDelCurso(){
        System.out.println("\nBienvenido al libro de calificaciones para el curso\t"+obtenerNombreDelCurso()+"\n");
    }//Fin del metodo mostrarNombreDelCurso
}//Fin de la clase libro calificaciones
