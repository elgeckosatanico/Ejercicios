/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulotres;

/**
 *
 * @author Emmanuel 23dms
 */
public class Cuenta {
    double saldo;
    public Cuenta(double saldoInicial){
        if(saldoInicial>0.0){
            saldo=saldoInicial;
        }
    }
    public void abonar(double monto){
        saldo = saldo+monto;
    }
    public double obtenerSaldo(){
        return  saldo;
    }
}
