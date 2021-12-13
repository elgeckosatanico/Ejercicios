
import fes.aragon.datos;
import fes.aragon.derivada;
import fes.aragon.metodo;
import interfaz.Interfaz;
import java.util.Scanner;

/**
 *
 * @author jrgel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int grado,nRep;
        
        Interfaz interfaz = new Interfaz();
        //interfaz.setLayout(null);
        interfaz.setVisible(true);
        //interfaz.setSize(200,100);
        
        Scanner sc = new Scanner(System.in);
        //System.out.println("Grado de la ecuacion: ");
        //grado = sc.nextInt();
        
        //float[] ecuacion = new float[grado+1];
        
        
        datos datos = new datos();
       //ecuacion=datos.pedirDatos(grado);
        
        derivada der = new derivada();
        //der.derivar(grado, datos.pedirDatos(grado));
        metodo vonMises = new metodo();
        
        float puntoInicial;
        
        System.out.println("Punto Inicial: ");
        puntoInicial = sc.nextFloat();
        
        System.out.println("Numero de repeticiones: ");
        nRep = sc.nextInt();
        
        System.out.println("Grado de la ecuacion: ");
        grado = sc.nextInt();

        //vonMises.vonMises(puntoInicial, ecuacion, grado, grado);
       // vonMises.vonMises(puntoInicial, datos.pedirDatos(grado), grado, nRep);
        
        
    }
    
}
