package hw16.matrix.function;

import java.util.Scanner;

public class HW16MatrixFunction {

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
        
        a = readMatrixElements(m, n, "A", input);
        b = readMatrixElements(m, n, "B", input);
        
        for(int tab = 0; tab <= m / 2; tab++){
            System.out.println("\t");
        }
        
        System.out.print("The Matrix A is: ");
        prettyPrintMatrix(m, n, a);
        System.out.println("");
        
        System.out.print("The Matrix B is:  ");
        prettyPrintMatrix(m, n, b);
        System.out.println("");
        
        transpose(n, m, t, a);
        for(int tab = 0 ; tab <= m / 2; tab++){
            System.out.print("");
        }
        
        System.out.println("The sum of A and B is: ");
        c = addTwoMatrices(m, n, a, b);
        prettyPrintMatrix(m, n, c);
        
        System.out.println("\nThe transpose the A to T is:");
        System.out.print("T: ");
        prettyPrintMatrix(n, m, t);
    }
    
    public static float [][] readMatrixElements(int m, int n, String matrixName, Scanner input){
        float[][] matrix;
        matrix = new float[m][n];
        for(int i=0; i<m; i++){
            System.out.println("-- ROW Numbers " +(i+1)+ "--");
            for(int j=0; j<m; j++){
                System.out.print("[" +(i+1)+ "][" +(j+1)+ "]: ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }    
    
    public static void transpose(int n, int m, float[][]t, float[][]a){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                t[i][j] = a[i][j];
            }
        }
    }
    
    public static float[][] addTwoMatrices(int m, int n, float[][]a, float[][]b){
        float[][]c;
        c = new float [m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                c[i][j] = a[i][j] + b[i][j];
                
            }
        }
        return c;
    }
    
    public static void prettyPrintMatrix(int m, int n, float[][] matrix) {
        for (int i=0; i< m; i++){
            System.out.println("");
            for(int j=0; j< n; j++){
                if(j== 0){
                    if(i== 0){
                        System.out.print("┌ " );
                    }else if (i == m - 1){
                        System.out.print("└ " );
                    }else{
                        System.out.print("│ " );
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)){
                    System.out.print(" " );
                }
                if ( j== (n - 1)){
                    if (i == 0){
                        System.out.print(" ┐" );
                    } else if ( i == m - 1){
                        System.out.print(" ┘" );
                    }else{
                        System.out.print(" │" );
                    }
                }
            }
        }
        System.out.println("");
    }
    
}
