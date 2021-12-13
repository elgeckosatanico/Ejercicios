
package fes.aragon.Dijsktra;

import java.io.*;
/**
 *
 * @author Emmanuel 23dms
 */
public class Inicio {
    public static void main(String args[]){

    int num=0;

    //System.out.println("Algoritmo de Dijkstra");
    System.out.print("¿De cuántos vertices es el grafo?: ");

    do{
      try{
        InputStreamReader l1 = new InputStreamReader(System.in);
        BufferedReader l2 = new BufferedReader(l1);
        num=Integer.valueOf(l2.readLine()).intValue();
      }
      catch(IOException e){
        System.out.println("Error: "+e);
        System.out.println("Numero de vertices que tiene el grafo: ");
      }
      catch(NumberFormatException e2){
        System.out.println("Error: "+e2);
        System.out.println("Numero de vertices que tiene el grafo: ");
      }
      if(num<3 || num>26)
       System.out.print(" El numero de vertices debe estar entre 3 y 26 ");

    }while(num<3 || num>26);
    Dijsktra obj = new Dijsktra(num);
  }
}




