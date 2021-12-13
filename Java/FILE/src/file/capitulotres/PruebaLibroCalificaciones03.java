/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulotres;
import file.capitulotres.LibroCalificaciones03;
/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaLibroCalificaciones03 {
    public static void main(String []args){
        LibroCalificaciones03 lc1=new LibroCalificaciones03("Introduccion a la programacion en java");
        LibroCalificaciones03 lc2=new LibroCalificaciones03("Estructuras discretas en java");
        
        System.out.println("El nombre del curso es: "+lc1.obtenerNombre());
        System.out.println("El nombre del curso es: "+lc2.obtenerNombre());
    }
}
