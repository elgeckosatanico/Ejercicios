/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Datos {

    private ArrayList<Integer> datos = new ArrayList<>();

    public Datos() {
        int numero = 0;
        for (int i = 0; i < 100; i++) {
            numero = ThreadLocalRandom.current().nextInt(100);
            datos.add(numero);
        }
    }
     public void insercion(JPanel panel){
        int aux=0;
        int k=0;
        for(int i=1;i<datos.size();i++){
            try {
                aux=datos.get(i);
                k=i-1;
                while(k>=0&& aux<datos.get(k)){
                    
                        datos.set(k+1,new Integer(datos.get(k)));
                        k=k-1;
                        
                   
                }
                
                datos.set(k+1,aux);
                panel.repaint();
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    public void burbuja(JPanel panel) {
        int aux=0;
        try {
        for (int i = 1; i < datos.size(); i++) {
            for (int j = 1; j < datos.size(); j++) {
                if(datos.get(j-1)>datos.get(j)){
                    aux=datos.get(j-1);
                    datos.set(j-1, datos.get(j));
                    datos.set(j, aux);
                }
                
                    
                }
            panel.repaint();
            Thread.sleep(50);
            }
        } catch (InterruptedException ex) {
                    Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void seleccion(JPanel panel){
        int  menor, pos, tmp;
        try{
            for (int i = 0; i < datos.size() - 1; i++) { 
                menor = datos.get(i); 
                pos = i; 
                for (int j = i + 1; j < datos.size(); j++){ 
                      if (datos.get(j) < menor) { 
                          menor = datos.get(j); 
                          pos = j;
                      }
                }
                if (pos != i){ 
                    tmp = datos.get(i);
                    datos.set(i, datos.get(pos));
                    datos.set(pos, tmp);
                }
                 panel.repaint();
                Thread.sleep(50);
            }
            }catch (InterruptedException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void quicksort(JPanel panel,ArrayList<Integer> dato, int izq, int der) {
        int pivote=datos.get(izq); int i=izq; int j=der; int aux;
        try{
        while(i<j){            
            while(datos.get(i)<=pivote && i<j) i++; 
            while(datos.get(j)>pivote) j--;         
            if (i<j) {                                          
                aux= datos.get(i);                
                datos.set(i, datos.get(j));
                datos.set(j, aux);
            }
        }
        datos.set(izq, datos.get(j)); 
        datos.set(j, pivote); 
        if(izq<j-1)
        quicksort(panel,datos,izq,j-1); 
        if(j+1 <der)
        quicksort(panel,datos,j+1,der); 
        panel.repaint();
        Thread.sleep(50);
        } catch (InterruptedException ex) {
                Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
     

    public ArrayList<Integer> getDatos() {
        return datos;
    }

    

}
