
package fes.aragon.Dijsktra;

import java.io.*;
import java.util.*;
/**
 *
 * @author Emmanuel 23dms
 */
public class Dijsktra {
    int[][] matrizAdy;
  int nNodos;
  List conj_S = new ArrayList();
  List conjComp_S = new ArrayList();
  List caminos = new ArrayList();
  String tmp;
  InputStreamReader l1;
  BufferedReader l2;

  Dijsktra(int numNodos){
    matrizAdy = new int[numNodos][numNodos];
    int aux=0;
    l1 = new InputStreamReader(System.in);
    l2 = new BufferedReader(l1);
    nNodos=numNodos;

    if(aux==1)
      datosNodos();
    else
      datosNodos();
    do{
      try{
          System.out.print(" Vertice inicio: ");
        aux=((int)((l2.readLine()).toUpperCase()).charAt(0))-65;
      }
      catch(IOException e2){
        System.out.println("Error: "+e2);
        aux=-1;
      }
      catch(StringIndexOutOfBoundsException e3){
        System.out.println("Error: "+e3);
        aux=-1;
      }
    }while(aux<0 || aux>nNodos-1);
    matrizAdy[aux][aux]=0;
    resuelve(aux);
  }

  private void datosNodos(){
    boolean ocurrioError;

    for(int cuenta=1;cuenta<=nNodos;cuenta++)
      for(int cnt=1;cnt<=nNodos;cnt++){
        if(cnt!=cuenta){
          System.out.println("Peso del arco del vertice "+(char)(cuenta+64)+" al vertice "+(char)(cnt+64));
          System.out.println("(Digitar 0 si no existe arco) ");
          ocurrioError=false;
          try{
            matrizAdy[cuenta-1][cnt-1]=Integer.valueOf(l2.readLine()).intValue();
            ocurrioError=(matrizAdy[cuenta-1][cnt-1]<0?true:false);
            matrizAdy[cuenta-1][cnt-1]=(matrizAdy[cuenta-1][cnt-1]==0?-1:matrizAdy[cuenta-1][cnt-1]);
          }
          catch(IOException e0){
            System.out.println("Error: "+e0);
            ocurrioError=true;
          }
          catch(NumberFormatException e){
            System.out.println("Error: "+e);
            ocurrioError=true;
          }
          if(ocurrioError)
            cnt--;
        }
        else
          matrizAdy[cuenta-1][cuenta-1]=-1;
      }
  }

  private void resuelve(int origen){
    int nod;
    int minimo;
    int aux;
    int nodCambio=0;
    int intento;
    String tmp2;
    //Inicializando listas
    for(int i=0;i<nNodos;i++){
      if(i!=origen)
        conjComp_S.add(""+i);
      else
        conj_S.add(""+i);
      caminos.add("");
    }
    //Aplicando ciclo i de diksjtra
    for(int i=0;i<nNodos;i++){
      minimo=-1;
      for(int j=0;j<conjComp_S.size();j++){
        nod=Integer.valueOf((String)(conjComp_S.get(j))).intValue();
        aux=min(nod);
        if(minimo==-1 || (aux<minimo && aux!=-1)){
          minimo=aux;
          nodCambio=j;
        }
      }
      if(minimo!=-1){
        conj_S.add(""+(String)(conjComp_S.get(nodCambio)));
        conjComp_S.remove(nodCambio);
      }
    }
    //Imprimiendo resultados
      System.out.println("-----------------------------");
    System.out.println(" Resultados ");
    for(int k=0;k<caminos.size();k++)
      if(k!=origen){
        tmp=(String)(caminos.get(k))+(char)(k+65);
        caminos.set(k,tmp);
      }
    for(int j=0;j<caminos.size();j++)
      if(j!=origen){
        intento=0;
        tmp=(String)(caminos.get(j));
          while(tmp.charAt(0)!=(char)(origen+65) && intento<10){
            aux=tmp.charAt(0)-65;
            tmp=((String)(caminos.get(aux)))+tmp.substring(1,tmp.length());
            if(++intento==10)
              tmp="*"+tmp;
          };
        imprimeCamino(tmp,j,origen);
      }
  }

  private int min(int dest){
    int min=-1;
    int nod=0;
    int nodOrig=-1;
    int aux;
    for(int i=0;i<conj_S.size();i++){
      nod=Integer.valueOf((String)(conj_S.get(i))).intValue();
      if(matrizAdy[nod][nod]!=-1 && matrizAdy[nod][dest]!=-1)
        aux=matrizAdy[nod][nod]+matrizAdy[nod][dest];
      else
        aux=-1;
      if((aux<min && aux!=-1)||min==-1){
        min=aux;
        nodOrig=nod;
      }
    }
    if(min!=-1){
      matrizAdy[dest][dest]=min;
      caminos.set(dest,""+(char)(nodOrig+65));
    }
    return min;
  }

  private void imprimeCamino(String cam, int nod, int o){
    System.out.print("Camino: ");
    if(cam.charAt(0)=='*')
      System.out.println("No existe arco del vertice: "+(char)(o+65)+" al vertice "+cam.charAt(cam.length()-1)+"!!");
    else{
      for(int i=0;i<cam.length();i++)
        System.out.print(""+cam.charAt(i)+(i==cam.length()-1?"":"->"));
      System.out.println(" Peso: "+matrizAdy[nod][nod]);
    }
  }
}
