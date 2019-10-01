package AE2.day10;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.regex.Matcher;
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
        String line = lineToParse;
//        String[] split = line.split(Pattern.quote(" - "));
//        setMessage(split[1]);
//        setProcess(line.substring(line.indexOf("[")+1,line.indexOf("]")));
//        setClazz(split[0].substring(line.indexOf("]")+2));
//        setDate(line.substring(0,10));
//        setTime(line.substring(11,23));
//        setType(line.substring(24,line.indexOf(" ",24)));
        String regex = "(\\d{4}-\\d{2}-\\d{2}) (\\d{2}:\\d{2}:\\d{2},\\d{3}) (.*) {2}\\[(.*)] (.*\\(.*\\)) - (.*)";
        String result = line.replaceAll(regex, "$1;$2;$3;$4;$5;$6");
        String[] strings = result.split(Pattern.quote(";"));
        setDate     (strings[0]);
        setTime     (strings[1]);
        setType     (strings[2]);
        setProcess  (strings[3]);
        setClazz    (strings[4]);
        setMessage  (strings[5]);
    }

    @Override
    public String toString() {
        return getDate() + ";"
                + getTime() + ";"
                + getType() + ";"
                + getProcess() + ";"
                + getClazz() + ";"
                + getMessage();
    }
}
