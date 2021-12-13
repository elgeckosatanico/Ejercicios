
package CapituloSiete;
import java.util.Random;
/**
 *
 * @author Emmanuel 23dms
 */
public class TirarDadoArreglo {
    public static void main(String[]args){
        Random r=new Random();
        int frecuencia[]=new int[7];
        for(int tiro=1;tiro<6000;tiro++)
            ++frecuencia[1+r.nextInt(6)];
        System.out.println("cara\tfrecuencia");
        for(int cara=1;cara<frecuencia.length;cara++)
            System.out.println(cara+"\t"+frecuencia[cara]);        
    }//fin del main
}//fin de la clase tirardadoarreglo
