package hw11.recursion;

import java.util.Scanner;

public class HW11Recursion {

    public static void main(String[] args) {
        
        System.out.println("================= Kevin Andres Guairacaja =================");
        System.out.println("Let’s solve the following mathematical permutation problem.");
        System.out.println("===========================================================");
        System.out.println("Katterine has pulled the 4 aces out of a deck.\n"
                + "She’s going to line them up on the table.\n"
                + "How many different ways could she put them?\n");
        System.out.println("Let’s think about a single combination of the 4 aces:\n"
                + "- When we have chosen the first one, we have only 3 to choose\n"
                + "- When we have chosen the second one, we have only 2 to choose\n"
                + "- When we have chosen the third one, we have only 1 to choose\n"
                + "Therefore, all possible combinations will be 4 x 3 x 2 x 1.");
        System.out.println("\nThen: ");
                
        int numberX = 4;
        int fact = 0;
        fact = factorialNumber(numberX);
        System.out.println("Factorial of " + numberX + " is equal to " + fact);
        System.out.println("\nR: Katterine could place them in 24 different ways");
    }

    public static int factorialNumber(int n) {
        if (n < 0) {
            return 0;                    
        } else {
            if (n == 0) {
                return 1;
            } else {  
                return (n * factorialNumber(n - 1));
            }
        }
    }

}
