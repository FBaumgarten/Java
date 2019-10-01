package AE2.comcave.inventar;

abstract class Personal extends Resource{
    String nachname;
    String vorname;
    String geburtsag;

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getGeburtsag() {
        return geburtsag;
    }

    public void setGeburtsag(String geburtsag) {
        this.geburtsag = geburtsag;
    }
}
