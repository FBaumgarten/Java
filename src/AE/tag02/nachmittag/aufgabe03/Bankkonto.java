package AE.tag02.nachmittag.aufgabe03;

public class Bankkonto {
    private String vorname, nachname;
    private double kontostand, dispo;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public double getDispo() {
        return dispo;
    }

    public void setDispo(double dispo) {
        this.dispo = dispo;
    }

    public Bankkonto(String vorname, String nachname, double kontostand, double dispo) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kontostand = kontostand;
        this.dispo = dispo;
    }

    @Override
    public String toString() {
        return "Kontoinhaber: "+getVorname()+" "+getNachname() +"\nKontostand: "+getKontostand()+"\nDispo:\t"+getDispo();
    }

    public void einzahlung(double betrag){
        setKontostand(getKontostand()+betrag);
    }

    public boolean auszahlung (double betrag){
        if (betrag<=getKontostand()+getDispo()) {
            einzahlung(betrag * -1);
            return true;
        } else {
            return false;
        }
    }
}
