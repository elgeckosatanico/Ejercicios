
package CapituloTres;
import java.awt.Graphics;
import java.lang.Math;
import javax.swing.JPanel;
/**
 *
 * @author Emmanuel 23dms
 */
public class PanelDibujo extends JPanel{
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        int anchura=getWidth();
        int altura=getHeight();
        //Pinta una linea de la esquina superior izquierda a la esquina inferior derecha
        g.drawLine(0, 0, anchura/2+200, altura/2-200);
        g.drawLine(0, 0, anchura/2+150, altura/2-150);
        g.drawLine(0, 0, anchura/2+100, altura/2-100);
        g.drawLine(0, 0, anchura/2+50, altura/2-50);
        g.drawLine(0, 0, anchura/2, altura/2);
        g.drawLine(0, 0, anchura/2-50, altura/2+50);
        g.drawLine(0, 0, anchura/2-100, altura/2+100);
        g.drawLine(0, 0, anchura/2-150, altura/2+150);
        g.drawLine(0, 0, anchura/2-200, altura/2+200);
        g.drawLine(anchura,altura,anchura/2,altura/2);
        g.drawLine(anchura,altura,anchura/2+50,altura/2-50);
        g.drawLine(anchura,altura,anchura/2+100,altura/2-100);
        g.drawLine(anchura,altura,anchura/2+150,altura/2-150);
        g.drawLine(anchura,altura,anchura/2+200,altura/2-200);
        g.drawLine(anchura,altura,anchura/2-50,altura/2+50);
        g.drawLine(anchura,altura,anchura/2-100,altura/2+100);
        g.drawLine(anchura,altura,anchura/2-150,altura/2+150);
        g.drawLine(anchura,altura,anchura/2-200,altura/2+200);
        
        //Pinta una linea de la esquina inferior izquierda a la esquina superior derecha
        g.drawLine(0,altura,anchura/2,altura/2);
        g.drawLine(0,altura,anchura/2+50,altura/2+50);
        g.drawLine(0,altura,anchura/2+100,altura/2+100);
        g.drawLine(0,altura,anchura/2+150,altura/2+150);
        g.drawLine(0,altura,anchura/2+200,altura/2+200);
        g.drawLine(0,altura,anchura/2-50,altura/2-50);
        g.drawLine(0,altura,anchura/2-100,altura/2-100);
        g.drawLine(0,altura,anchura/2-150,altura/2-150);
        g.drawLine(0,altura,anchura/2-200,altura/2-200);
        g.drawLine(anchura,0,anchura/2,altura/2);
        g.drawLine(anchura,0,anchura/2-50,altura/2-50);
        g.drawLine(anchura,0,anchura/2-100,altura/2-100);
        g.drawLine(anchura,0,anchura/2-150,altura/2-150);
        g.drawLine(anchura,0,anchura/2-200,altura/2-200);
        g.drawLine(anchura,0,anchura/2+200,altura/2+200);
        g.drawLine(anchura,0,anchura/2+150,altura/2+150);
        g.drawLine(anchura,0,anchura/2+100,altura/2+100);
        g.drawLine(anchura,0,anchura/2+50,altura/2+50);
    }//Fin de la clase painComponents
}//Fin de la clase PanelDibujo
