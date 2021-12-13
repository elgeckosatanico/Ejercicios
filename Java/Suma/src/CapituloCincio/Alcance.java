
package CapituloCincio;

/**
 *
 * @author Emmanuel 23dms
 */
public class Alcance {
    private int x=1;
    public void iniciar(){
        int x=5;
        System.out.println("La x local en el metodo iniciar  es:\t"+x);
        usarVariableLocal();
        usarCampo();
        usarVariableLocal();
        usarCampo();
        System.out.println("\nLa x local en el metodo iniciar  es:\t"+x);
    }//Fin del metodo iniciar
    public void usarVariableLocal(){
        int x=25;
        System.out.println("\nLa x local antes de salir del metodo usarvariablelocal es:\t"+x);
        x++;
        System.out.println("\nLa x local antes de salir del metodo usarvariablelocal es:\t"+x);
    }//Fin del metodo usarVariableLocal
    public void usarCampo(){
        System.out.println("\nEl campo x antes de salir del metodo usarcampo es:\t"+x);
        x*=10;
        System.out.println("\nEl campo x antes de salir del metodo usarcampo es:\t"+x);
    }//Fin del metodo usarcampo
}//Fin de la clase alcance
