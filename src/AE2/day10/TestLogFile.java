package AE2.day10;

import java.util.ArrayList;

public class TestLogFile {

    private static ArrayList<LogEntry> logEntries = new ArrayList<>();

    public static void parseLines(ArrayList<String> lines) {
        for (String line : lines) {
            logEntries.add(new LogEntry(line));
        }
    }


    public static void main(String[] args) {
        ArrayList<String> lines = ReadLogFile.readFile("C:\\data\\cclauncher.log");
        parseLines(lines);
        for (LogEntry entry : logEntries) {
            System.out.println(entry);
        }
        WriteLogFile.writeLog(logEntries,"C:\\data\\test.log");
    }
}
