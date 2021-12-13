/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulotres;
import file.capitulotres.LibroCalificaciones01;
import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaLibroCalificaciones01 {
    public static void main(String []args){
        LibroCalificaciones01 lc =new LibroCalificaciones01();
        Scanner entrada =new Scanner(System.in);
        System.out.println("Escriba el nombre del curso");
        String nombre =entrada.nextLine();
        lc.mensaje(nombre);
    }
}
