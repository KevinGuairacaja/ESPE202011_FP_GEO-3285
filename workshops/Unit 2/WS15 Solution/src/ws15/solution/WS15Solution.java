package ws15.solution;

import java.util.Scanner;

public class WS15Solution {

    public static void main(String[] args) {
        
        System.out.println("============= Kevin Andres Guairacaja =============");
        int totalOfPlayers=0;
        String[] players;
        float[] goalAverages;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please Enter the amount of players you want to record: ");
        totalOfPlayers = scanner.nextInt();
        
        players = new String[totalOfPlayers];
        goalAverages = new float[totalOfPlayers];
        
        
        for(int i = 0; i < totalOfPlayers; i++){
            scanner.nextLine();
            System.out.println("Please Enter the name of player #: " + i );
            players[i]=scanner.nextLine();
            System.out.println("Please Enter " +players[i]+ " goals average: ");
            goalAverages[i] = scanner.nextFloat();
        }
        
        for(int i = 0; i < totalOfPlayers; i++){
            System.out.println(players[i]+ " -> \t" +goalAverages[i]);
            
        }  
      
    }
    
}
