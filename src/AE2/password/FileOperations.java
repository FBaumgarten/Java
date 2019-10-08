package AE2.password;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FileOperations {
    public static void writeString (String stringToWrite, String filename){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))){
            String date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
            writer.write(date + ";" + stringToWrite);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile (ArrayList<String> stringArrayList, String filename){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, false))){
            for (String stringToWrite:stringArrayList) {
                writer.write(stringToWrite);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> readFile(String filename) {
        ArrayList<String> lines = new ArrayList<>();

        File file = new File(filename);
        if (!file.canRead() || !file.isFile()) System.exit(0);

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = null;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) try {
                reader.close();
            } catch (IOException e) {
            }
        }
        return lines;
    }
}
