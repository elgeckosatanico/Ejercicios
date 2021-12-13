//Simulacion de una cuenta bancaria
package CapituloDos;

/**
 *
 * @author Emmanuel 23dms
 */
public class Cuenta {
    private double saldo; //Variable de instancia
    //Constructor
    public Cuenta(double saldoInicial){
        if(saldoInicial>0.0)
            saldo=saldoInicial;
    }//Fin del constructor
    
    //Abonar suma un abono a la cuenta
    public void abonar(double monto){
        saldo=saldo+monto;
    }//Fin del metodo abonar
    
    //Devolver el saldo de la cuenta
    public double obtenerSaldo(){
        return saldo;
    }//Fin del metodo obtenerSaldo
    
}//Fin de la clase Cuenta
