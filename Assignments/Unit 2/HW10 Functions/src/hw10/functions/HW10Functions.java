/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.functions;

/**
 *
 * @author KEVIN
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======== Kevin Andres Guairacaja =======");
            int divd=5;
            int divr=10;
            float quotient=0;
            int x = 0;
            int y = 0;
            int g = 0;
            int multiply = 0;


            quotient = divideTwoNumbers(divd,divr);
            System.out.println("================ Quotient ==============");
            System.out.println("Quotient of 5 and 10 is -> "+quotient);

            System.out.println("\n================ F(x)= x^2 =============");
            y = f(3);
            System.out.println("If x=3 equals to -> "+y);
            
            System.out.println("\n================ F(x)= x^2 =============");
            y = f(-3);
            System.out.println("If x=-3 equals to -> "+y);

            System.out.println("\n================ F(x)= x^2 =============");
            x = -1;
            y = f(x);
            System.out.println("If x is " +x+ " Then F(x) is the same -> "+y);

            x = -19;
            g = g(x);
            System.out.println("\n============== G(x)=x^2+2x+1  ==========");
            System.out.println("The Solution of the G(x)\nIf x takes the value of"
                    +x+ "\n Is equal to -> "+g);
            
            System.out.println("\n================ Multiply ==============");
            System.out.println("The multiplication table of 8 is:");

            x = 8;
            multiply = multiply(x);
            

      }

        public static float divideTwoNumbers(int dividend, int divisor){
            float quotient = 0.0F;

            quotient=(float)dividend/(float)divisor;

            return quotient;
        }

        public static int f(int x){
            int y=0;
            y=x*x;
            return y;
        }

        public static int g(int x){
            int y=0;
            y=x*x+2*x+1;
            return y;   
        }
        
        public static int multiply(int x){
            int y=0;        
            int top=10;
            int product=0;
            int table = 8;
                        
                        
            for(int j=1 ; j <= top ; j++){
                product = table * j;
                System.out.println("8 * " + j + " = " + product);

            }
        return 0;
            
        }
            
}
        

