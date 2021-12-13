//Simulacion de un dado
package CapituloCincio;
import java.util.Random;
/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaRandom {
    public static void main(String []args){
        Random r=new Random();
        int cara;
        for(int counter=1;counter<=20;counter++){
            cara=1+r.nextInt(6);
            System.out.print(cara);
            // si contador es divisible entre 5, empieza una nueva línea de salida
            if(counter%5==0)
                System.out.println();
        }//Fin del for
    }//Fin del main
}//Fin de la clase PruebaRandom
