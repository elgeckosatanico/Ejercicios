/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaLibroCalificaionesDos {
    public static void main(String[]args){
        int arregloCalif[][]={{87,96,96},
                              {99,100,87},
                              {95,95,95},
                              {23,66,55},
                              {11,22,33},
                              {66,66,66},
                              {94,93,76},
                              {23,56,100},
                              {0,0,0},
                              {1,1,1}};
        LibroCalificaciones mlc=new LibroCalificaciones("CS101 Introduccion a la programacion en Java",arregloCalif);
        mlc.mensaje();
        mlc.procesarCalificacion();
    }//fin del main
}//fin de la clase pruebalibrocalificaionesdos
