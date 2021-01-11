/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws04logicaloperators;

/**
 *
 * @author KEVIN
 */
public class WS04LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 19;
        if (x != 19) {
            System.out.println("x is equals to 19");
        } else {
            System.out.println("x is NOT equal to 19");
        }

        boolean y = x != 19;
        System.out.println("x != 19 --> " + (y));
        System.out.println("x == 19 --> " + (x == 19));
        System.out.println("x = 8 -->   " + (x = 8));
        System.out.println("x > 8 -->  " + (x > 8));
        System.out.println("x >= 8 --> " + (x >= 8));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 19;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 8;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

        System.out.println("-------------------------------------------------");
        System.out.println("Kevin Guairacaja (19) ODD Number (&&)");
        
        boolean p;
        boolean q;

        p = true;
        q = true;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p && q));
        
        p = true;
        q = false;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p && q));
        
        p = false;
        q = true;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p && q));
        
        p = false;
        q = false;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p && q));
               
    }
    
}
