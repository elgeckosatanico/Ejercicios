
package CapituloOcho;

/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaTiempo {
    public static void main(String args[]){
       Tiempo tiempo=new Tiempo();
       
       System.out.print("La hora universal inicial es: ");
       System.out.println(tiempo.aStringUniversal());
       System.out.print("La hora estandar inicial es: ");
       System.out.println(tiempo.toString());
       System.out.println();
       
       tiempo.establecerTiempo(13, 27, 6);
       System.out.print("La hora universal despues de establecer tiempo es: ");
       System.out.println(tiempo.aStringUniversal());
       System.out.print("La hora estandar despues de establecer tiempo es: ");
       System.out.println(tiempo.toString());
       System.out.println();
       
       tiempo.establecerTiempo(99, 99, 99);
       System.out.println("Despues de tratar de ajustar de forma invalida: ");
       System.out.print("Hora universal: ");
       System.out.println(tiempo.aStringUniversal());
       System.out.print("Hora estandar: ");
       System.out.println(tiempo.toString());
    }//fin  del main
}//fin de la clase pruebatiempo
