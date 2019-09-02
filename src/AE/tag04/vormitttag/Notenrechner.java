package AE.tag04.vormitttag;

import java.util.ArrayList;
import java.util.Scanner;

public class Notenrechner {
    private static ArrayList<Pruefung> pruefungsListe = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("IHK Notenrechner:");
        while (true){
            eingabe(scanner);
            System.out.println();
            System.out.print("Weitere Prüfung eingeben (J/N)?:");
            String abbruch = scanner.next().toString();
            if (abbruch.equals("N") || abbruch.equals("n")) break;
        }
        System.out.println("Durchschnittsnote: " + berechneDurchschnitt());
    }

    private static double berechneDurchschnitt() {
        int summe = 0;
        int anzahl = 0;
        for (Pruefung pruefung:pruefungsListe) {
            summe += pruefung.getNote();
            anzahl ++;
        }
        return (double)summe / anzahl;
    }

    private static void eingabe(Scanner scanner) {
        Pruefung pruefung = new Pruefung();
        System.out.print("Maximale Punktzahl der Prüfung: ");
        pruefung.setMaxPunkte(scanner.nextInt());
        System.out.print("Erreichte Punktzahl: ");
        pruefung.setErziehltePunkte(scanner.nextInt());
        System.out.println("Note: " + pruefung.getNote());
        pruefungsListe.add(pruefung);
    }


}
