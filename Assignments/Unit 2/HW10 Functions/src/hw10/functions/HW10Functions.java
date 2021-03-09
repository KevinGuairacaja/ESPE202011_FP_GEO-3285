 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.functions;

import java.util.Scanner;

public class HW10Functions {

    public static void main(String[] args) {
        System.out.println("======== Kevin Andres Guairacaja =======");
        Scanner e = new Scanner(System.in);
            System.out.println("Enter the First Value");
            int scanner1 = e.nextInt();

            System.out.println("Enter the Second Value");
            int scanner2 = e.nextInt();

            int dividend=scanner1;
            int divisor=scanner2;
            float quotient=0;
            int variableX = 0;
            int variableY = 0;
            int variableG = 0;
            int multiply = 0;


            quotient = divideTwoNumbers(dividend,divisor);
            System.out.println("================ Quotient ==============");
            System.out.println("Quotient of " +scanner1+ " and " +scanner2+ " is -> "+quotient);

            System.out.println("\n================ F(x)= x^2 =============");
            variableY = computeSquare(scanner1);
            System.out.println("If x="+scanner1+" equals to -> "+variableY);
            
            System.out.println("\n================ F(x)= x^2 =============");
            variableY = computeSquare(scanner2);
            System.out.println("If x="+scanner2+" equals to -> "+variableY);

            System.out.println("\n================ F(x)= x^2 =============");
            variableX = scanner1;
            variableY = computeSquare(scanner1);
            System.out.println("If x is " +variableX+ " Then F(x) is the same -> "+variableY);

            variableX = scanner2;
            variableG = computeParabola(scanner2);
            System.out.println("\n============== G(x)=x^2+2x+1  ==========");
            System.out.println("The Solution of the G(x)\nIf x takes the value of "
                    +variableX+ "\nIs equal to -> "+variableG);
            
            System.out.println("\n================ Multiply ==============");
            System.out.println("The multiplication table of " +scanner1+ " is:");

            variableX = scanner1;
            multiply = showTheMultiplicationTable(variableX);
            
            System.out.println("\n============ Factorial Number ==========");
            
            int number = scanner2;
            int fact = 0;
            fact= factorialNumber(number);
            System.out.println("The Factorial Number of " +number+ " is equal to " +fact);
            

      }

        public static float divideTwoNumbers(int dividend, int divisor){
            float quotient = 0.0F;

            quotient=(float)dividend/(float)divisor;

            return quotient;
        }

        public static int computeSquare(int x){
            int y=0;
            y=x*x;
            return y;
        }

        public static int computeParabola(int x){
            int y=0;
            y=x*x+2*x+1;
            return y;   
        }
        
        public static int showTheMultiplicationTable(int x){
            int y=0;        
            int top=10;
            int product=0;
            int table = x;
                        
                        
            for(int j=1 ; j <= top ; j++){
                product = table * j;
                System.out.println(table+ " * " + j + " = " + product);

            }
        return 0;       
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
        

