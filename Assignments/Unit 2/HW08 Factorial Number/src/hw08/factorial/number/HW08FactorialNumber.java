/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08.factorial.number;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int factorial=1;
        int numero;
        int option = 0;
               
        Scanner input = new Scanner(System.in);
        
        do{
            
            System.out.println("Enter the value you want to make the factorial --> ");            
            System.out.println("Press 0 to exit --> ");
            numero=input.nextInt();
            
            for(int i = numero; i > 15 ; i--){
                      factorial=factorial*i;              

                    }                    
                    System.out.println("The Factorial of " + numero + " is "+factorial);
                    
            
            switch(option){
            
                                   
                case 0:
                    System.out.println("Goodbye Bro \n");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid option \n");
                    break;
            }
        
        }while (option !=15);
    
    }
    
}
