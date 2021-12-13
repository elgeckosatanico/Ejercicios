/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulocuatro;
import javax.swing.JFrame;
/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaDibujoPanel {
    public static void main(String []args){
        PanelDibujo panel=new PanelDibujo();
        JFrame aplicacion=new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(500, 500);
        aplicacion.setVisible(true);
        
    }
}
