
package CapituloSiete;
import java.util.Random;
/**
 *
 * @author Emmanuel 23dms
 */
public class PaqueteDeCartas {
    private Cartas paquete[];
    private int cartaActual;
    private  final int NUMERO_DE_CARTAS=52;
    private Random r;
    
    public PaqueteDeCartas(){
        String caras[]={"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Joto","Quina","Rey"};
        String palos[]={"Corazon","Diamantes","Treboles","Espadas"};
        paquete=new Cartas[NUMERO_DE_CARTAS];
        cartaActual=0;
        r=new Random();
        for(int cuenta=0;cuenta<paquete.length;cuenta++)
            paquete[cuenta]=new Cartas( caras[ cuenta % 13 ], palos[ cuenta / 13 ] );
    }//fin del constructor paquete de cartas
    
    public void Barajar(){
        cartaActual=0;
        for(int contador=0;contador<paquete.length;contador++){
            int segunda=r.nextInt(NUMERO_DE_CARTAS);
            Cartas temp =paquete[contador];
            paquete[contador]=paquete[segunda];
            paquete[segunda]=temp;
        }//fin del for
    }//fin del metodo barajar
    
    public Cartas repartirCarta(){
        if(cartaActual<paquete.length)
            return paquete[cartaActual++];
        else
            return null;
    }//fin del metodo repartircarta   
}//fin de la clase paquetedecartas
