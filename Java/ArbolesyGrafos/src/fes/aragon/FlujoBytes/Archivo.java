
package fes.aragon.FlujoBytes;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Emmanuel 23dms
 */
public class Archivo {
    private static int tam;
    
    
    public static String abrir() throws MiExcepcion {
        String ruta = null;
        JFileChooser buscar = new JFileChooser();
        //FileNameExtensionFilter filtro = new FileNameExtensionFilter("Solo txt", "txt", "TXT");
        //buscar.setFileFilter(filtro);
        int valor = buscar.showOpenDialog(null);
        if (valor == JFileChooser.APPROVE_OPTION) {
            ruta = buscar.getSelectedFile().getPath();
        } else {
            throw new MiExcepcion("Se necesita un archivo");
        }
        System.out.println("La ruta señalada fue: " + ruta);
        File fichero = new File(ruta);
        System.out.println("El total del archivo: "+fichero.length());

        return ruta;
        
    }
    
    public static String abrir2() throws MiExcepcion {
        String ruta = null;
        JFileChooser buscar = new JFileChooser();
        //FileNameExtensionFilter filtro = new FileNameExtensionFilter("Solo txt", "txt", "TXT");
        //buscar.setFileFilter(filtro);
        int valor = buscar.showOpenDialog(null);
        if (valor == JFileChooser.APPROVE_OPTION) {
            ruta = buscar.getSelectedFile().getPath();
        } else {
            throw new MiExcepcion("Se necesita un archivo");
        }
        System.out.println("La ruta señalada fue: " + ruta);
        File fichero = new File(ruta);
        System.out.println("El total del archivo: " + fichero.length());

        return ruta;

    }
    
    public static String guardar() throws MiExcepcion {
        String archivo = null;
        JFileChooser buscar = new JFileChooser();
        //FileNameExtensionFilter filtro = new FileNameExtensionFilter("Solo txt", "txt", "TXT");
        //buscar.setFileFilter(filtro);
        int valor = buscar.showSaveDialog(null);
        if (valor == JFileChooser.APPROVE_OPTION) {
            archivo = buscar.getSelectedFile().getPath();
        } else {
            throw new MiExcepcion("Se necesita el nombre del archivo");
        }
        return archivo;
    }
    
}
