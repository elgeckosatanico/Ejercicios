//Ventana interactiva
package CapituloDos;
import javax.swing.JOptionPane;
/**
 *
 * @author Emmanuel 23dms
 */
public class DialogoNombre {
    public static void main(String []args){
        String nombre= JOptionPane.showInputDialog("¿Cual es su nombre?");
        String mensaje= String.format("Bienvenido\t"+nombre+"\t a la programacion en java\t");
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
