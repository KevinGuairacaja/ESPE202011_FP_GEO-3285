package modularcalculator;
        
import java.util.Scanner;
import utils.BasicOperation;

public class ModularCalculator {

    public static void main(String[] args) {
        System.out.println("========= Kevin Andres Guairacaja =========");
        float operand1;
        float operand2;
        float result;
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n==== BASICS OPERATIONS ====");
        System.out.println("Enter Two Number: ");
        operand1 = input.nextFloat();
        operand2 = input.nextFloat();
        
        System.out.println("\n==== ADITTION ====");
        result = BasicOperation.addTwoNumbers(operand1, operand2);
        System.out.println(operand1+" + "+operand2+ " = " +result);

        System.out.println("\n==== SUBTRACTION ====");
        result = BasicOperation.subtractTwoNumbers(operand1, operand2);
        System.out.println(operand1+" - "+operand2+ " = " +result);
        
        System.out.println("\n==== PRODUCT ====");
        result = BasicOperation.multiplyTwoNumbers(operand1, operand2);
        System.out.println(operand1+" * "+operand2+ " = " +result);
        
        System.out.println("\n==== DIVITION ====");
        result = BasicOperation.divideTwoNumbers(operand1, operand2);
        System.out.println(operand1+" / "+operand2+ " = " +result);
    }
    
}
