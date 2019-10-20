package AE2.probeklausur;

public class Artikel {
    private String name;
    private float einzelpreis;
    private int anzahl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getEinzelpreis() {
        return einzelpreis;
    }

    public void setEinzelpreis(float einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public Artikel(String name, float einzelpreis, int anzahl) {
        setName(name);
        setEinzelpreis(einzelpreis);
        setAnzahl(anzahl);
    }
}
