package quiz.pkg01;

import java.util.Scanner;

public class Quiz01 {

    public static void main(String[] args) {
        
        System.out.println("============ Kevin Andres Guairacaja ============\n");
        int[] porcentageCandidate;
        String[] candidate = {"1. Andres Arauz", "2. Guillermo Lasso", "3. Yaku Perez"};
        Scanner input = new Scanner(System.in);
        int information;
        System.out.println("Enter the number of candidates -> ");
        information = input.nextInt();

        porcentageCandidate = new int[information];
       
        for (int i = 0; i < information; i++) {
            System.out.print("Enter the porcentage of the candidate " + (i + 1) + " -> ");
            porcentageCandidate[i] = input.nextInt();
        }
        
        for (String name : candidate) {
            System.out.println("Candidate Name -> " + name);
        }

        
        for (int i = 0; i < information; i++) {
            System.out.println("The porcentage of the Candidate is  " + (i + 1) + " -> " + porcentageCandidate[i]);
        }
        System.out.println("==========================================================================");
        System.out.println("============= Kevin Andres Guairacaja =============");
        int totalOfCandidates=0;
        String[] Candidates;
        float[] porcentageOfCandidate;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please Enter the amount of Candidate you want to record: ");
        totalOfCandidates = scanner.nextInt();
        
        Candidates = new String[totalOfCandidates];
        porcentageOfCandidate = new float[totalOfCandidates];
        
        
        for(int i = 0; i < totalOfCandidates; i++){
            scanner.nextLine();
            System.out.println("Please Enter the name of the Candidate: " + i );
            Candidates[i]=scanner.nextLine();
            System.out.println("Please Enter " +Candidates[i]+ " porcentage %: ");
            porcentageOfCandidate[i] = scanner.nextFloat();
        }
        
        for(int i = 0; i < totalOfCandidates; i++){
            System.out.println(Candidates[i]+ " -> \t" +porcentageOfCandidate[i]);
            
        } 
    }
    
}
