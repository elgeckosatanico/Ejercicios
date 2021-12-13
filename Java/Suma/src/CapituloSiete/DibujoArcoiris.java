
package CapituloSiete;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Emmanuel 23dms
 */
public class DibujoArcoiris extends JPanel{
    final Color VIOLETA=new Color(128,0,128);
    final Color INDIGO=new Color(75,0,130);
    
    private Color colores[]={Color.WHITE,Color.WHITE,VIOLETA,INDIGO,Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED};
    public DibujoArcoiris(){
        setBackground(Color.WHITE);
    }//fin del constructor
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int radio =20;
        int centrox=getWidth()/2;
        int centroy=getHeight()-10;
        for(int contador=colores.length;contador>0;contador--){
            g.setColor(colores[contador-1]);
            g.fillArc(centrox-contador*radio, centroy-contador*radio, contador*radio*2, contador*radio*2, 0, 180);
        }//fin del for            
    }//fin del metodo paintcomponent
}//fin de la clase dibujoarcoiris
