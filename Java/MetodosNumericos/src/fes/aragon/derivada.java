/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon;

/**
 *
 * @author jrgel
 */
public class derivada {
    
    
    public float[] derivar(int grado, float[] ecuacion){
        int i,j,grado2,gradoDerivadaInicial;
        float[] ecuacionDerivada = new float[grado];
        int[] gradoDerivada= new int[grado];
        String polinomio="";
        
        grado2=grado;
        gradoDerivadaInicial=grado-1;
        
        
            for(j=0;j<grado;j++){
                //System.out.println(ecuacion[j]);
                //System.out.println(grado2);
               ecuacionDerivada[j]=grado2*ecuacion[j];
               gradoDerivada[j]=gradoDerivadaInicial;
                //System.out.println(ecuacionDerivada[j]);
               grado2=grado2-1;
               gradoDerivadaInicial=gradoDerivadaInicial-1;
            }
        grado2=grado;
        //erSystem.out.println("La derivada de la ecuacion es:");
        for(i=0;i<grado;i++){
            //System.out.println("i: "+i);
            //System.out.println(ecuacionDerivada[i]);
            //System.out.println(gradoDerivada[i]);
            //System.out.print(ecuacionDerivada[i]);
            
            if(gradoDerivada[i]==1){
             //er System.out.print("x");
              polinomio = polinomio+"x";
            
            }
            if(gradoDerivada[i]>0&&gradoDerivada[i]!=1){
              //erSystem.out.print("x^");
              //erSystem.out.print(gradoDerivada[i]);
              polinomio = polinomio+"x^";
              polinomio = polinomio+gradoDerivada[i];
            }
            if(i<(grado-1)){
            if(ecuacionDerivada[i+1]>=0 && gradoDerivada[i]>0){
               //erSystem.out.print("+");
               polinomio = polinomio+"+";
             }
            }
        }
        //System.out.println("Posicion dos"+ecuacionDerivada[1]);
     
         return ecuacionDerivada;
    }
        
}
