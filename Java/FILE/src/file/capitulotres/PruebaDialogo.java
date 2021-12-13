/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulotres;
import javax.swing.JOptionPane;
/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaDialogo {
    public static void main(String []args){
        String nombre =JOptionPane.showInputDialog("Cual es su nombre?" );
        String mensaje =String.format("Bienvenido "+nombre+ " a la programacion en Java!" );
        JOptionPane.showMessageDialog(null, mensaje );
    }
}
