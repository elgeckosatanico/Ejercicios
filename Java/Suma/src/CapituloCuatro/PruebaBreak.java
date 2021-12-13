
package CapituloCuatro;

/**
 *
 * @author Emmanuel 23dms
 */
public class PruebaBreak {
    public static void main(String[]args){
        int account;
        for(account=1;account<=10;account++){
            if(account==5)
                break;
            System.out.println(account);
        }//End of for
    }//End of main
}//End of class PruebaBreak
