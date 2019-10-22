package AE2.probeklausur;

import java.util.ArrayList;

public class Kassenbon {
    private String ladenName;
    private String strasse;
    private String plzOrt;
    private String telefonNr;
    private ArrayList<Artikel> liste;

    public Kassenbon(String ladenName, String strasse, String plzOrt, String telefonNr) {
        this.ladenName = ladenName;
        this.strasse = strasse;
        this.plzOrt = plzOrt;
        this.telefonNr = telefonNr;
        this.liste = new ArrayList<>();
    }

    public void ausgabe(){
        float summe = 0f;
        System.out.println("**************************");
        System.out.println(ladenName);
        System.out.println(strasse);
        System.out.println(plzOrt);
        System.out.println(telefonNr);
        System.out.println("**************************");
        System.out.println();
        for (Artikel artikel:liste) {
            System.out.println(artikel.getName());
            System.out.printf("%3dx%22.2f",artikel.getAnzahl(),artikel.getEinzelpreis());
            summe =+ (artikel.getEinzelpreis() * artikel.getAnzahl());
        }
        System.out.println();
        System.out.println("                     =====");
        System.out.printf("Summe EUR %16.2f%n",summe);
        System.out.println("                     =====");
    }

    public static void main(String[] args) {
        Kassenbon kassenbon = new Kassenbon("Hans Hüber Spirituosen", "Zum Schluckspecht 4", "12345 Musterdorf","0123 456789");
        kassenbon.liste.add(new Artikel("Jägermeister",5.55f,4));
        kassenbon.ausgabe();

    }
}
