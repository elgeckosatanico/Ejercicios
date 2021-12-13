//Tirar un dado 6000 veces
package CapituloCincio;
import java.util.Random;
/**
 *
 * @author Emmanuel 23dms
 */
public class TirarDado {
    public static void main(String[]args){
        Random nr=new Random();
        int f1=0,f2=0,f3=0,f4=0,f5=0,f6=0,cara;
        for(int counter=1;counter<=6000;counter++){
            cara=1+nr.nextInt(6);
            switch(cara){
                case 1:
                   ++f1;
                   break;
                case 2:
                    ++f2;
                    break;
                case 3:
                    ++f3;
                    break;
                case 4:
                    ++f4;
                    break;
                case 5:
                    ++f5;
                    break;
                case 6:
                    ++f6;
                    break;
            }//Fin del switch
        }//Fin del for
        System.out.println("cara\tfrecuencia");
        System.out.print("1\t"+f1+"\n"+"2\t"+f2+"\n"+"3\t"+f3+"\n"+"4\t"+f4+"\n"+"5\t"+f5+"\n"+"6\t"+f6+"\n");
    }//Fin del main
}//Fin de la clase TirarDado
