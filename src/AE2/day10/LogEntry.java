package AE2.day10;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.regex.Pattern;

public class LogEntry {
    private String date, time, type, process, clazz, message;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogEntry(String date, String time, String type, String process, String clazz, String message) {
        setDate(date);
        setTime(time);
        setType(type);
        setProcess(process);
        setClazz(clazz);
        setMessage(message);
    }

    public LogEntry() {
        this(null,null,null,null,null,null);
    }

    public LogEntry(String lineToParse){
        parseString(lineToParse);
    }

    public void parseString(String lineToParse){
        String[] split1 = lineToParse.split(Pattern.quote(" - "));
        setMessage(split1[1]);
        String[] split2 = split1[0].split(Pattern.quote("  "));
        String[] split3 = split2[0].split(Pattern.quote(" "));
        String[] split4 = split2[1].split(Pattern.quote(" "));
        setDate(split3[0]);
        setTime(split3[1]);
        setType(split3[2]);
        setProcess(split4[0]);
        setClazz(split4[1] + " " + split4[2]);
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", type='" + type + '\'' +
                ", process='" + process + '\'' +
                ", clazz='" + clazz + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
