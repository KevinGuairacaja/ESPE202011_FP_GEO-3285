/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guairacajakevinq11;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class GuairacajaKevinQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    boolean mainLoop = true;
    int option;
    
    do {
        
        System.out.println("Multiplication Tables");
        System.out.println("1--> Table of 1");
        System.out.println("2--> Table of 2");
        System.out.println("3--> Table of 3");
        System.out.println("4--> Table of 4");
        System.out.println("5--> Table of 5");
        System.out.println("6--> Table of 6");
        System.out.println("7--> Table of 7");
        System.out.println("8--> Table of 8");
        System.out.println("9--> Table of 9");
        System.out.println("10--> Table of 10");
        System.out.println("0 --> Exit");
        
        System.out.println("Enter your menu option --> \n");
        option = input.nextInt();
        
        switch(option){
            
            case 1:
                System.out.println("MULTIPLICATION : 1");
        
                int top=12;
                int product=0;
                int table = 1;


                for(int i=1 ; i <= top ; i++){
                    product = table * i;
                    System.out.println("1 * " + i + " = " + product);
                }
            
                break;
            case 2:
                System.out.println("MULTIPLICATION : 2");
        
                int top2=12;
                int product2=0;
                int table2 = 2;


                for(int i=1 ; i <= top2 ; i++){
                    product = table2 * i;
                    System.out.println("2 * " + i + " = " + product);
                }
                break;
            case 3:
                System.out.println("MULTIPLICATION : 3");
        
                int top3=12;
                int product3=0;
                int table3 = 3;


                for(int i=1 ; i <= top3 ; i++){
                    product = table3 * i;
                    System.out.println("3 * " + i + " = " + product);
                }
                break;
            case 4:
                System.out.println("MULTIPLICATION : 4");
        
                int top4=12;
                int product4=0;
                int table4 = 4;


                for(int i=1 ; i <= top4 ; i++){
                    product = table4 * i;
                    System.out.println("4 * " + i + " = " + product);
                }
                break;
            case 5:
                System.out.println("MULTIPLICATION : 5");
        
                int top5=12;
                int product5=0;
                int table5 = 5;


                for(int i=1 ; i <= top5 ; i++){
                    product = table5 * i;
                    System.out.println("5 * " + i + " = " + product);
                }
                break;
            case 6:
                System.out.println("MULTIPLICATION : 6");
        
                int top6=12;
                int product6=0;
                int table6 = 6;


                for(int i=1 ; i <= top6 ; i++){
                    product = table6 * i;
                    System.out.println("6 * " + i + " = " + product);
                }
                break;
            case 7:
                System.out.println("MULTIPLICATION : 7");
        
                int top7=12;
                int product7=0;
                int table7 = 7;


                for(int i=1 ; i <= top7 ; i++){
                    product = table7 * i;
                    System.out.println("7 * " + i + " = " + product);
                }
                break;
            case 8:
                System.out.println("MULTIPLICATION : 8");
        
                int top8=12;
                int product8=0;
                int table8 = 8;


                for(int i=1 ; i <= top8 ; i++){
                    product = table8 * i;
                    System.out.println("8 * " + i + " = " + product);
                }
                break;
            case 9:
                System.out.println("MULTIPLICATION : 9");
        
                int top9=12;
                int product9=0;
                int table9 = 9;


                for(int i=1 ; i <= top9 ; i++){
                    product = table9 * i;
                    System.out.println("9 * " + i + " = " + product);
                }
                break;
            case 10:
                System.out.println("MULTIPLICATION : 10");
        
                int top10=12;
                int product10=0;
                int table10 = 10;


                for(int i=1 ; i <= top10 ; i++){
                    product = table10 * i;
                    System.out.println("10 * " + i + " = " + product);
                }
                break;
            case 0:
                System.out.println("Goodbye  \n");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option \n");
                break;                      
                        
               
        }
    } while(option != 11);
    
    
    }
    
}
