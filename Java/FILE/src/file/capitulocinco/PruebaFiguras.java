/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulocinco;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaFiguras {
    public static void main(String []args){
        String entrada=JOptionPane.showInputDialog("Escriba 1 para dibujar rectangulo\n"+
                "Escriba 2 para dibujar un ovalo");
        
        int opcion=Integer.parseInt(entrada);
        
        Figuras panel=new Figuras(opcion);
        
        JFrame aplicacion=new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(500,500);
        aplicacion.setVisible(true);
    }
}
