
package fes.aragon;

/**
 *
 * @author jrgel
 */
public class metodo {
 
    public float vonMises(float puntoInicial, float[] ecuacion, int grado, int nRep){
        int i,j,k,l,grado2=grado;
        float x=puntoInicial, fx,fxp,fdx,fdxp,xi=x;
        float[] der = new float[grado-1];
        
        derivada derivada = new derivada();
        
        //RECORRE EL NUMERO DE ITERACIONES SOLICITADAS
       for(i=0;i<nRep;i++){
            //EVALUA LA FUNCION  f(xn) 
            fxp=fdx=fdxp=fx=0;
            
            for(j=0;j<=grado;j++){
                fxp = (float) (Math.pow(x,grado2-j)*(ecuacion[j]));
                fx=fxp+fx;
            }
            //EVALUA LA DERIVADA DE Fx
            der=derivada.derivar(grado, ecuacion);
            for(k=0;k<=grado-1;k++){
                fdxp = (float) (Math.pow(xi,grado-1-k)*(der[k]));
                fdx=fdxp+fdx;
            }
            x=x-(fx)/(fdx);
           
            
        }
       return x;
    } 
    
    public float NewtonRaphson (float puntoInicial, float[] ecuacion, int grado, int repeticiones){
        float fx=0,fxp = 0,fdx=0,fdxp=0;
        float[] der = new float[grado+1];
        float x=0;
        derivada derivada = new derivada();
        der=derivada.derivar(grado, ecuacion);
        
        
        for(int k=0; k<=repeticiones; k++){
            fx=ecuacion[0];
        for (int i = 1; i < grado+1; i++) {
            fxp=(fx*puntoInicial)+ecuacion[i];
            fx=fxp;
            
        }
        

            fdx=der[0];
        for(int j=1; j< grado; j++){
            fdxp=fdx*puntoInicial+der[j];
            fdx=fdxp;
            
        }
        
        
            x= puntoInicial-(fxp/fdxp); 
            puntoInicial=x;
        }
    return x;    
    }   
    
    
}
