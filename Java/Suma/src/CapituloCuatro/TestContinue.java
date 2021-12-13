
package CapituloCuatro;

/**
 *
 * @author Emmanuel 23dms
 */
public class TestContinue {
    public static void main(String[]args){
        for(int account=1;account<=10;account++){
            if(account==5)
                continue;
            System.out.println(account);
        }//End of for
    }//End of main
}//End of class TestContinue
