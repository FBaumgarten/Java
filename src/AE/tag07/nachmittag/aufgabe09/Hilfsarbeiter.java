package AE.tag07.nachmittag.aufgabe09;

public class Hilfsarbeiter extends Mitarbeiter {
    double stundenlohn;
    double anzahlStunden;
    double ueberstundenzuschlag;
    double anzahlUeberstunden;

    public double getMonatsLohn() {
        return stundenlohn * anzahlStunden + ueberstundenzuschlag * anzahlUeberstunden;
    }

    public Hilfsarbeiter() {
        super();
        this.stundenlohn = 0.0f;
        this.anzahlStunden = .0;
        this.ueberstundenzuschlag = .0;
        this.anzahlUeberstunden = .0;
    }

    public Hilfsarbeiter(int personalNr, String name, String datumEintritt,
                         double stundenlohn, double anzahlStunden, double ueberstundenzuschlag, double anzahlUeberstunden) {
        super(personalNr, name, datumEintritt);
        this.stundenlohn = stundenlohn;
        this.anzahlStunden = anzahlStunden;
        this.ueberstundenzuschlag = ueberstundenzuschlag;
        this.anzahlUeberstunden = anzahlUeberstunden;
    }
}

