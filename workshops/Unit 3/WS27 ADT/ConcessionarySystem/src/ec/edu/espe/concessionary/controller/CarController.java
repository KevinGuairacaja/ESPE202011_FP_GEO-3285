package ec.edu.espe.concessionary.controller;

import ec.edu.espe.concessionary.model.Car;
import java.io.BufferedReader;
import java.io.FileReader;
import utils.FileManager;

public class CarController {

    public void save(Car car){
        String data = car.getName()+", "+car.getPlateNumber()+", "+car.getNumberOfDoors()
                +", "+car.getNumberOfPassengers()+", "+car.getRingSize()+"; ";
        FileManager.save(data, "Cars");
    }
    
    public String readTxt(String direction){
        String text = "";
        try{ 
            BufferedReader bf = new BufferedReader(new FileReader(direction));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }
           text = temp;
            
        }catch(Exception e){
            System.out.println("");
        }
    return text;
    }
    
}
