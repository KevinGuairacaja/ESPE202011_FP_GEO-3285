/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04.menu;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class HW04Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    boolean mainLoop = true;
    int option;
    
    do {
        System.out.println("Area and Volume Calculator");
        System.out.println("1. -> Area");
        System.out.println("2. -> Volume");
        System.out.println("3. -> Exit");
        
        System.out.println("Enter your menu option --> ");
        option = input.nextInt();
        
        switch(option){
            
            case 1:                
    
                do {
                    System.out.println("Area Calculator");
                    System.out.println("1. -> Cube");
                    System.out.println("2. -> Pyramid");
                    System.out.println("3. -> Cylinder");
                    System.out.println("4. -> Cone");
                    System.out.println("5. -> Sphere");                    
                    System.out.println("6. -> Exit");
                    

                    System.out.println("Enter your menu option --> ");
                    option = input.nextInt();
        
                    switch(option){
                        
                        case 1:
                            // A=6a^2
                            double multiplicand=6;
                            double multiplier;
                            double area1;
                            System.out.println("Enter side value -> ");
                            multiplier = input.nextDouble(); 
                            area1 = multiplicand * multiplier * multiplier;
                            System.out.println("The area is --> \n" + area1);
                            break;
                            
                        case 2:
                            // A=LADO+LADO+LADO+LADO*ALTURA/2 + Lado1 * Lado2
                            double lado1;
                            double lado2;
                            double altura;
                            double area2;
                            System.out.println("Enter the value of side A -> ");
                            lado1 = input.nextDouble(); 
                            System.out.println("Enter the value of side B -> ");
                            lado2 = input.nextDouble();
                            System.out.println("Enter height value -> ");
                            altura = input.nextDouble();
                            
                            area2 = (((2*lado1 + 2*lado2) * altura) / 2) + (lado1 * lado2);
                            System.out.println("The area is --> \n" + area2);
                            break;   
                            
                        case 3:
                            // A=2*PI*RADIO*(ALTURA * RADIO)                                                                                    
                            double radio;
                            double altura2;
                            double area3;
                            System.out.println("Enter radius value -> ");
                            radio = input.nextDouble(); 
                            System.out.println("Enter height value -> ");
                            altura2 = input.nextDouble(); 
                            area3 = (2*3.14*radio)*(altura2 + radio);
                            System.out.println("The area is --> \n" + area3);
                            break;                            
                            
                        case 4:
                            // A=PI*RADIO^2+PI*RADIO*ALTURA INCLINADA
                            double radio2;
                            double alturainclinada;
                            double area4;
                            System.out.println("Enter radius value -> ");
                            radio2 = input.nextDouble();                             
                            System.out.println("Enter the slant height value -> ");
                            alturainclinada = input.nextDouble(); 
                            area4 = (3.14*radio2*radio2)+(3.14*radio2*alturainclinada);
                            System.out.println("The area is --> \n" + area4);
                            break;                            
                            
                        case 5: 
                            // A=4*PI*RADIO^2
                            double radio3;
                            double area5;
                            System.out.println("Enter radius value -> ");
                            radio3 = input.nextDouble();                           
                            area5 = 4*3.14*radio3*radio3;
                            System.out.println("The area is --> \n" + area5);
                            break;                             
                            
                        case 6:
                            System.out.println("Goodbye Bro \n");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid option \n");
                            break;
                        
                    }
                
                } while(option != 6); 
            
            case 2:
                do {
                    System.out.println("Volume Calculator");
                    System.out.println("1. -> Cube");
                    System.out.println("2. -> Pyramid");
                    System.out.println("3. -> Cylinder");
                    System.out.println("4. -> Cone");
                    System.out.println("5. -> Sphere");                    
                    System.out.println("6. -> Exit");
                    

                    System.out.println("Enter your menu option --> ");
                    option = input.nextInt();
        
                    switch(option){
                        
                        case 1:
                            // V=LADO^3
                            double lado;
                            double volume1;
                            System.out.println("Enter side value -> ");
                            lado = input.nextDouble(); 
                            volume1 = lado*lado*lado;
                            System.out.println("The volume is --> \n" + volume1);
                            break;
                            
                        case 2:
                            // V=1/3*BASE*ALTURA
                            double base;
                            double altura;
                            double volume2;
                            System.out.println("Enter the base value  -> ");
                            base = input.nextDouble();                            
                            System.out.println("Enter height value -> ");
                            altura = input.nextDouble();                            
                            volume2 = 1/3*base*altura;
                            System.out.println("The area is --> \n" + volume2);
                            break;   
                            
                        case 3:
                            // V=PI*RADIO^2*ALTURA                                                                                
                            double radio;
                            double altura2;
                            double volume3;
                            System.out.println("Enter radius value -> ");
                            radio = input.nextDouble(); 
                            System.out.println("Enter height value -> ");
                            altura2 = input.nextDouble(); 
                            volume3 = (3.14*radio*radio*altura2);
                            System.out.println("The area is --> \n" + volume3);
                            break;                            
                            
                        case 4:
                            // V=(PI*RADIO^2*ALTURA)/3
                            double radio2;
                            double altura3;
                            double volume4;
                            System.out.println("Enter radius value -> ");
                            radio2 = input.nextDouble();                             
                            System.out.println("Enter the height value -> ");
                            altura3 = input.nextDouble(); 
                            volume4 = (3.14*radio2*radio2*altura3)/3;
                            System.out.println("The area is --> \n" + volume4);
                            break;                            
                            
                        case 5: 
                            // V=4/3*PI*RADIO^3
                            double radio3;
                            double volume5;
                            System.out.println("Enter radius value -> ");
                            radio3 = input.nextDouble();                           
                            volume5 = (4/3)*3.14*radio3*radio3*radio3;
                            System.out.println("The area is --> \n" + volume5);
                            break;                             
                            
                        case 6:
                            System.out.println("Goodbye Bro \n");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid option \n");
                            break;
                        
                    }
                
                } while(option != 6); 
            
            
            
            case 3:
                System.out.println("Goodbye Bro \n");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option \n");
                break;                    
        }
    } while(option != 3);       
    
    }
    
}
    
    

