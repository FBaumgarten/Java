package AE.tag07.nachmittag.aufgabe09;

public abstract class Mitarbeiter {
    int personalNr;
    String name;
    String datumEintritt;
    double anzahlStunden;
    double anzahlUeberstunden;

    public String getName() {
        return name;
    }

    public int getPersonalNr() {
        return personalNr;
    }

    public abstract double getMonatsLohn();

    public Mitarbeiter() {
        this.personalNr = 0;
        this.name = "";
        this.datumEintritt = "";
        this.anzahlStunden = .0;
        this.anzahlUeberstunden = .0;
    }

    public Mitarbeiter(int personalNr, String name, String datumEintritt, double anzahlStunden, double anzahlUeberstunden) {
        this.personalNr = personalNr;
        this.name = name;
        this.datumEintritt = datumEintritt;
        this.anzahlStunden = anzahlStunden;
        this.anzahlUeberstunden = anzahlUeberstunden;
    }
}
