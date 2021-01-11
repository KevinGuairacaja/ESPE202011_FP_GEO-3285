/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.pkg1.pkgshort;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class Example1Short {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        // TODO code application logic here3
        
        Scanner sc = new Scanner(System.in);
        short radio;
        float area=3.1415f;
        
        System.out.println("Let’s calculate the area of a circle.\n"
                +"(The value of the radius should be "
                + "between (0 and 102))\n"
                +"Please enter the value of the radius: ");
        radio=sc.nextShort();
        
        area=area*radio*radio;
        
        System.out.println("The area of the circle is: " +area); 
        }
    }