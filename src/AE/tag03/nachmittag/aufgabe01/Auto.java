package AE.tag03.nachmittag.aufgabe01;

public class Auto extends Fahrzeuge {
    private int maxSpeed = 140;
    private int wheels = 4;

    public Auto(int position, int speed) {
        super(position, speed);
    }

    public Auto() {
        super();
    }
}
