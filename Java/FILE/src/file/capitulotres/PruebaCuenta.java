/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.capitulotres;
import file.capitulotres.Cuenta;
import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaCuenta {
    public static void main(String []args){
        Cuenta cuenta1 = new Cuenta( 50.00 );
        Cuenta cuenta2 = new Cuenta( 0.00 );
        System.out.println("Saldo de cuenta1: "+cuenta1.obtenerSaldo());
        System.out.println("Saldo de cuenta2: "+cuenta2.obtenerSaldo());
        Scanner entrada = new Scanner( System.in );
        double montoDeposito;
        System.out.println("Escriba el monto a depositar para cuenta1: " );
        montoDeposito = entrada.nextDouble();
        System.out.println("sumando "+montoDeposito+" al saldo de cuenta1");
        cuenta1.abonar( montoDeposito );
        System.out.println( "Saldo de cuenta1: "+cuenta1.obtenerSaldo());
        System.out.println( "Saldo de cuenta2: "+cuenta2.obtenerSaldo());
        System.out.println("Escriba el monto a depositar para cuenta2: " );
        montoDeposito = entrada.nextDouble();
        System.out.println("sumando "+montoDeposito+" al saldo de cuenta2");
        cuenta2.abonar( montoDeposito );
        System.out.println( "Saldo de cuenta1: "+cuenta1.obtenerSaldo());
        System.out.println( "Saldo de cuenta2: "+cuenta2.obtenerSaldo());
    }
}
