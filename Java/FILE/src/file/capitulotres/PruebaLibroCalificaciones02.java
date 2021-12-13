/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulotres;
import file.capitulotres.LibroCalificaciones02;
import java.util.Scanner;

/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaLibroCalificaciones02 {
    public static void main(String[]args){
         Scanner entrada=new Scanner(System.in);
         LibroCalificaciones02 lc=new LibroCalificaciones02();
         System.out.println("Bienvenido al curso "+lc.obtenerNombre()+"\n");
         
         System.out.println("Escriba el nuevo nombre del curso");
         String elNombre=entrada.nextLine();
         
         System.out.println();
         
         lc.establecerNombreDelCurso(elNombre);
         lc.mensaje();
    }
   
    
}
