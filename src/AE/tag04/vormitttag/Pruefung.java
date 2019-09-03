package AE.tag04.vormitttag;

public class Pruefung {
    private int maxPunkte;
    private int erziehltePunkte;

    Pruefung() {
        setMaxPunkte(0);
        setErziehltePunkte(0);
    }

    int getMaxPunkte() {
        return maxPunkte;
    }

    void setMaxPunkte(int maxPunkte) {
        if (maxPunkte <= 100 && maxPunkte > 0){
            this.maxPunkte = maxPunkte;
        } else {
            this.maxPunkte = -1;
        }
    }

    @Override
    public String toString() {
        return "Pruefung{" +
                "maxPunkte=" + maxPunkte +
                ", erziehltePunkte=" + erziehltePunkte +
                ", prozent=" + berechnePunkte() +
                ", note=" + getNote() +
                '}';
    }

    int getErziehltePunkte() {
        return erziehltePunkte;
    }

    void setErziehltePunkte(int erziehltePunkte) {
        if (erziehltePunkte <= getMaxPunkte()){
            this.erziehltePunkte = erziehltePunkte;
        } else {
            this.erziehltePunkte = -1;
        }
    }

    private double berechnePunkte(){
        return 100.0f / maxPunkte * erziehltePunkte;
    }

    int getNote(){
        double punkte = this.berechnePunkte();
        if (punkte <= 29)return 6;
        else if (punkte <= 49) return 5;
        else if (punkte <= 66) return 4;
        else if (punkte <= 80) return 3;
        else if (punkte <= 91) return 2;
        else if (punkte <= 100) return 1;
        else return 0;
    }

}
