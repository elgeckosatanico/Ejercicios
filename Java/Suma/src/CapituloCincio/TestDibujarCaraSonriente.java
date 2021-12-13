
package CapituloCincio;
import javax.swing.JFrame;
/**
 *
 * @author Emmanuel 23dms
 */
public class TestDibujarCaraSonriente {
   public static void main(String[]args){
       DibujarCaraSonriente panel=new DibujarCaraSonriente();
       JFrame aplicacion=new JFrame();
       aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       aplicacion.add(panel);
       aplicacion.setSize(230,250);
       aplicacion.setVisible(true);       
   }//Fin del main 
}//Fin de la clase TestDibujarCaraSonriente
