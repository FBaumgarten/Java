package AE2.day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteToFile {
    public static void writeString (String stringToWrite, String filename){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))){
                String date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
                writer.write(date + ";" + stringToWrite);
                writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
