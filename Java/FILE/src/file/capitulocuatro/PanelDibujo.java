/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulocuatro;
import javax.swing.JPanel;
import java.awt.Graphics;
/**
 *
 * @author Emmanuel 23dms
 */
public class PanelDibujo extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int anchura=getWidth();
        int altura = getHeight();
        
        //Pinta una linea de la esquina superior izquierda a la esquina inferior derecha
        g.drawLine(0, 0, anchura/2+225, altura/2-225);
        g.drawLine(0, 0, anchura/2+200, altura/2-200);
        g.drawLine(0, 0, anchura/2+175, altura/2-175);
        g.drawLine(0, 0, anchura/2+150, altura/2-150);
        g.drawLine(0, 0, anchura/2+125, altura/2-125);
        g.drawLine(0, 0, anchura/2+100, altura/2-100);
        g.drawLine(0, 0, anchura/2+75, altura/2-75);
        g.drawLine(0, 0, anchura/2+50, altura/2-50);
        g.drawLine(0, 0, anchura/2+25, altura/2-25);
        g.drawLine(0, 0, anchura/2, altura/2);
        g.drawLine(0, 0, anchura/2-25, altura/2+25);
        g.drawLine(0, 0, anchura/2-50, altura/2+50);
        g.drawLine(0, 0, anchura/2-75, altura/2+75);
        g.drawLine(0, 0, anchura/2-100, altura/2+100);
        g.drawLine(0, 0, anchura/2-125, altura/2+125);
        g.drawLine(0, 0, anchura/2-150, altura/2+150);
        g.drawLine(0, 0, anchura/2-175, altura/2+175);
        g.drawLine(0, 0, anchura/2-200, altura/2+200);
        g.drawLine(0, 0, anchura/2-225, altura/2+225);
        
        g.drawLine(anchura,altura,anchura/2+25,altura/2-25);
        g.drawLine(anchura,altura,anchura/2+50,altura/2-50);
        g.drawLine(anchura,altura,anchura/2+75,altura/2-75);
        g.drawLine(anchura,altura,anchura/2+100,altura/2-100);
        g.drawLine(anchura,altura,anchura/2+125,altura/2-125);
        g.drawLine(anchura,altura,anchura/2+150,altura/2-150);
        g.drawLine(anchura,altura,anchura/2+175,altura/2-175);
        g.drawLine(anchura,altura,anchura/2+200,altura/2-200);
        g.drawLine(anchura,altura,anchura/2+225,altura/2-225);
        g.drawLine(anchura,altura,anchura/2,altura/2);
        g.drawLine(anchura,altura,anchura/2-25,altura/2+25);
        g.drawLine(anchura,altura,anchura/2-50,altura/2+50);
        g.drawLine(anchura,altura,anchura/2-75,altura/2+75);
        g.drawLine(anchura,altura,anchura/2-100,altura/2+100);
        g.drawLine(anchura,altura,anchura/2-125,altura/2+125);
        g.drawLine(anchura,altura,anchura/2-150,altura/2+150);
        g.drawLine(anchura,altura,anchura/2-175,altura/2+175);
        g.drawLine(anchura,altura,anchura/2-200,altura/2+200);
        g.drawLine(anchura,altura,anchura/2-225,altura/2+225);
        
        //Pinta una linea de la esquina inferior izquierda a la esquina superior derecha
        g.drawLine(0,altura,anchura/2,altura/2);
        g.drawLine(0,altura,anchura/2+25,altura/2+25);
        g.drawLine(0,altura,anchura/2+50,altura/2+50);
        g.drawLine(0,altura,anchura/2+75,altura/2+75);
        g.drawLine(0,altura,anchura/2+100,altura/2+100);
        g.drawLine(0,altura,anchura/2+125,altura/2+125);
        g.drawLine(0,altura,anchura/2+150,altura/2+150);
        g.drawLine(0,altura,anchura/2+175,altura/2+175);
        g.drawLine(0,altura,anchura/2+200,altura/2+200);
        g.drawLine(0,altura,anchura/2+225,altura/2+225);
        g.drawLine(0,altura,anchura/2-25,altura/2-25);
        g.drawLine(0,altura,anchura/2-50,altura/2-50);
        g.drawLine(0,altura,anchura/2-75,altura/2-75);
        g.drawLine(0,altura,anchura/2-100,altura/2-100);
        g.drawLine(0,altura,anchura/2-125,altura/2-125);
        g.drawLine(0,altura,anchura/2-150,altura/2-150);
        g.drawLine(0,altura,anchura/2-175,altura/2-175);
        g.drawLine(0,altura,anchura/2-200,altura/2-200);
        g.drawLine(0,altura,anchura/2-225,altura/2-225);
        g.drawLine(anchura,0,anchura/2,altura/2);
        g.drawLine(anchura,0,anchura/2-25,altura/2-25);
        g.drawLine(anchura,0,anchura/2-50,altura/2-50);
        g.drawLine(anchura,0,anchura/2-75,altura/2-75);
        g.drawLine(anchura,0,anchura/2-100,altura/2-100);
        g.drawLine(anchura,0,anchura/2-125,altura/2-125);
        g.drawLine(anchura,0,anchura/2-150,altura/2-150);
        g.drawLine(anchura,0,anchura/2-175,altura/2-175);
        g.drawLine(anchura,0,anchura/2-200,altura/2-200);
        g.drawLine(anchura,0,anchura/2-225,altura/2-225);
        g.drawLine(anchura,0,anchura/2+225,altura/2+225);
        g.drawLine(anchura,0,anchura/2+200,altura/2+200);
        g.drawLine(anchura,0,anchura/2+175,altura/2+175);
        g.drawLine(anchura,0,anchura/2+150,altura/2+150);
        g.drawLine(anchura,0,anchura/2+125,altura/2+125);
        g.drawLine(anchura,0,anchura/2+100,altura/2+100);
        g.drawLine(anchura,0,anchura/2+75,altura/2+75);
        g.drawLine(anchura,0,anchura/2+50,altura/2+50);
        g.drawLine(anchura,0,anchura/2+25,altura/2+25);
    }
}
