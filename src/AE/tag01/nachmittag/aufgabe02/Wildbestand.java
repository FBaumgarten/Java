package AE.tag01.nachmittag.aufgabe02;

public class Wildbestand {
    static int startbestand = 200;
    static double vermehrungsrate = 1.1f;
    static int abschussquote = 15;
    static int startjahr = 2019;
    static int limit = 300;

    public static void main(String[] args) {
        ausgabe();
    }

    private static void ausgabe(){
        System.out.println("Das Bestandslimit wird erreicht im Jahr "+berechnen());
    }

    public static int berechnen(){
        int bestand = startbestand;
        int jahr = startjahr;
        do {
            bestand = (int)(bestand * vermehrungsrate) - abschussquote;
            jahr++;
            System.out.println(bestand + " / " + jahr);
        } while (bestand<=limit);
        return jahr;
    }
}
