
package CapituloOcho;

/**
 *
 * @author Emmanuel 23dms
 */
public class Pruebathis {
    public static void main(String args[]){
        Tiemposimple tiempo=new Tiemposimple(15,30,29);
        System.out.println(tiempo.crearString());
    }//fin del main   
}//fin de la clase prueba this

class Tiemposimple{
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiemposimple(int hora, int minuto, int segundo){
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;        
    }//fin del constructor tiemposimple
    
    public String crearString(){
        return String.format("%24s:%s\n%24s:%s","this.aStringUniversal()",this.aStringUniversal(),"aStringUniversal()",aStringUniversal());
    }//fin del metodo crearstring
    
    public String aStringUniversal(){
        return String.format("%02d:%02d:%02d",hora,minuto,segundo);
    }//fin del metodo astringuniversal
}//fin de la clase tiempo simple