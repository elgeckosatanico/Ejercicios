/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file01;

/**
 *
 * @author Emmanuel 23dms
 */
public class Divisibles {
    public static void main(String[]args){
        for(int j=1;j<101;j++){
            if(j%2==0 && j%3==0){
                System.out.println(j);
            }
        }
    }
}
