/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulocinco;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Emmanuel 23dms
 */
public class Figuras extends JPanel {
    private int opcion;
    
    public Figuras(int opcionUsuario){
        opcion=opcionUsuario;
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i=0;i<20;i++){
            switch(opcion){
                case 1:
                    g.setColor(Color.GREEN);
                    g.drawRect(10+i*10,10+ i*10,50+ i*10, 50+i*10);                    
                    break;
                case 2:
                    g.setColor(Color.RED);
                    g.drawOval(10+i*10,10+ i*10, 50+i*10, 50+i*10);                    
                    break;   
            }
        }
    }
}
