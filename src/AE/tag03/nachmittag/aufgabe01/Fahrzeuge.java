package AE.tag03.nachmittag.aufgabe01;

public class Fahrzeuge {
    private double position;
    private int speed;
    public static final int MAXSPEED = 0;
    public static final int WHEELS = 0;

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed <= MAXSPEED ? speed : 0;
    }

    public Fahrzeuge(int position, int speed) {
        setPosition(position);
        setSpeed(speed);

    }

    public Fahrzeuge(){
        setPosition(0);
        setSpeed(0);
    }

    @Override
    public String toString() {
        return "Pos: " + getPosition() + " Geschw: " + getSpeed() + " Max: " + MAXSPEED + " Räder: " + WHEELS;
    }

    public void move (double minutes){
        if (minutes >= 0){
            setPosition(getPosition() + (getSpeed() / 60 * minutes));
        }
    }
}
