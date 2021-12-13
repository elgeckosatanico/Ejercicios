/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author pc01
 */
public class Modelo {

    private PropertyChangeSupport cambios
            = new PropertyChangeSupport(this);
    private ArrayList<Integer> datos
            = new ArrayList<>();

    public Modelo() {
        int numero = 0;
        for (int i = 0; i < 5; i++) {
            numero = ThreadLocalRandom.current()
                    .nextInt(100);
            datos.add(numero);
        }
    }
    public void addPropertyChangeListener(
            PropertyChangeListener listener) {
        cambios.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(
            PropertyChangeListener listener) {
        cambios.removePropertyChangeListener(listener);
    }

    
    
    public void setDatoNuevo(Integer dt){
        ArrayList<Integer> viejo=
                new ArrayList<>(datos);
        datos.add(dt);
        cambios.firePropertyChange("perro", 
                viejo, datos);
    }
    
}