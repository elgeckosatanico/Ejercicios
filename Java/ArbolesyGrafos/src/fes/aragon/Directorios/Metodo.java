
package fes.aragon.Directorios;

import java.io.File;
import javax.swing.JOptionPane;
/**
 *
 * @author Emmanuel 23dms
 */
public class Metodo {
     public Arbol arbol = new Arbol();
    public Nodo nodo;
    public String ruta;

    public void PrimerReader() {
        File directorio = new File(ruta);
        if (directorio.exists()) {
            String[] ficheros = directorio.list();
            if (ficheros == null) {
                System.out.println("Directorio vacío");
            } else {
                nodo = arbol.InsertarRaiz(ruta);
                System.out.print("El Directorio raíz es: ");
                arbol.raiz.ImpirmirNodo();
                Arbolizando(ficheros);
                arbol.ImprimirHijos(nodo);
            }
        } else {
            ErrorRuta();
        }
    }

    public void ReaderRecursivo() {    //Aquí va la recursividad para que busque en los directorios internos
        File directorio = new File(ruta);
        String[] ficheros = directorio.list();
        for (String fichero : ficheros) {
            directorio = new File(ruta);
            ficheros = directorio.list();
            Arbolizando(ficheros);
            arbol.ImprimirHijos(nodo);
            ruta = fichero;
        }
    }

    public void Arbolizando(String[] ficheros) {
        System.out.println("Éstos son sus Subdirectorios\n--------------------------------------------------");
        for (String fichero : ficheros) {                               //Un token, leerá hasta alcanzar la longitud
            arbol.Insertar(nodo, fichero, ruta);
        }
    }

    public void SetRuta() {
        ruta = JOptionPane.showInputDialog("Ingrese la ruta a mostrar");
    }

    public void ErrorRuta() {
        JOptionPane.showMessageDialog(null, "Error al cargar la ruta, no se encuentra la dirección");
    }
}
