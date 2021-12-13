
package CapituloTres;
import CapituloTres.PanelDibujo;
import javax.swing.JFrame;
/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaPanelDibujo {
    public static void main(String[]args){
        PanelDibujo panel=new PanelDibujo();
        JFrame app=new JFrame();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(500,500);
        app.setVisible(true);
    }
    
}
