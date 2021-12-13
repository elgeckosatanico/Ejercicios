
package CapituloOcho;

/**
 *
 * @author Emmanuel 23dms
 */
public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;
    
    public void establecerTiempo(int h, int m, int s){
        hora=((h>=0 && h<24)? h:0);
        minuto=((m>=0 && m<60)? m:0);
        segundo=((s>=0 && s<60)? s:0);
    }//fin del metodo establecertiempo
    
    public String aStringUniversal(){
        return String.format("%02d:%02d:%02d",hora,minuto,segundo);
    }//fin del metodo astringuniversal
    
    public String toString(){
        return String.format("%02d:%02d:%02d %s",((hora==0 || hora==12)?12:hora%12),minuto,segundo,(hora<12?"AM":"PM"));
    }//fin del tostring    
}//fin de la clase tiempo
