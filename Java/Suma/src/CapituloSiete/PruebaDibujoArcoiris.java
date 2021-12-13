
package CapituloSiete;
import javax.swing.JFrame;
/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaDibujoArcoiris {
    public static void main(String args[]){
        DibujoArcoiris panel=new DibujoArcoiris();
        JFrame aplicacion=new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(400, 250);
        aplicacion.setVisible(true);
    }//fin del main
}//fin de la clase pruebadibujoarcoiris
