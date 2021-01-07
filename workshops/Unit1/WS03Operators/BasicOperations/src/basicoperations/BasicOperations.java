/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

import static java.time.Clock.system;

/**
 *
 * @author KEVIN
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        
        addend1 = 5;
        addend2 = 18;
        
        
        int minuend;
        int subtrahend;
        int difference;
        
        minuend = -23;
        subtrahend = -6;
                            
        int multiplicand;
        int multiplier;
        int product;
                
        multiplicand = 19;
        multiplier = 8;
       
        int dividend;
        int divisor;
        int quotient;
        
        dividend = 30;
        divisor = 5;
        
        int dividend2;
        int divisor2;
        int remainder;
        
        dividend2 = 16;
        divisor2 = 3;
              
      
                
        
        sum = addend1 + addend2;
        
        System.out.println("The addition of " + addend1 + " + " + addend2 + 
                " is equal to --> " + sum);
                
        ++sum;
        System.out.println("Sum is equal to --> " + sum);
        
        sum++;
        System.out.println("Sum is equal to --> " + sum);
        
        System.out.println("Additing one to sum " + (sum++));
                
        System.out.println("Ading one to sum " + ((++sum)));
            
        System.out.println("The substraction of " + minuend + " - " + subtrahend + 
                " is equal to " + (minuend - subtrahend));
                
        System.out.println("The product of " + multiplicand + "*" + multiplier + 
                " is equal to " + (multiplicand * multiplier));      
        
        System.out.println("The quotient of " + dividend + "/" + divisor + 
                " is equal to " + (dividend / divisor));
        
        System.out.println("The remainder of " + dividend2 + "%" + divisor2 +
                " is equal to " + (dividend2 % divisor2)); 
    }
    
}
