package hw15.matrix.addition;

import java.util.Scanner;

public class HW15MatrixAddition {

    public static void main(String[] args) {
    System.out.println("============= Kevin Andres Guairacaja =============");
    System.out.println("Lets Calculate to Matrix Addition to 3x3.");    
    Scanner e = new Scanner(System.in);
        
        int a[][] = printConjuntA(e);
        System.out.println("The Matrix A is: ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + a[i][j]);
            }
        }
        
        System.out.println("\n");
        int b[][] = printConjuntB(e);
        System.out.println("The Matrix B is: ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + b[i][j]);
            }
        }
        
        System.out.println("\n");
        int c[][] = new int[3][3];
        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The Addition to A and B is Equals to: ");
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("");
            for (int j = 0 ; j < 3 ; j++) {
                System.out.print("\t " + c[i][j]);
            }
        }   
        System.out.println("");
    }
   

    public static int[][] printConjuntB(Scanner e) {
        System.out.println("Enter the First Subconjunt to B: ");
        int scanner1 = e.nextInt();
        int scanner2 = e.nextInt();
        int scanner3 = e.nextInt();
        System.out.println("Enter the Second Subconjunt to B: ");
        int scanner4 = e.nextInt();
        int scanner5 = e.nextInt();
        int scanner6 = e.nextInt();
        System.out.println("Enter the Third Subconjunt to B: ");
        int scanner7 = e.nextInt();
        int scanner8 = e.nextInt();
        int scanner9 = e.nextInt();
        int b[][] = {{scanner1, scanner2, scanner3}, {scanner4, scanner5, scanner6},
            {scanner7, scanner8, scanner9}};
        return b;
    }

    public static int[][] printConjuntA(Scanner e) {
        System.out.println("Enter the First Subconjunt to A: ");
        int scanner1 = e.nextInt();
        int scanner2 = e.nextInt();
        int scanner3 = e.nextInt();
        System.out.println("Enter the Second Subconjunt to A: ");
        int scanner4 = e.nextInt();
        int scanner5 = e.nextInt();
        int scanner6 = e.nextInt();
        System.out.println("Enter the Third Subconjunt to A: ");
        int scanner7 = e.nextInt();
        int scanner8 = e.nextInt();
        int scanner9 = e.nextInt();
        int a[][] = {{scanner1, scanner2, scanner3}, {scanner4, scanner5, scanner6},
            {scanner7, scanner8, scanner9}};
        return a;
    }
    
}
