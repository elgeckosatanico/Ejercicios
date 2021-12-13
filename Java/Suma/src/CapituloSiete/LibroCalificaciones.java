
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class LibroCalificaciones {
    private String nombreDelCurso;
    private int calificaciones[][];
    
    public LibroCalificaciones(String nombre,int arregloCalif[][]){
        nombreDelCurso=nombre;
        calificaciones=arregloCalif;
    }//fin del constructor
    
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso=nombre;
    }//fin del metodo establecernombredelcurso
    
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }//fin del metodo obtenernombredelcurso
    
    public void mensaje(){
        System.out.println("\nBienvenido al libro de calificaciones para:\t"+obtenerNombreDelCurso());
    }//fin del metodo mensaje
    
    public void procesarCalificacion(){
        imprimirCalificaciones();
        
        System.out.println("La calificacion mas baja es\t"+obtenerMinima()+
                "\nLa calificaion mas alta es:\t"+obtenerMax()+"\n");
        imprimirGrafico();     
    }//fin del metodo procesarcalificacion
    
    public int obtenerMinima(){
        int califBaja=calificaciones[0][0];
        for(int calificacion[]:calificaciones){
            for(int calificacionEs:calificacion){
                if(calificacionEs<califBaja)
                    califBaja=calificacionEs;
            }
        }//fin del for exterior
        return califBaja;            
    }//fin del metodo obtenerminima
    
    public int obtenerMax(){
        int califMax=calificaciones[0][0];
        for(int calificacion[]:calificaciones){
            for(int calificacionEs:calificacion){
                if(calificacionEs>califMax)
                    califMax=calificacionEs;
            }//fin del for interno
        }//fin del for exterior 
        return califMax;
    }//fin del metodo obtenermax
    
    public double obtenerPromedio(int conjuntoDeCalif[]){
        int total=0;
        for(int calificacion:conjuntoDeCalif)
            total+=calificacion;
        
        return (double)total/calificaciones.length;
    }//fin del metodo obtenerpromedio
    
    public void imprimirGrafico(){
        System.out.println("Distribucion de calificaciones");
        int frecuencia[]=new int[11];
        for(int calificacion[]:calificaciones){
            for(int calificacionEs:calificacion)
                ++frecuencia[calificacionEs/10];
        }//fin del for exterior
            
        for(int cuenta=0;cuenta<frecuencia.length;cuenta++){
            if(cuenta==10)
                System.out.print(100+"\t");
            else
                System.out.print(cuenta*10+"-"+(cuenta*10+9)+":");
            for(int estrella=0;estrella<frecuencia[cuenta];estrella++)
                System.out.printf("*");
            System.out.println();
        }//fin del for
    }//fin del metodo imprimirgrafico
    
    public void imprimirCalificaciones(){
        System.out.println("Las calificaciones son:\n");
        System.out.print("               ");
        for(int prueba=0;prueba<calificaciones[0].length;prueba++)
            System.out.printf("Prueba %d  ", prueba + 1);
        
        System.out.println("promedio");
        
        for(int estudiante=0;estudiante<calificaciones.length;estudiante++){
            System.out.printf("Estudiante %2d", estudiante + 1);
            for(int prueba:calificaciones[estudiante])
                System.out.printf("%10d", prueba );
            
            double promedio=obtenerPromedio(calificaciones[estudiante]);
            System.out.printf("%9.2f\n", promedio);
        }//fin del for exterior
    }//fin del metodo imprimircalificaciones
}//fin de la clase librocalificaciones
