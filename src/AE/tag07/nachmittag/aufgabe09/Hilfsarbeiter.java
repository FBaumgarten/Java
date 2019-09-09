package AE.tag07.nachmittag.aufgabe09;

public class Hilfsarbeiter extends Mitarbeiter {
    double stundenlohn;
    double ueberstundenzuschlag;

    @Override
    public double getMonatsLohn() {
        return stundenlohn * anzahlStunden + ueberstundenzuschlag * anzahlUeberstunden;
    }

    public Hilfsarbeiter() {
        super();
        this.stundenlohn = 0.0f;
        this.ueberstundenzuschlag = .0;
    }

    public Hilfsarbeiter(int personalNr, String name, String datumEintritt,
                         double stundenlohn, double anzahlStunden, double ueberstundenzuschlag, double anzahlUeberstunden) {
        super(personalNr, name, datumEintritt, anzahlStunden, anzahlUeberstunden);
        this.stundenlohn = stundenlohn;
        this.ueberstundenzuschlag = ueberstundenzuschlag;
    }
}

