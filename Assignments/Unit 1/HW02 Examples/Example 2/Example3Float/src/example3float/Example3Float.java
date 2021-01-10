/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example3float;
import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class Example3Float {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float radio;
        float area=4.18879f;
        
        System.out.println("Let’s calculate the volume of a sphere.\n" +
                "Please enter the value of the radius: ");
        radio=sc.nextFloat();
        
        area=area*radio*radio*radio;
        
        System.out.println("The volume of the sphere is: " +area);
    }
}
