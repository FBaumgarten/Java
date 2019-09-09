package AE.tag09.nachmittag;

import java.util.Random;

public enum Farbe {
    ROT (1), GELB (2), BLAU (3), WEISS(4), GRUEN(5), LILA(6), ORANGE(7);

    private int anInt;

    Farbe(int i) {
        this.anInt = i;
    }

    public int getAnInt() {
        return anInt;
    }

    @Override
    public String toString() {
        return  Integer.toString(getAnInt()) ;
    }

    public static Farbe randomFarbe(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
