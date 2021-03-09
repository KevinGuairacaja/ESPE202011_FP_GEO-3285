package ws19.arrays.inspection;

import java.util.Scanner;

public class WS19ArraysInspection {

    public static void main(String[] args) {
        System.out.println("----------Guaman Alan----------");
        int sum = 0;
        int[] number = new int[5];
        float[] calculateTheAverageOfThreeNumbers = new float[3];
        float average = 0;

        System.out.println("Plase Ingrese la cantidad de numeros que desea sumar:");
        sum = getTheSumOfAnArray(number, sum);
        //Todo esta bien

        System.out.println("----------------------------------------");
        System.out.println("Enter the numbers of the array -> ");
        average = GetTheAverage(calculateTheAverageOfThreeNumbers, average);
        //El "Average" Debe ser de los tres numeros no individualmente
        
        //Falte el "Find Number"

    }

    private static int getTheSumOfAnArray(int[] number, int sum) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.print("Ingrse el valor que quiere sumar " + i + "->");
            number[i] = scanner.nextInt();
            sum += number[i];

        }
        System.out.println("The sum of the inserted values ->" + sum);
        return sum;

    }

    public static float GetTheAverage(float[] calculateTheAverageOfThreeNumbers, float average) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            calculateTheAverageOfThreeNumbers[i] = scanner.nextFloat();

        }
        for (float num : calculateTheAverageOfThreeNumbers) {
            average = ((average + num) / 3);
            System.out.println("the average of the array is -> " + average);

        }
        return average;

    }

}
