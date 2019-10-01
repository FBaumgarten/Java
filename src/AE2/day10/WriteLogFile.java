package AE2.day10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteLogFile {

    public static void  writeLog(ArrayList<LogEntry> logEntries, String filename){
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(filename);
            if (!file.exists()) file.createNewFile();
            FileWriter fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (LogEntry entry: logEntries) {
                bufferedWriter.write(entry.toString());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedWriter != null) bufferedWriter.close();
            } catch (IOException e) {
            }
        }

    }

    public static void writeLog2 (ArrayList<LogEntry> logEntries, String filename){
        //kein finaly block da BufferedWriter und Filewriter bestandteil des Try Objects sind und mit diesem automatisch zerstört werden
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))){  //Filewriter (filename, true) Boolean Flag für append to file
            for (LogEntry entry: logEntries) {
                writer.write(entry.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
