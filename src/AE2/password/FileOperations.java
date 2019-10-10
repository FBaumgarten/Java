package AE2.password;

import java.io.*;
import java.util.ArrayList;

public class FileOperations {

    public static void writeFile (ArrayList<String> stringArrayList, File filename){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, false))){
            for (String stringToWrite:stringArrayList) {
                writer.write(stringToWrite);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> readFile(File file) {
        ArrayList<String> lines = new ArrayList<>();

        if (!file.canRead() || !file.isFile()) System.exit(0);

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
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
