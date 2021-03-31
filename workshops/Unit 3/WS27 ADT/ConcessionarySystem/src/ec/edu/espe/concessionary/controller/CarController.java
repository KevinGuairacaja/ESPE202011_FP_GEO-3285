package ec.edu.espe.concessionary.controller;

import ec.edu.espe.concessionary.model.Car;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

public class CarController {

    public void save(Car car){
        String data = car.getName()+"; "+car.getPlateNumber()+"; "+car.getNumberOfDoors()
                +"; "+car.getNumberOfPassengers()+"; "+car.getRingSize()+".";
        FileManager.save(data, "Cars");
    }
    
    public static void read(String[] data, Car[] cars) {

        FileManager.readLines("cars", data);

        //accessing every line of the file through the FileManager.readLines() method
        for (int i = 0; i < data.length; i++) {

            //separating strings where a comma (,) is found
            String[] dataForCar = data[i].split(",");

            //building an object with the splitted data
            String brand = dataForCar[0];
            int ringSize = Integer.parseInt(dataForCar[1]);
            int numberOfDoors = Integer.parseInt(dataForCar[2]);
            int numberOfPassengers = Integer.parseInt(dataForCar[3]);
            String plateNumber = dataForCar[4];

            cars[i] = new Car(brand, ringSize, numberOfDoors, numberOfPassengers, plateNumber);
        }
    }

    public int find(Car[] cars, String brand) {
        for (int i = 0; i < cars.length; i++) {
            if (brand.equals(cars[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public static void populateCarsTable(JTable jTable, Car[] cars) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        Object rowData[] = new Object[cars.length];
        for (int i = 0; i < cars.length; i++) {
            rowData[0] = cars[i].getName();
            rowData[1] = cars[i].getRingSize();
            rowData[2] = cars[i].getNumberOfDoors();
            rowData[3] = cars[i].getNumberOfPassengers();
            rowData[4] = cars[i].getPlateNumber();
            model.addRow(rowData);
        }

    }
           
    public String readTxt(String direction){
        String text = "";
        try{ 
            BufferedReader bf = new BufferedReader(new FileReader(direction));
            String temp = "";
            String line = "\n";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead + line;
            }
           text = temp;
            
        }catch(Exception e){
            System.out.println("");
        }
    return text;
    }
}