
package fes.aragon.Directorios;

/**
 *
 * @author Emmanuel 23dms
 */
public class Nodo {
    /* Declaraciones de variables */
    public String info;
    public int numeroHijos;
    public Nodo hijos[];
    public Nodo hijosTemporales[];

    /* Constructor */
    public Nodo(String infor) {
        info = infor;
        this.numeroHijos = 0;
    }

    public void CopiarHijos() {
        hijosTemporales = new Nodo[numeroHijos + 1];
        for (int i = 0; i < this.numeroHijos; i++) {
            hijosTemporales[i] = hijos[i];
        }
    }

    public void AumentarHijos(Nodo nodo) {
        CopiarHijos();
        hijosTemporales[this.numeroHijos] = nodo;
        hijos = hijosTemporales;
        this.numeroHijos++;
    }

    /* Setters y Getters */
    public String getDato() {
        return info;
    }

    public void setDato(String dato) {
        info = dato;
    }

    public void ImpirmirNodo() {
        System.out.println(info);
    }
}
