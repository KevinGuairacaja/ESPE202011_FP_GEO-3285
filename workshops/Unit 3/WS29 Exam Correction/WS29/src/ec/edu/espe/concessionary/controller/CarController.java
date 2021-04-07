package ec.edu.espe.concessionary.controller;

import ec.edu.espe.concessionary.model.Car;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

public class Waterpump {

    public void save(Waterpump waterpump) {
        Chicken[] chickens = new waterpump[FileManager.countLines("waterpump")];
        String[] rows = new String[FileManager.countLines("waterpump")];
        read(rows, waterpump);
        if (find(waterpump, waterpump.getName()) != -1) {
            JOptionPane.showMessageDialog(null, "chicken -> " + chicken.getName() + " <- already exists", "USE OTHER NAME",JOptionPane.CANCEL_OPTION);
            return;
        } else {
            waterpump = new FrmWaterPump(txtName.getText(), txtLastName.getText(), txtModel.getText(), txtSerie.getText());
      
            FileManager.save(data, "chickens");
        }
    }

    public void read(String[] data, Chicken[] chickens) {

        FileManager.readLines("chickens", data);

        //accessing every line of the file through the FileManager.readLines() method
        for (int i = 0; i < data.length; i++) {

            //separating strings where a comma (,) is found
            String[] dataForChicken = data[i].split(",");

            //building an object with the splitted data
            String name = dataForChicken[0];
            String color = dataForChicken[1];
            int age = Integer.parseInt(dataForChicken[2]);
            boolean isMolting = Boolean.parseBoolean(dataForChicken[3]);

            waterpump = new FrmWaterPump(txtName.getText(), txtLastName.getText(), txtModel.getText(), txtSerie.getText());
      
        }
    }

    public int find(Waterpump[] waterpump, String name) {
        for (int i = 0; i < waterpump.length; i++) {
            if (name.equals(waterpump[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void populateChickensTable(JTable jTable, Waterpump[] waterpump) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        Object rowData[] = new Object[waterpump.length];
        for (int i = 0; i < waterpump.length; i++) {
            rowData[0] = waterpump[i].getName();
            rowData[1] = waterpump[i].getColor();
            rowData[2] = waterpump[i].getAge();
            rowData[3] = waterpump[i].isIsMolting();
            model.addRow(rowData);
        }

    }

}
