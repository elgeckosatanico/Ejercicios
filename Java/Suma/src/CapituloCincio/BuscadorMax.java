
package CapituloCincio;
import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class BuscadorMax {
    public void determinarMax(){
     Scanner entrada=new Scanner(System.in);
     System.out.println("Escriba tres numeros flotantes separados por un espacio: ");
     float numero1=entrada.nextFloat();
     float numero2=entrada.nextFloat();
     float numero3=entrada.nextFloat();
     
     float resultado=maximo(numero1,numero2,numero3);
     
     System.out.println("El numero maximo es: \t"+resultado);
     
   }//Fin del metodo determinarMax
    
    public float maximo(float a,float b,float c){
     float valorMax=a;
     
     if(b>valorMax)
         valorMax=b;
     if(c>valorMax)
         valorMax=c;
     return valorMax;     
    }//Fin del metodo maximo
}//Fin de la clase BuscadorMax
