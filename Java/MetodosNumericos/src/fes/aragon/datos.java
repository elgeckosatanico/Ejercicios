
package fes.aragon;

import java.util.Scanner;

/**
 *
 * @author jrgel
 */
public class datos {

    //public int i,grado;
    
   /* public float[] pedirDatos(int grado){
    int i;
    Scanner sc = new Scanner(System.in);
    
    float[] ecuacion = new float[grado+1];
        for(i=0; i<grado; i++){
            System.out.println("Digite el coeficiente de x^"+(grado-i) +": ");
            ecuacion[i] = sc.nextInt();
        }
    System.out.println("digite el valor de la constante");
    ecuacion[i] = sc.nextInt();
    
    int longitud = ecuacion.length;
    */
    public String MostrarEcuacionIntroducida(float[] ecuacion){
        int i, longitud,grado;
        longitud = ecuacion.length;
        grado=longitud-1;
        String polinomio=""; 
    for(i=0; i<longitud-2;i++){
           
            polinomio = polinomio+Float.toString(ecuacion[i])+"x^"+Integer.toString(grado-i);
            
          //System.out.println(" Numero siguiente  "+numeros[i+1]);
             if(ecuacion[i+1]>=0 && i<grado-2){
               polinomio = polinomio+"+";
       
             }
            
        }
        if(ecuacion[i]>=0){
               polinomio = polinomio+"+";
             }
        polinomio=polinomio+Float.toString(ecuacion[i])+"x";
        i=i+1;
         if(ecuacion[i]>=0){
               polinomio = polinomio+"+";
             }
        polinomio=polinomio+Float.toString(ecuacion[i]);
        
        return polinomio;
    }
}
