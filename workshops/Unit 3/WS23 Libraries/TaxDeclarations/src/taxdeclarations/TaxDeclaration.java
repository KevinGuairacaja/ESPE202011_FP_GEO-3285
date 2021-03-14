package taxdeclarations;

import ec.edu.espe.taxes.BasicTax;
import java.util.Scanner;

public class TaxDeclaration {

    public static void main(String[] args) {
        
        System.out.println("==== Kevin Andres Guairacaja Taxes ====");
        float price;
        float totalPrice;
        final float ivaPercentage = 12;
        float ivaValue;
        Scanner input = new Scanner(System.in);
        
        System.out.println("IVA: ");
        System.out.println("Enter the price of your products: ");
        price = input.nextFloat();
        ivaValue = BasicTax.computeIVA(price, ivaPercentage);
        totalPrice = price + ivaValue;
        System.out.println("Total price is: " +totalPrice);
    }
    
}
