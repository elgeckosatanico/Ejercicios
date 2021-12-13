
package fes.aragon.Prefija;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Emmanuel 23dms
 */
public class Evaluacion {
     ArbolBinario arbol;
    String expAEval="";
    Queue<String> colaOperador=new LinkedList();
    Queue<String> colaOperando=new LinkedList();
    Double evaluacion=0.0;

    public Double getEvaluacion() {
        return evaluacion;
    }
    
    public Evaluacion(ArbolBinario arbol) {
        this.arbol=arbol;
    }

//    public ArbolBinarioExp getArbol() {
//        return arbol;
//    }
    
    public Double evaluar(){
        this.recorrerEval();
        
    return evaluacion;
    } 
    
    public void inorden(Nodo nodo){
        if(nodo==null){
            return;
        }
        
        String nodoStr=nodo.getDato();        
        inorden(nodo.getIzq());
            {//esto se hara para cada nodo
                expAEval=expAEval+nodoStr;//solo para imprimir la operacion que se hace en infija
     
               if(nodoStr.equals("+")||nodoStr.equals("-")||nodoStr.equals("*")||nodoStr.equals("/")||nodoStr.equals("^")){
                   colaOperador.add(nodoStr);
                }else if(colaOperando.isEmpty() ){
                   colaOperando.add(nodoStr);
               }else{
                   String simbolo=(String)colaOperador.poll();
                   switch(simbolo){
                        case "+":
                            evaluacion=(Double.parseDouble((String)colaOperando.remove())+Double.parseDouble(nodoStr));
//                            System.out.println("suma da "+evaluacion.toString());
                        break;
                        case "-":
                            evaluacion=(Double.parseDouble((String)colaOperando.remove())-Double.parseDouble(nodoStr));
//                            System.out.println("resta da "+evaluacion);
                        break;
                        case "*":
                            evaluacion=(Double.parseDouble((String)colaOperando.remove())*Double.parseDouble(nodoStr));
//                            System.out.println("multi da "+evaluacion);
                        break;
                        case "/":
                            evaluacion=(Double.parseDouble((String)colaOperando.remove())/Double.parseDouble(nodoStr));
//                            System.out.println("div da "+evaluacion);
                        break;
                        case "^":
                            evaluacion=Math.pow(Double.parseDouble((String)colaOperando.remove()),Double.parseDouble(nodoStr));
//                            System.out.println("pow da "+evaluacion);
                        break;
                    }
                   colaOperando.add(evaluacion.toString());
               }
            }
        inorden(nodo.getDer());
       
    }
    
    private void recorrerEval(){
        inorden(arbol.getRaiz());
        System.out.println(expAEval);
    }
    
}
