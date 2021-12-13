/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulotres;

/**
 *
 * @author Emmanuel 23dms
 */
public class LibroCalificaciones02 {
    String nombre;
    public void establecerNombreDelCurso(String nombreDelCurso){
        nombre=nombreDelCurso;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public void mensaje(){
        System.out.println("Bienvenido al curso de "+obtenerNombre());
    }
}
