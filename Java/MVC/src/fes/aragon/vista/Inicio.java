/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.vista;

import fes.aragon.modelo.Modelo;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

/**
 *
 * @author pc01
 */
public class Inicio implements PropertyChangeListener{
    
    public static void main(String[] args) {
        System.out.println("Inicio");
        Inicio vista=new Inicio();
        Modelo modelo=new Modelo();
        modelo.addPropertyChangeListener(vista);
        System.out.println("Cambio modelo");
        modelo.setDatoNuevo(new Integer(200));
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
       
        if(evt.getPropertyName().equals("perro")){
            ArrayList<Integer> viejo=(ArrayList<Integer>) 
                    evt.getOldValue();
            ArrayList<Integer> nuevo=(ArrayList<Integer>)
                    evt.getNewValue();
            System.out.println("viejo");
            for (Integer integer : viejo) {
                System.out.println(integer);
            }
            System.out.println("Nuevos");
            for (Integer integer : nuevo) {
                System.out.println(integer);
            }
        }
    }
    
}
