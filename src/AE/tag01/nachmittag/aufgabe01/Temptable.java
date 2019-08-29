package AE.tag01.nachmittag.aufgabe01;

public class Temptable {
    public static void main(String[] args) {
        ausgabe(0,300,20);
    }

    private static void ausgabe(int startwert, int endwert, int schrittweite) {
        System.out.println("Fahrenheit\t|\t\tCelsius");
        for (int i = startwert; i <= endwert; i+=schrittweite) {
            System.out.printf("%d\t\t\t|\t\t%.2f\n",i, celsiusBerechnen(i));
        }
    }

    private static double celsiusBerechnen(int fahrenheit) {
        return  (5.0f / 9) * (fahrenheit - 32);

    }
}
