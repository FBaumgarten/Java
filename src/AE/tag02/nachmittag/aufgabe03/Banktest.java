package AE.tag02.nachmittag.aufgabe03;

public class Banktest {
    public static void main(String[] args) {
        Bankkonto konto1 = new Bankkonto("Max", "Mustermann", 1500.01, 200);
        System.out.println(konto1);
        konto1.einzahlung(500);
        System.out.println(konto1);
    }
}
