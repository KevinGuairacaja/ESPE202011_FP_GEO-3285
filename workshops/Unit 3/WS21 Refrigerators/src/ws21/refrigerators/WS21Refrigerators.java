package ws21.refrigerators;

import java.util.Scanner;

public class WS21Refrigerators {

    public static void main(String[] args) {

        System.out.println("======== Author: Kevin Andres Guairacaja =======");
        
        int temperatura;
        int waterAmount;
        float time;
        int power;
        int hours;
        int daysUse;
        float monthlyConsumption;
        
        System.out.println("\n1) Time to make ice");
        Scanner e = new Scanner(System.in);
        System.out.println("Enter the value of your refrigerator temperature[°C]: ");
        temperatura = e.nextInt();
        System.out.println("Enter the amount of water to freeze[Liters]: ");
        waterAmount = e.nextInt();
        time = calculateTimeToMakeIce(waterAmount, temperatura);
        System.out.println("The time it takes for your refrigerator to make ice is: \n"
        +time+ " hours");
        
        System.out.println("\n2) Time to make ice");
        System.out.println("Enter the value of your refrigerator power[W]: ");
        power = e.nextInt();
        System.out.println("Enter the number of hours you use per day: ");
        hours = e.nextInt();
        System.out.println("Enter the number of days you use per months: ");
        daysUse = e.nextInt();
        monthlyConsumption = calculateMonthlyConsumption(power, hours, daysUse) ;
        System.out.println("The monthly consumption per month will be: \n"
        +monthlyConsumption+ " KwH/M");

        
    }

    public static float calculateMonthlyConsumption(int power, int hours, int daysUse) {
        float monthlyConsumption;
        monthlyConsumption = (power * hours * daysUse)*(0.001f);
        return monthlyConsumption;
    }

    public static float calculateTimeToMakeIce(int waterAmount, int temperatura) {
        float time;
        time = waterAmount / temperatura;
        return time;
    }
}