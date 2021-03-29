package ec.edu.espe.matrix;

import java.util.Scanner;

public class MatrixLibrary {

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
    
    public static float[][] subtractTwoMatrices(int m, int n, float[][]a, float[][]b){
        float[][]c;
        c = new float [m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                c[i][j] = b[i][j] - a[i][j];
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
