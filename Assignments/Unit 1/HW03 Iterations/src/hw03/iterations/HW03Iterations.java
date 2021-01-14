/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03.iterations;

/**
 *
 * @author KEVIN
 */
public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i = 0;
        
        System.out.println("=== This is a while loop from 1 to 19 ===");
        
        while( i < 19){
            System.out.println("i -> " + ( i+1 ));
           i++;
        }
        
        System.out.println("====== MULTIPLICATION : 19 ======");
        
        int top=12;
        int product=0;
        int table = 19;
                        
                        
        for(int j=1 ; j <= top ; j++){
            product = table * j;
            System.out.println("19 * " + j + " = " + product);
        }
        
        System.out.println("======= Example to FOR =======");
        
        int sum;
        int addend1 = 1;
        int addend2 = 8;
        int top1 = 19;
        
               
        sum = addend1 + addend2;
        
        for(int adden1=1 ; addend1 <= top1 ;addend1++){
            sum = addend1 + addend2;
            System.out.println("8 + " + addend1 + " = " + sum);     
        }
    }
    
}
