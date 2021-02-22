package ws13.task;

import java.util.Scanner;

public class WS13Task {

    public static void main(String[] args) {
        System.out.println("================= Kevin Andres Guairacaja =================");
        System.out.println("==================== Physics Formula ======================");
        
        System.out.println("Lets calculate the Period ");
        // T = 2pi/W
        calculatePeriod();
        
        System.out.println("\nLets calculate the Final Velocity ");
        // Vf^2 = Vo^2+2ad
        calculateFinalVelocity();
        
        System.out.println("\nLets calculate the Module of Aceleration ");
        // a^2 = an^2 + at^2
        // an = V^2/Ro
        calculateModuleofAceleration();
        System.out.println("\n================ Area of Geometric Figures ================");
        
        System.out.println("Lets Calculate the Area of Cube");
        // A=6a^2
        calculateAreaOfCube();
        
        System.out.println("\nLets Calculate the Area of Sphere");
        // A=4*PI*RADIO^2
        calculateAreaOfSphere();
        
        System.out.println("\nLets Calculate the Area of Cone");
        // A=PI*RADIO^2+PI*RADIO*ALTURA INCLINADA
        calculateAreaOfCone();
        
    }

    public static void calculateAreaOfCone() {
        
    }

    public static void calculateAreaOfSphere() {
        float radio;
        float area;
        Scanner e = new Scanner(System.in);
        System.out.println("Enter radius value -> ");
        radio = e.nextFloat();                           
        area = (float)(4*3.14*radio*radio);
        System.out.println("The area is: \n" + area);
    }

    public static void calculateAreaOfCube() {
        float multiplicand=6;
        float multiplier;
        float area;
        Scanner e = new Scanner(System.in);
        System.out.println("Enter side value -> ");
        multiplier = e.nextFloat(); 
        area = multiplicand * multiplier * multiplier;
        System.out.println("The area is: \n" + area);
    }

    public static void calculateModuleofAceleration() {
        Scanner e = new Scanner(System.in);
        System.out.println("Please enter the value of the Tangential Aceleration");
        float scanner1 = e.nextFloat();
        System.out.println("Lets calculate the Normal Aceleration ");
        System.out.println("Please enter the value of the Velocity");
        float scanner2 = e.nextFloat();
        System.out.println("Please enter the value of the Radius or Ro");
        float scanner3 = e.nextFloat();
        float aceleration;
        float tangencialAceleration = scanner1;
        float normalAceleration = 0.0f;
        float  velocity = scanner2;
        float  radius = scanner3;
        normalAceleration = (velocity*velocity)/radius;
        System.out.println("The value to Normal Aceleration is: "+normalAceleration);
        aceleration =(float) Math.sqrt((scanner1*scanner1)+(normalAceleration*normalAceleration));
        System.out.println("Then");
        System.out.println("The Module of Aceleration is: "+aceleration);
    }

    public static void calculateFinalVelocity() {
        Scanner e = new Scanner(System.in);
        System.out.println("Please enter the value of the Initial Velocity");
        float scanner1 = e.nextFloat();
        System.out.println("Please enter the value of the Aceleration");
        float scanner2 = e.nextFloat();
        System.out.println("Please enter the value of the Distance");
        float scanner3 = e.nextFloat();
        float finalVelocity = 0.0f;
        float  initialVelocity = scanner1;
        float  aceleration = scanner2;
        float  distance = scanner3;
        finalVelocity = (float) Math.sqrt((initialVelocity*initialVelocity)+2*aceleration*
                distance);
        System.out.println("The value to the Final Velocity is: "+finalVelocity);
    }

    public static void calculatePeriod() {
        Scanner e = new Scanner(System.in);
        System.out.println("Please enter the value of the Angular Velocity");
        float scanner1 = e.nextFloat();
        float period = 0.0f;
        float number = scanner1;
        period = (float) (2*Math.PI)/scanner1;
        System.out.println("The value to Period is: "+period);
    }

}
