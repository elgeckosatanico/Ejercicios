
package fes.aragon.FlujoBytes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author Emmanuel 23dms
 */
public class ArbolesBytes {
    private ArrayList<String> lineas = new ArrayList<>();
    private ArrayList<Integer> partes = new ArrayList<>();
    private ArrayList<Byte> partes2 = new ArrayList<>();
    private ArrayList<String> partes3 = new ArrayList<>();
    private String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    private ArrayList<String> codificado = new ArrayList<>();

    public void leerArchivo() throws MiExcepcion, FileNotFoundException, IOException {
        String ruta = Archivo.abrir(); //***********
        File file = new File(ruta);
        long tamaño = file.length();
        //byte[] archivo = Files.readAllBytes(Paths.get(ruta));
        String lectura = (String) JOptionPane.showInputDialog(null, "¿En cuántas partes?");
        int num = Integer.parseInt(lectura);
        System.out.println("-------------------------------");
        System.out.println("Total de partes: " + lectura);
        int tam = (int) (long) tamaño;
        int aux = 0;
        int total = 0;
        for (int i = 1; i <= num; i++) {
            if (file.length() > total) {
                aux = tam / num;
                total = aux + total;
                partes.add(aux);
                System.out.println("Parte " + i + ": " + aux);
            } else {
                aux = total - tam;
                partes.add(aux);
                System.out.println("Parte " + i + ": " + aux);
            }
        }
        FileReader fr = new FileReader(file);
        BufferedReader buffer = new BufferedReader(fr);
        String linea;
        while ((linea = buffer.readLine()) != null) {
            //System.out.println(linea.toUpperCase());
            lineas.add(new String(linea.toUpperCase()));
        }
        fr.close();
        buffer.close();

    }

    public void creaPartes() throws MiExcepcion, IOException {
        String ruta = Archivo.guardar();
        File f = new File(ruta);
        //File f = new File(ruta + ".txt");
        FileWriter fw = new FileWriter(f, false);
        PrintWriter salida = new PrintWriter(fw);
        for (Integer linea : partes) {
            salida.println(linea);
        }
        salida.close();

    }

    public void crearArchivo() throws MiExcepcion, IOException {
        String ruta = Archivo.guardar();
        //File f = new File(ruta + ".txt");
        File f = new File(ruta);
        FileWriter fw = new FileWriter(f, false);
        PrintWriter salida = new PrintWriter(fw);
        for (String linea : lineas) {
            salida.println(linea);
        }
        salida.close();

    }

    public void leerArchivo2() throws MiExcepcion, FileNotFoundException, IOException {
        String ruta = Archivo.abrir(); //***********
        File file = new File(ruta);
        int tamaño = (int) file.length();
        byte[] bytesArchivo = Files.readAllBytes(Paths.get(ruta));
        String archivo = new String(bytesArchivo);
        String lectura = (String) JOptionPane.showInputDialog(null, "¿En cuántas partes?");
        int numPartes = Integer.parseInt(lectura);
        System.out.println("-------------------------------");
        System.out.println("Total de partes: " + lectura);
        
        //System.out.println(archivo);
        
        for (int i = 0; i < numPartes; i++) {
            String parte = archivo.substring(i, (i + 1) * archivo.length() / numPartes);
            partes3.add(parte);
            System.out.println();
        }
//        FileReader fr = new FileReader(file);
//        BufferedReader buffer = new BufferedReader(fr);
//        String linea;
//        while ((linea = buffer.readLine()) != null) {
//            //System.out.println(linea.toUpperCase());
//            lineas.add(linea);
//        }
//        fr.close();
//        buffer.close();

    }

    public void creaPartes2() throws MiExcepcion, IOException {
        String ruta = Archivo.guardar();
        File f = new File(ruta);
        //File f = new File(ruta + ".txt");
        FileWriter fw = new FileWriter(f, true);
        PrintWriter salida = new PrintWriter(fw);
        for (int i = 0; i < partes3.size(); i++) {
            salida.print(new Byte(partes3.get(i)));
        }
        salida.close();

    }

    public void crearArchivo2() throws MiExcepcion, IOException {
        String ruta = Archivo.guardar();
        //File f = new File(ruta + ".txt");
        File f = new File(ruta);
        FileWriter fw = new FileWriter(f, true);
        PrintWriter salida = new PrintWriter(fw);
        for (String linea : lineas) {
            salida.println(linea);
        }
        salida.close();
    }

}
