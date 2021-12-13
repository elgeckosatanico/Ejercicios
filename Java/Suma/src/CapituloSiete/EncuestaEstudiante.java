
package CapituloSiete;

/**
 *
 * @author Emmanuel 23dms
 */
public class EncuestaEstudiante {
    public static void main(String[]rgs){
        int respuestas[]={1,2,3,4,5,5,5,6,6,7,8,9,10,2,3,4,5,6,7,8,9,10,1};
        int frecuencia[]=new int[11];
        for(int respuesta=1;respuesta<respuestas.length;respuesta++)
            ++frecuencia[respuestas[respuesta]];
        System.out.println("Calificaion\tFrecuencia");
        for(int calificacion=1;calificacion<frecuencia.length;calificacion++)
            System.out.println(calificacion+"\t\t"+frecuencia[calificacion]);
    }//fin del main
}//fin de la clase encuesta estudiante
