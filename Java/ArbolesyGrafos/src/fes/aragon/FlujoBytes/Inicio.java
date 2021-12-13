
package fes.aragon.FlujoBytes;

import java.io.IOException;

/**
 *
 * @author Emmanuel 23dms
 */
public class Inicio {
     public static void main(String[] args) throws MiExcepcion, IOException {
        ArbolesBytes arbol = new ArbolesBytes();
        arbol.leerArchivo();
        //arbol.creaPartes();
        arbol.creaPartes();
        
}
}
