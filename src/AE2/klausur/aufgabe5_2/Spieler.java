package AE2.klausur.aufgabe5_2;

public class Spieler {
    private String name;
    private int punkte;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    public Spieler(String name, int punkte) {
        this.name = name;
        this.punkte = punkte;
    }
}
