package hw11.recursion;

import java.util.Scanner;

public class HW11Recursion {

    public static void main(String[] args) {
        
        
        System.out.println("================= Kevin Andres Guairacaja =================");
        System.out.println("Let’s solve the following mathematical permutation problem.");
        System.out.println("===========================================================");
        System.out.println("We want to organize a football championship. \n" +
                            "How many possible finals we will have \n" +
                            "Depending on the number of teams that participate");
        Scanner e = new Scanner(System.in);
        System.out.println("Choose how many teams will participate in your tournament: ");
        float scanner1 = e.nextInt();
        float numberX = scanner1;
        float perm = 0;
        float r = numberX - 2;
        perm = calculateProblem((int) numberX)/calculateProblem((int) r);
        System.out.println("\nThe possible finals you will "
                + "have in your championship will be:\n" +perm);
        
        }

    public static int calculateProblem(float x) {
        if (x < 0) {
            return 0;                    
        } else {
            if (x == 0) {
                return 1;
            } else { 
                return(int) ((x * calculateProblem(x - 1)));
            }
        }
    }

}
