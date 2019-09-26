package AE2.day06.extra;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Trigger {
    private Duration time; //in milliseconds
    private String description;

    public Duration getTime() {
        return time;
    }

    public void setTime(Duration time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Trigger(Duration time, String description) {
        setTime(time);
        setDescription(description);
    }

    public Trigger(){
        this(Duration.ZERO, "");
    }

    @Override
    public String toString() {
        return "Trigger{" +
                "time=" + time +
                ", description='" + description + '\'' +
                '}';
    }
}


