package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static boolean createFile(String fileName){
        boolean created = false;
        try {
            File file = new File(fileName + ".txt");
            if(file.createNewFile()){
                System.out.println("File was created");
                created = true;
            } else{
                System.out.println("File already axists");
                created = false;
            }
        } catch (IOException ex){
            ex.printStackTrace();
            created = false;
        }
        return created;
    }
    
    public static boolean save(String data, String fileName){
        boolean saved = false;
        createFile(fileName);
        
        try {
            FileWriter myWrite = new FileWriter(fileName + ".txt", true);
            myWrite.write(System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("A new record of " +fileName+ " was saved.");
            saved = true;
        } catch (IOException ex){
            ex.printStackTrace();;
            saved = false;
        }
        return saved;
    }
    public static String read(String fileName){
        return "WorkShop";
    }
    
}
