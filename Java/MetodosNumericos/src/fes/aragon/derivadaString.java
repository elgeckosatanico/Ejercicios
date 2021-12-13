
package fes.aragon;

/**
 *
 * @author User
 */
public class derivadaString {
    
    public String derivarString(int grado, float[] ecuacion){
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
               grado2=grado2-1;
               gradoDerivadaInicial=gradoDerivadaInicial-1;
            }
        grado2=grado;
        for(i=0;i<grado;i++){

            polinomio=polinomio+Float.toString(ecuacionDerivada[i]);
            if(gradoDerivada[i]==1){
              polinomio = polinomio+"x";
            
            }
            if(gradoDerivada[i]>0&&gradoDerivada[i]!=1){
              polinomio = polinomio+"x^";
              polinomio = polinomio+gradoDerivada[i];
            }
            if(i<(grado-1)){
            if(ecuacionDerivada[i+1]>=0 && gradoDerivada[i]>0){
               polinomio = polinomio+"+";
             }
            }
        }
        //System.out.println("Posicion dos"+ecuacionDerivada[1]);
     
         return polinomio;
    }
}
