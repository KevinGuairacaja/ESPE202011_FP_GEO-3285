package matrix.operation;

import java.util.Scanner;
import ec.edu.espe.matrix.MatrixLibrary;

public class MatrixOperation {

    public static void main(String[] args) {
        System.out.println("============= Kevin Andres Guairacaja =============");
        float [][] a;
        float [][] b;
        float [][] t;
        float [][] c;
        int m=0;
        int n=0;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the matrix dimensions: ");
        System.out.print("m: ");
        m = input.nextInt();
        System.out.print("n: ");
        n = input.nextInt();
        
        a = new float [m][n];
        b = new float [m][n];
        c = new float [m][n];
        t = new float [m][n];
        
        System.out.println("\nEnter the elements of the Matrix: ");
        
        a = MatrixLibrary.readMatrixElements(m, n, "A", input);
        b = MatrixLibrary.readMatrixElements(m, n, "B", input);
        
        for(int tab = 0; tab <= m / 2; tab++){
            System.out.println("\t");
        }
        
        System.out.print("The Matrix A is: ");
        MatrixLibrary.prettyPrintMatrix(m, n, a);
        System.out.println("");
        
        System.out.print("The Matrix B is:  ");
        MatrixLibrary.prettyPrintMatrix(m, n, b);
        System.out.println("");
        
        MatrixLibrary.transpose(n, m, t, a);
        for(int tab = 0 ; tab <= m / 2; tab++){
            System.out.print("");
        }
        System.out.println("====== Operation 1 ======");
        System.out.println("The Sum of A and B is: ");
        c = MatrixLibrary.addTwoMatrices(m, n, a, b);
        MatrixLibrary.prettyPrintMatrix(m, n, c);
        
        System.out.println("\n====== Operation 2 ======");
        System.out.println("The Subtract of B and A is: ");
        c = MatrixLibrary.subtractTwoMatrices(m, n, a, b);
        MatrixLibrary.prettyPrintMatrix(m, n, c);
        
        System.out.println("\n====== Operation 3 ======");
        System.out.println("The transpose the A to T is:");
        System.out.print("T: ");
        MatrixLibrary.prettyPrintMatrix(n, m, t);
    }
        
}
