package AE2.klausur.aufgabe5_2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Spiel {
    private static ArrayList<Spieler> mitspieler = new ArrayList<>();
    private static ArrayList<Integer> genutzteZahlen = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        init(scanner);
        boolean neueRunde = true;
        do {
            runde(scanner);
            System.out.println("Neue Runde (Ja/Nein)? ");
            String input = scanner.nextLine();
            if (input.equals("Nein") || input.equals("N") || input.equals("n")) neueRunde= false;
        } while (neueRunde);
    }

    private static void runde(Scanner scanner) {
        boolean erraten = false;
        Random random = new Random();
        int zuErraten = random.nextInt(101);
        while (!erraten) {
            for (Spieler spieler : mitspieler) {
                System.out.println("Spieler " + spieler.getName());
                System.out.println("Ihre Zahl bitte:");
                int zahl = Integer.parseInt(scanner.nextLine());
                if (zahl == zuErraten) {
                    spieler.setPunkte(zahl);
                    erraten = true;
                } else {
                    spieler.setPunkte(spieler.getPunkte() - 1);
                    if (genutzteZahlen.contains(zahl)) {
                        spieler.setPunkte(spieler.getPunkte() - 1);
                    } else {
                        genutzteZahlen.add(zahl);
                    }
                }
                System.out.println("Punkte: " + spieler.getPunkte());
            }
        }
    }

    private static void init(Scanner scanner) {
        System.out.println("Willkommen zum lustigen Zahlenraten");
        boolean eingabe = true;
        while (eingabe) {
            System.out.println("Bitte den Namen eines Mitspielers eingeben:");
            String name = scanner.nextLine();
            mitspieler.add(new Spieler(name, 0));
            System.out.println("Noch ein Mitspieler (Ja/Nein)?");
            String nextSpieler = scanner.nextLine();
            if (nextSpieler.equals("Nein") || nextSpieler.equals("N") || nextSpieler.equals("n")){
                eingabe = false;
            }
        }
    }
}
