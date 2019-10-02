package AE2.day13;

import java.util.Scanner;

public class ConsoleApp {
    public StandortVerwaltung standorte;

    public ConsoleApp() {
        standorte = new StandortVerwaltung();
    }

    public static void printMenu(){
        System.out.println("Standortverwaltun:");
        System.out.println("-------------------------");
        System.out.println("(S)tandortliste");
        System.out.println("Standort (h)inzufügen");
        System.out.println("Standort (b)earbeiten");
        System.out.println("Standort (l)öschen");
        System.out.println("Programm b(e)enden");
    }

    public void loop() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            String auswahl = scanner.nextLine().toLowerCase();
            if (auswahl.equals("s")) printStandorte();
            else if (auswahl.equals("h")) addStandort(scanner);
            else if (auswahl.equals("b")) editStandort(scanner);
            else if (auswahl.equals("l")) deleteStandort(scanner);
            else if (auswahl.equals("e")) break;
            else System.out.println("Ungültige Auswahl");
        }
        scanner.close();
    }

    public  void printStandorte(){
        for (Standort standort:standorte.getStandorte()) {
            System.out.println(standort);
        }
    }

    public  void addStandort(Scanner scanner){
        System.out.print("Standortbezeichnung: ");
        String input = scanner.nextLine();
        standorte.addStandort(input);
    }

    public void deleteStandort(Scanner scanner){
        System.out.print("Standortbezeichnug: ");
        String input = scanner.nextLine();
        System.out.println(standorte.deleteStandort(input) + " Standorte gelöscht.");
    }

    public void editStandort(Scanner scanner){
        System.out.print("Standortbezeichnung: ");
        String input = scanner.nextLine();
        Standort standort = standorte.getStandort(input);
        if (standort == null) System.out.println("Kein Standort mit dieser Bezeichnung vorhanden.");
        else {
            System.out.print("Neue Bezeichnung: ");
            standort.setBezeichnung(scanner.nextLine());
        }
    }

}
