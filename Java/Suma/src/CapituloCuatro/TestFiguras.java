
package CapituloCuatro;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author Emmanuel 23dms
 */
public class TestFiguras {
    public static void main(String[]args){
       String entrada=JOptionPane.showInputDialog(
               "Escriba 1 para dibujar rectangulos\n Escriba 2 para dibujar ovalos");
       int opcion=Integer.parseInt(entrada);
       Figuras panel = new Figuras( opcion );  
       JFrame aplicacion = new JFrame();
       aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
       aplicacion.add( panel );
       aplicacion.setSize(300,300 );
       aplicacion.setVisible(true );
    }//Fin del main
}//Fin de la clase TestFiguras
