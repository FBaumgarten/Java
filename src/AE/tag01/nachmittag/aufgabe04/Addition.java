package AE.tag01.nachmittag.aufgabe04;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        //addierenMitWhile();
        addierenMitDo();
    }


    private static void addierenMitWhile() {
        int zahl = 0;
        int eingabe = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl eingeben (negtiv für Abbruch):");

        while (eingabe >= 0) {
            eingabe = scanner.nextInt();
            if (eingabe<0) break;
            zahl += eingabe;
        }
        System.out.println(zahl);
    }

    private static void addierenMitDo() {
        int zahl = 0;
        int eingabe = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zahl eingeben (negtiv für Abbruch):");

        do {
            eingabe = scanner.nextInt();
            zahl += eingabe;
        } while (eingabe >= 0);
        System.out.println(zahl);
    }

}
