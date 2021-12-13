/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Panel extends JPanel{
     private ArrayList<Integer> dt = new ArrayList<>();
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        g.drawLine(5, 250, 380, 250);
        g.drawLine(5, 5, 5, 250);
         if (dt.size() > 0) {
            int ancho = (375 / dt.size());
            int xx=5;
            for (int i = 0; i < dt.size(); i++) {
                g.drawRect(xx, 250-dt.get(i), ancho,
                        dt.get(i));
                xx+=ancho;
            }            
        }
    }

    public void setDt(ArrayList<Integer> dt) {
        this.dt = dt;
    }

    void setDT(ArrayList<Integer> datos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
