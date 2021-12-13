
package CapituloDos;
import java.util.Scanner;
import CapituloDos.Cuenta;
/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaCuenta {
   public static void main(String[]args){
     Cuenta cuenta1=new Cuenta(0.0);
     Cuenta cuenta2=new Cuenta(9.99);
     Scanner entrada=new Scanner(System.in);
     double montoDeposito;
     
     System.out.println("El sado de la cuenta 1 es:\t"+cuenta1.obtenerSaldo()+"\n");
     System.out.println("El saldo de la cuenta 2 es:\t"+cuenta2.obtenerSaldo()+"\n");
     
     System.out.println("Escriba el monto a depositar en la cuenta 1\n");
     montoDeposito=entrada.nextDouble();
     System.out.println("\nSumando\t"+montoDeposito+"\tal saldo de la cuenta 1\n");
     cuenta1.abonar(montoDeposito);
     
     System.out.println("El saldo de la cuenta 1 es:\t"+cuenta1.obtenerSaldo()+"\n");
     System.out.println("El saldo de la cuenta 2 es:\t"+cuenta2.obtenerSaldo()+"\n");
     
     System.out.println("Escriba el monto a depositar en la cuenta 2\n");
     montoDeposito=entrada.nextDouble();
     System.out.println("\nSumando\t"+montoDeposito+"\tal saldo de la cuenta 2\n");
     cuenta2.abonar(montoDeposito);
     
     System.out.println("El saldo de la cuenta 1 es:\t"+cuenta1.obtenerSaldo()+"\n");
     System.out.println("El saldo de la cuenta 2 es:\t"+cuenta2.obtenerSaldo()+"\n");
     
   }   
}
