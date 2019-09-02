package AE.tag03.nachmittag.aufgabe01;

public class Wettrennen {
    public static void main(String[] args) {
        Fahrrad fahrrad = new Fahrrad();
        Auto auto = new Auto();
        Rennwagen rennwagen = new Rennwagen();
        Krankenwagen krankenwagen = new Krankenwagen();
        fahrrad.setSpeed(20);
        auto.setSpeed(150);
        rennwagen.setSpeed(200);
        krankenwagen.setSpeed(80);
        System.out.println(fahrrad);
        System.out.println(auto);
        System.out.println(rennwagen);
        System.out.println(krankenwagen);
    }
}
