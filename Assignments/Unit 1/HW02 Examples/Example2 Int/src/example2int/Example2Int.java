/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2int;
import java.util.Scanner;

public class Example2Int {
 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int radio;
        int area=3;
        
        System.out.println("Let’s calculate the area of a circle.\n" +
                "(Remember that we will use the "
                + "value of pi=3)\n"+"(The value of the radius should be "
                + "between (0 and 26750))\n"+"Please enter "
                + "the value of the radius: ");
        radio=sc.nextInt();
        
        area=area*radio*radio;
        
        System.out.println("The area of the circle is: " +area);        
    }
}
