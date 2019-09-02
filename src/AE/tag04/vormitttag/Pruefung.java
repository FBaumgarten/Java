package AE.tag04.vormitttag;

import java.util.Scanner;

public class Pruefung {
    private int maxPunkte;
    private int erziehltePunkte;

    public Pruefung(int maxPunkte, int erziehltePunkte) {
        setMaxPunkte(maxPunkte);
        setErziehltePunkte(erziehltePunkte);
    }

    public Pruefung() {
        setMaxPunkte(0);
        setErziehltePunkte(0);
    }

    public int getMaxPunkte() {
        return maxPunkte;
    }

    public void setMaxPunkte(int maxPunkte) {
        if (maxPunkte <= 100){
            this.maxPunkte = maxPunkte;
        } else {
            this.maxPunkte = -1;
        }
    }

    public int getErziehltePunkte() {
        return erziehltePunkte;
    }

    public void setErziehltePunkte(int erziehltePunkte) {
        if (erziehltePunkte <= getMaxPunkte()){
            this.erziehltePunkte = erziehltePunkte;
        } else {
            this.erziehltePunkte = 0;
        }
    }

    public double berechnePunkte(){
        return 100.0f / maxPunkte * erziehltePunkte;
    }

    public int getNote(){
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
