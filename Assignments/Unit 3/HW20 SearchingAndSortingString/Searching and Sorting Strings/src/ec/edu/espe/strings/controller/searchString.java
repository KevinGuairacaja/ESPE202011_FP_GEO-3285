package ec.edu.espe.strings.controller;

public class searchString {
    public int findFriend(int[] elements, int x){
        int i;
        int n = elements.length;
        for(i = 0; i < n; i++){
            if(elements[i] == x){
            return 1;   
            }
        }
        return -1;
    }
}
