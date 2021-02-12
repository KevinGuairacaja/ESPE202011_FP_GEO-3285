package hw12.taxes;

import java.util.Scanner;

public class HW12Taxes {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        float tax = 0.0f;
        float exce = 0.0f;
        float excePor = 0.0f;
                        
        do {
            option = printTaxMenu(input);

            switch (option) {

                case 1:
                    // Impuesto a la Renta
                    tax = calculateIncomeTax(e, tax);
                    System.out.println("The Value to Pay is: "+tax);
                    break;                    
                    
                case 2:
                    tax = calculateCurrencyTax(e, tax);
                    System.out.println("The Value to pay is: "+tax);
                    break;
                    
                case 3: 
                    // Impuesto al Valor Agregado
                    do {
                        option = printIVAMenu(input);

                        switch (option) {

                            case 1:
                                tax = calculateIVAYes(e, tax);
                                break;                    

                            case 2:
                                tax = calculateIVANo(e, tax);
                                break;

                            case 0:
                                System.out.println("Goodbye \n");
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Invalid option \n");
                                break;
                        }
                    } while (option != 2);
                    break;
                    
                case 0:
                    System.out.println("Goodbye \n");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid option \n");
                    break;
            }
        } while (option != 3);

    }

    public static float calculateCurrencyTax(Scanner e, float tax) {
        // Impuesto de Divisas
        System.out.println("Currency Tax Calculator");
        System.out.println("Please Enter The Value: ");
        float scanner1 = e.nextInt();
        if(scanner1 >0) {
            if(scanner1 <= 5000){
                float exce = (float) (scanner1 * 0.12);
                tax = scanner1 + exce; 
            }
        }
        if(scanner1 > 5000){
            if(scanner1 <= 100000000){
                tax = (float)(scanner1 + 1200);
            }
        }
        return tax;
    }

    public static float calculateIVANo(Scanner e, float tax) {
        System.out.println("Please Enter the Value to pay");
        float scanner1 = e.nextInt();
        tax = (float) scanner1 ;
        System.out.println("The Value to Pay is: "+tax);
        return tax;
    }

    public static int printIVAMenu(Scanner input) {
        int option;
        System.out.println("IVA Calculator");
        System.out.println("Wants you pay the IVA\n"
                + "1. Yes\n"
                + "2. No\n"
                + "0. Exit");
        System.out.println("Enter your menu option --> ");
        option = input.nextInt();
        return option;
    }

    public static float calculateIVAYes(Scanner e, float tax) {
        
        System.out.println("Please Enter the Value to pay");
        float scanner1 = e.nextInt();
        tax = (float) (scanner1 * 0.12) ;
        System.out.println("The Value to Pay is: "+tax);
        return tax;
    }

    public static float calculateIncomeTax(Scanner e, float tax) {
        float exce;
        float excePor;
        System.out.println("Income Tax Calculator");
        System.out.println("Please Enter a Value: ");
        float scanner1 = e.nextInt();
        float taxValue = 0.0f;
        if(scanner1 > 0 ){
            if(scanner1 <= 11290){
                tax = scanner1 - scanner1;
            }
        }
        if(scanner1 > 11290 ){
            if(scanner1 <= 14390 ){
                exce = scanner1 - 11290;
                excePor = (float) (exce * 0.05);
                tax = excePor;
            }
        }
        if(scanner1 > 14390 ){
            if(scanner1 <= 17990 ){
                exce = scanner1 - 14390;
                excePor = (float) (exce * 0.1);
                tax = excePor + 155;
            }
        }
        if(scanner1 > 17990 ){
            if(scanner1 <= 21600 ){
                exce = scanner1 - 17990;
                excePor = (float) (exce * 0.12);
                tax = excePor + 515;
            }
        }
        if(scanner1 > 21600 ){
            if(scanner1 <= 43190 ){
                exce = scanner1 - 21600;
                excePor = (float) (exce * 0.15);
                tax = excePor + 948;
            }
        }
        if(scanner1 > 43190 ){
            if(scanner1 <= 64770 ){
                exce = scanner1 - 43190;
                excePor = (float) (exce * 0.20);
                tax = excePor + 4187;
            }
        }
        if(scanner1 > 64770 ){
            if(scanner1 <= 86370 ){
                exce = scanner1 - 64770;
                excePor = (float) (exce * 0.25);
                tax = excePor + 8503;
            }
        }
        if(scanner1 > 86370 ){
            if(scanner1 <= 115140 ){
                exce = scanner1 - 86370;
                excePor = (float) (exce * 0.30);
                tax = excePor + 13903;
            }
        }
        if(scanner1 > 115140 ){
            if(scanner1 <= 1000000000 ){
                exce = scanner1 - 115140;
                excePor = (float) (exce * 0.35);
                tax = excePor + 22534;
            }
        }
        return tax;
    }

    public static int printTaxMenu(Scanner input) {
        int option;
        System.out.println("========== Kevin Andres Guairacaja ==========");
        System.out.println("Tax Calculator ");
        System.out.println("1. -> Income Tax");
        System.out.println("2. -> Currency Tax");
        System.out.println("3. -> Value Added Tax");
        System.out.println("0. -> Exit");
        System.out.println("Enter your menu option --> ");
        option = input.nextInt();
        return option;
    }

    
}
