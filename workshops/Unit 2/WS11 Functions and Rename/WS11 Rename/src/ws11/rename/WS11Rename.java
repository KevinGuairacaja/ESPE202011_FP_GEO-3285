/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11.rename;

/**
 *
 * @author KEVIN
 */
public class WS11Rename {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int numberX = 5;
            int fact = 0;
            fact= factorialNumber(numberX);
            System.out.println("Factorial of " +numberX+ " is equal to " +fact);
            
    }
    public static int factorialNumber(int n){
            if (n < 0){
                return -1;
            } else{        
                if( n==0 ){
                    return 1;
            }else{
            return( n * factorialNumber(n -1));
            }
            }        
        }
    
}
