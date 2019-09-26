package AE2.day10;

import java.util.ArrayList;

public class ReadLogFile {

    private static ArrayList<LogEntry> logEntries = new ArrayList<>();

    public static void parseLines(ArrayList<String> lines) {
        for (String line : lines) {
            logEntries.add(new LogEntry(line));
        }
    }


    public static void main(String[] args) {
        ArrayList<String> lines = ReadFileLines.readFile("C:\\Users\\Fronk\\Google Drive (fbau116@gmail.com)\\Anwendungsentwicklung\\cclauncher.log");
        parseLines(lines);
        for (LogEntry entry : logEntries) {
            System.out.println(entry);
        }
    }
}
