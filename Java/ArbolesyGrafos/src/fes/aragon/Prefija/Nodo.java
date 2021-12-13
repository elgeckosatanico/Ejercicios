
package fes.aragon.Prefija;

/**
 *
 * @author Emmanuel 23dms
 */
public class Nodo {
     private String dato;
    private Nodo raiz;
    private Nodo izq,der;

    
    public Nodo() {
	izq=der=null;
}
public Nodo(String dato) {
	this(dato,null,null);
}
public Nodo(String dato, Nodo izquierdo, Nodo derecho) {
	this.dato = dato;
	this.izq = izq;
	this.der = der;	
	}

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
}
