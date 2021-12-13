
package fes.aragon.Prefija;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 *
 * @author Emmanuel 23dms
 */
public class ArbolBinario {
   private Nodo raiz=null;
    private Nodo nodo=null;
    private int indice=0;
    private String exp="";
    private Stack <Nodo> pila = new Stack<>();

    public ArbolBinario(String dato) {
        this.exp=dato;
        raiz = new Nodo(this.siguienteCaracter());
    }
    public Nodo getRaiz() {
        return raiz;
    }
    
   public String siguienteCaracter(){
        String caracter=null;
        if(indice<exp.length()){
            caracter=exp.substring(indice, indice+1);
            indice++;
        }
        if(indice<exp.length() && caracter.equals(" ")){
            caracter=siguienteCaracter();
        }
    return caracter;
    }


  public void crearArbol(){
      String simbolo= this.siguienteCaracter();
      String mov= "izq";
      Nodo nuevoNodo=raiz;
      Nodo ultimoNodo = null;
      while (simbolo != null) {          
          ultimoNodo = nuevoNodo;
          nuevoNodo = new Nodo(simbolo);
          if (mov.equals("izq")) {
              ultimoNodo.setIzq(nuevoNodo);
              pila.push(ultimoNodo);
          } else {
              if (!pila.empty()) {
                  Nodo nodo = pila.pop();
                  nodo.setDer(nuevoNodo);
              }
          }
          if (simbolo.equals("+") || simbolo.equals("-") 
                  || simbolo.equals("*") || simbolo.equals("/") ||
                  simbolo.equals("(") || simbolo.equals(")")) {
              mov = "izq";
              
          }else{
              mov ="der";
          }
          simbolo = this.siguienteCaracter();
      }
      
  }
    private void imprimir(Nodo n) {
        System.out.println(n.getDato());
    }

    public void imprimirNivel() {
        Queue<Nodo> cola = new LinkedList<>();
        Nodo n;
        if (raiz != null) {
            cola.add(raiz);
            while (cola.size() != 0) {
                n = cola.remove();
                imprimir(n);

                if (n != null) {
                    if (n.getIzq() != null) 
                        cola.add(n.getIzq());
                }
                        if (n.getDer() != null) {
                            cola.add(n.getDer());
                        }
                    }

                }
            }
     
}
