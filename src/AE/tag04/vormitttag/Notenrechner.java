package AE.tag04.vormitttag;

import java.util.ArrayList;
import java.util.Scanner;

public class Notenrechner {
    private static ArrayList<Pruefung> pruefungsListe = new ArrayList<>();


    private static double berechneDurchschnitt() {
        int summe = 0;
        for (Pruefung pruefung:pruefungsListe) summe += pruefung.getNote();
        return (double)summe / pruefungsListe.size();
    }

    private static void eingabe(Scanner scanner) {
        Pruefung pruefung = new Pruefung();
        System.out.print("Maximale Punktzahl der Prüfung: ");
        pruefung.setMaxPunkte(scanner.nextInt());
        System.out.print("Erreichte Punktzahl: ");
        pruefung.setErziehltePunkte(scanner.nextInt());
        //System.out.println("Note: " + pruefung.getNote());
        System.out.println(pruefung);
        if (pruefung.getMaxPunkte() >= 0 && pruefung.getErziehltePunkte() >= 0) pruefungsListe.add(pruefung);
        else System.out.println("Unzulässige Werteingabe!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("IHK Notenrechner");
        System.out.println("================");
        loop(scanner);
        System.out.println(pruefungsListe);
        System.out.println("Durchschnittsnote: " + berechneDurchschnitt());
        scanner.close();
    }

    private static void loop(Scanner scanner) {
        while (true){
            eingabe(scanner);
            System.out.println();
            System.out.print("Weitere Prüfung eingeben (J/N)?:");
            String abbruch = scanner.next();
            if (abbruch.equals("N") || abbruch.equals("n")) break;
        }
    }

}
