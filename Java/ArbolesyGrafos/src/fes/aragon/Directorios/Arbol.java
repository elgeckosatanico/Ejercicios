
package fes.aragon.Directorios;

/**
 *
 * @author Emmanuel 23dms
 */
public class Arbol {
   Nodo raiz;

    public Nodo InsertarRaiz(String dato) {
        raiz = new Nodo(dato);
        return raiz;
    }

    public void ImprimirHijos(Nodo nodo) {
        for (int i = 0; i < nodo.numeroHijos; i++) {
            nodo.hijos[i].ImpirmirNodo();
            ImprimirHijos(nodo.hijos[i]);
        }
    }

    public void Insertar(Nodo nodo, String dato, String padre) {   //Nodo, información a contener, quien s su padre
        Nodo nuevo = new Nodo(dato);
        if (nodo.getDato().equals(padre)) {   //padre = raiz
            nodo.AumentarHijos(nuevo);
        } else {                               //padre = algun hijo
            for (int i = 0; i < nodo.numeroHijos; i++) {
                if (nodo.hijos[i].getDato().equals(padre)) {
                    nodo.hijos[i].AumentarHijos(nuevo);
                } else {
                    Insertar(nodo.hijos[i], dato, padre);
                }
            }
        }
    } 
}
