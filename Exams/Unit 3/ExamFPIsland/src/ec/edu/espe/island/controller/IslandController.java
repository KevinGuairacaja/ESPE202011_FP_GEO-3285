package ec.edu.espe.island.controller;

import ec.edu.espe.island.model.Island;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

public class IslandController {

    public static void save(Island island){
        String data = island.getName()+"; "+island.getOcean()+"; "+island.getSize()
                +"; "+island.getKind()+"; "+island.getNumberOfInhabitants()+".";
        FileManager.save(data, "Islands");
    }
    
    public static void read(String[] data, Island[] islands) {

        FileManager.readLines("islands", data);

        //accessing every line of the file through the FileManager.readLines() method
        for (int i = 0; i < data.length; i++) {

            //separating strings where a comma (,) is found
            String[] dataForIsland = data[i].split(",");

            //building an object with the splitted data
            String name = dataForIsland[0];
            String ocean = dataForIsland[1];
            int size = Integer.parseInt(dataForIsland[2]);
            String kind = dataForIsland[3];
            int numberOfInhabitants = Integer.parseInt(dataForIsland[4]);

            islands[i] = new Island(name, ocean, size, kind, numberOfInhabitants);
        }
    }

    public int find(Island[] islands, String name) {
        for (int i = 0; i < islands.length; i++) {
            if (name.equals(islands[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public static void populateIslandsTable(JTable jTable, Island[] islands) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        Object rowData[] = new Object[islands.length];
        for (int i = 0; i < islands.length; i++) {
            rowData[0] = islands[i].getName();
            rowData[1] = islands[i].getOcean();
            rowData[2] = islands[i].getSize();
            rowData[3] = islands[i].getKind();
            rowData[4] = islands[i].getNumberOfInhabitants();
            model.addRow(rowData);
        }

    }
           
    public String readTxt(String direction){
        String text = "";
        try{ 
            BufferedReader bf = new BufferedReader(new FileReader(direction));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead + "\n";
            }
           text = temp;
            
        }catch(Exception e){
            System.out.println("");
        }
    return text;
    }
}
