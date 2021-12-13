
package CapituloCincio;
import java.util.Random;
/**
 *
 * @author Emmanuel 23dms
 */
public class Craps {
    private Random na=new Random();
    private enum ESTADO{CONTINUA,GANO,PERDIO};
    private final static int DOS_UNOS=2;
    private final static int TRES=3;
    private final static int SIETE=7;
    private final static int ONCE=11;
    private final static int DOCE=12;
    
    public void jugar(){
        int miPunto=0;
        ESTADO estadoJuego;
        int sumaDados=tirarDados();
        switch(sumaDados){
            case SIETE:
            case ONCE:
                estadoJuego=ESTADO.GANO;
                break;
            case DOS_UNOS:
            case TRES:
            case DOCE:
                estadoJuego=ESTADO.PERDIO;
                break;
            default:
                estadoJuego=ESTADO.CONTINUA;
                miPunto=sumaDados;
                System.out.println("El punto es:\t"+miPunto+"\n");
                break;
        }//Fin del switch
        while(estadoJuego==ESTADO.CONTINUA){
            sumaDados=tirarDados();
            if(sumaDados==miPunto)
                estadoJuego=ESTADO.GANO;            
            else
                if(sumaDados==SIETE)
                  estadoJuego=ESTADO.PERDIO;            
        }//Fin del while
            if(estadoJuego==ESTADO.GANO)
                System.out.println("\nEl jugador gana");
            else
                System.out.println("\nElo jugador pierde");
    }//Fin del metodo jugar
    public int tirarDados(){
        int dado1=1+na.nextInt(6);
        int dado2=1+na.nextInt(6);
        int suma=dado1+dado2;
        System.out.println("\nEl jugador tiro\t"+dado1+"\t+\t"+dado2+"\t=\t"+suma);
        return suma;
    }//Fin del metodo tirar Dados
}//Fin de la clase Craps
