package ws11.functions;

import java.util.Scanner;

public class WS11Functions {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Enter the First Value");
        int scanner1 = e.nextInt();

        System.out.println("Enter the Second Value");
        int scanner2 = e.nextInt();

        if (scanner1 % 2 == 0) {
            showMultiplication(scanner1, scanner2);
        }

        if (scanner1 % 3 == 0) {
            showAdittion(scanner1, scanner2);
        }

        if (scanner1 % 7 == 0) {
            showModulus(scanner1, scanner2);
        }

        if (scanner1 % 11 == 0) {
            showMultiplicationTable(scanner1, scanner2);
        }

        if (scanner1 % 13 == 0) {
            showQuotient(scanner1, scanner2);
        }
    }

    public static void showQuotient(int paramScanner1, int paramScanner2) {
        System.out.println("The number " + paramScanner1 + " Is Divisible for 13. \n");
        System.out.println("The number " + paramScanner2 + " Is Divisible for 13. \n");
        int dividend = paramScanner1;
        int divisor = paramScanner2;
        double quotient;

        quotient = dividend / divisor;
        System.out.println("So " + dividend + "/" + divisor + "=" + quotient);
    }

    public static void showModulus(int paramScanner1, int paramScanner2) {
        System.out.println("The number " + paramScanner1 + " Is Divisible for 7. \n");
        System.out.println("The number " + paramScanner2 + " Is Divisible for 7. \n");
        int dividend = paramScanner1;
        int divisor = paramScanner2;
        int remainder;

        remainder = dividend % divisor;
        System.out.println("So " + dividend + "%" + divisor + "=" + remainder);
    }

    public static void showAdittion(int paramScanner1, int paramScanner2) {
        System.out.println("The number " + paramScanner1 + " Is Divisible for 3. \n");
        System.out.println("The number " + paramScanner2 + " Is Divisible for 3. \n");
        int addend1 = paramScanner1;
        int addend2 = paramScanner2;
        int sum;

        sum = addend1 + addend2;
        System.out.println("So " + addend1 + "+" + addend2 + "=" + sum);
    }

    public static void showMultiplication(int paramScanner1, int paramScanner2) {
        System.out.println("The number " + paramScanner1 + " Is Divisible for 2. \n");
        System.out.println("The number " + paramScanner2 + " Is Divisible for 2. \n");
        int multiplicand = paramScanner1;
        int multiplier = paramScanner2;
        int product;
        product = multiplicand * multiplier;

        System.out.println("So " + multiplicand + "*" + multiplier + "=" + product);
    }

    public static void showMultiplicationTable(int paramScanner1, int paramScanner2) {

        System.out.println("The number " + paramScanner1 + " Is Divisible for 11. \n");
        System.out.println("The number " + paramScanner2 + " Is Divisible for 11. \n");
        System.out.println("====== MULTIPLICATION : 11 ======");

        int top = 12;
        int product = 0;
        int table = 11;

        for (int j = 1; j <= top; j++) {
            product = table * j;
            System.out.println("11 * " + j + " = " + product);
        }
    }
}
