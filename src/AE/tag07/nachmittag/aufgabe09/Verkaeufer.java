package AE.tag07.nachmittag.aufgabe09;

public class Verkaeufer implements MitarbeiterInterface {
    String name;
    int personalNr;
    double fixgehalt;
    double umsatz;
    double provision;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPersonalNr() {
        return personalNr;
    }

    @Override
    public double getMonatsLohn() {
        return fixgehalt + umsatz * provision / 100;
    }

    public Verkaeufer() {
        this.name = "";
        this.personalNr = 0;
        this.fixgehalt = 0.0f;
        this.umsatz = 0.0f;
        this.provision = 0.0f;
    }

    public Verkaeufer(String name, int personalNr, double fixgehalt, double umsatz, double provision) {
        this.name = name;
        this.personalNr = personalNr;
        this.fixgehalt = fixgehalt;
        this.umsatz = umsatz;
        this.provision = provision;
    }
}
