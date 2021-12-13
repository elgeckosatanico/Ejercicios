
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaPaqueteDeCartas {
    public static void main(String[]args){
        PaqueteDeCartas miCarta=new PaqueteDeCartas();
        miCarta.Barajar();
         for(int i=0;i<13;i++)
             System.out.printf(miCarta.repartirCarta()+"\t\t"+miCarta.repartirCarta()+"\t\t"+
                               miCarta.repartirCarta()+"\t\t"+miCarta.repartirCarta()+"\t\t\n");
    }//fin del main    
}//fin de la clase paquetedecartas
