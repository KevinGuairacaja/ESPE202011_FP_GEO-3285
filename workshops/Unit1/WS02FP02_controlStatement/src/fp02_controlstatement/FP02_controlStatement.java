/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatement;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class FP02_controlStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int number;
        Scanner scanner = new Scanner ( System.in ) ;
       
        System.out.printf("Please enter an integer --> ");
        number = scanner.nextInt() ;
    
        if ( number % 2 == 0 )
        {
                System.out.printf( "The number " +number+ " Is Even. " ) ;
        }
        else
        {
                System.out.printf( "The number " +number+ " Is Odd. " ) ;
        }
        }
}
