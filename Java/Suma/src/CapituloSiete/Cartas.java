
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class Cartas {
    private String cara;
    private String palo;

   
       
    
    public  Cartas(String caraCarta,String paloCarta){
        cara=caraCarta;
        palo=paloCarta;
    }//fi del constructor cartas
    
    public String toString(){
        return cara+"de"+palo;
    }//fin del metodo tostring
    
    
    
}//fin de la clase cartas
