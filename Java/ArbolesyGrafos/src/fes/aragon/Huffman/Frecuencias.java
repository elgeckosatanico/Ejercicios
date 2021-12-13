
package fes.aragon.Huffman;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
/**
 *
 * @author Emmanuel 23dms
 */
public class Frecuencias {
   char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    int[] frecuencias;

    public static void main(String[] args) {
        new Frecuencias().arre();
    }
    
    public void arre() {
        String archivo = "";
        try {
            archivo += new String(
                    Files.readAllBytes(Paths.get("archivo.txt"))
            ).toLowerCase();
        } catch (Exception ignore) {}
        
        //a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
        frecuencias = new int[26];
        Arrays.fill(frecuencias, 0);
                
        // Contar
        for(int i = 0; i < archivo.length()-1; i++){
            if ((archivo.charAt(i)+"").matches("[a-z]"))
                frecuencias[(int)archivo.charAt(i)-97]++;
        }
        // Resultados
        for(int i = 0; i < frecuencias.length; i++) 
            System.out.print((char) (97 + i) +":" + frecuencias[i] + " ");
        System.out.println();
        
        frecuencias = new Frecuencias().burbuja(frecuencias);
        int auxiliar;
        char aux;
        for (int i = 1; i < frecuencias.length; i++) {
            for (int j = 1; j < frecuencias.length; j++) {
                if (frecuencias[j - 1] > frecuencias[j]) {
                    auxiliar = frecuencias[j - 1];
                    aux = abc[j - 1];
                    frecuencias[j - 1] = frecuencias[j];
                    abc[j - 1] = abc[j];
                    frecuencias[j] = auxiliar;
                    abc[j] = aux;
                }
            }
        }
        
        for (int i = 0; i < abc.length; i++ ) System.out.printf("%s:%s ", abc[i], frecuencias[i]);
        
        System.out.println("\n\n" + Arrays.toString(abc));
        System.out.println(Arrays.toString(frecuencias));

    }
    
    public int[] burbuja(int[] datos) {
        
        return datos;
    }
}
