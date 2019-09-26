package AE2.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileLines {

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
