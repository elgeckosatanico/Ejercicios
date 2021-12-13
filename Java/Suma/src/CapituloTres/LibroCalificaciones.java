
package CapituloTres;
import java.util.Scanner;
/**
 *
 * @author Emmanuel 23dms
 */
public class LibroCalificaciones {
    private String nombreDelCurso; //Variable de instancia
    
    //Constructor
    public LibroCalificaciones(String nombreCurso){
        nombreDelCurso=nombreCurso;
    }//Fin del constructor
    
    //Metodo para establecer nombre del curso
    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso=nombre;
    }//Fin del metodo establecerNombreDelCurso
    
    //Metrodo para obtener el nombre del curso
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }//Fin del metodo obtenerNombreDelCurso
    
    public void mensaje(){
        System.out.println("\nBienvenido al libro de calificaciones para\t"+obtenerNombreDelCurso());
    }//Fin del metodo mensaje
    
    public void determinaPromedio(){
        Scanner entrada=new Scanner(System.in);
        int total=0,contadorCalif=0,calificacion;
        double promedio;
        System.out.println("\nEscriba calificacion o -1 para terminar");
        calificacion=entrada.nextInt();
        
        /*while(contadorCalif<=10){
            System.out.println("\nEscriba la calificacion");
            calificacion=entrada.nextInt();
            total=total+calificacion;
            contadorCalif++;
        }//Fin del while       
        promedio=total/10;
        System.out.println("\nLa suma total de las calificaciones es:\t"+total);
        System.out.println("\nEl promedio es:\t"+promedio);*/

        while(calificacion != -1){
            total=total+calificacion;
            contadorCalif++;
            System.out.println("\nEscriba calificacion o -1 para terminar");
            calificacion=entrada.nextInt();
        }//Fin del while 
        if(contadorCalif !=0){
           promedio=(double)total/contadorCalif;
           System.out.println("\nEl total de las\t"+contadorCalif+"calificaciones es\t"+total);
           System.out.println("\nEl promedio de la cvlase es:\t"+promedio);
        }//Fin del if
        else
            System.out.println("\n no se introdujeron calificaciones");
    }//Fin del metodo determinarPromedio  
}//Fin de la clase LibroCalificacion
