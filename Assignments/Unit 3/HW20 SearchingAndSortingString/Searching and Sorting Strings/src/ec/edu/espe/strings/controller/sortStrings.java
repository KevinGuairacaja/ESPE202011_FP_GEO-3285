package ec.edu.espe.strings.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sortStrings {

    private String vector[];
    public  sortStrings(String vector[]){
        this.vector = vector;
    }
    public void sorting(){
        for(int i = 0; i<vector.length; i++){
            for(int j=0;j<vector.length && i != j; j++){
                if(vector[i].compareToIgnoreCase(vector[j])>0){
                    String aux = vector[i];
                    vector[i]=vector[j];
                    vector[j]=aux;
                }
            }
        }
    }
    public void show(){
        for(String a: vector){
            System.out.println(a);
        }
    }
}
