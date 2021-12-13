
package CapituloCincio;

/**
 *
 * @author Emmanuel 23dms
 */
public class SobrecargarMetodos {
    public void probarMetodoSobrecargado(){
        System.out.println("El cuadrado del entero 7 es:\t"+cuadrado(7));
        System.out.println("El cuadrado del double 7.6 es:\t"+cuadrado(7.6));
    }//Fin del metodo probarMetodoSobrecargado
    public int cuadrado(int valorInt){
       System.out.println("\nSe llamo al metodo cuadrado con argumento int:\t"+valorInt);
       return valorInt*valorInt;
    }//Fin del metodo cuadrado con valor int
    public double cuadrado(double valorDouble){
        System.out.println("\nSe le llamo al metodo cuadrado con el valor double\t"+valorDouble);
        return valorDouble*valorDouble;
    }//Fin del metodo cuadrado con valor double
}//Fin de la clase SobrecargarMetodos
