package AE.tag09.nachmittag;

public class Spielfeld {
    public static final int SIZE_X = 9, SIZE_Y = 9;
    private Zelle[][] spielefeldArray = new Zelle[SIZE_X][SIZE_Y];

    public void initSpielfeld() {
        fuelleFarben();
        fuelleNachbarn();

//        for (Zelle[] row:spielefeldArray) {
//            for (Zelle zelle:row) {
//                zelle = new Zelle();
//                zelle.setZellenFarbe(Farbe.randomFarbe());
//            }
//        }
    }

    private void fuelleNachbarn() {
        for (int x = 0; x < spielefeldArray.length; x++) {
            for (int y = 0; y < spielefeldArray[x].length; y++) {
                if (x > 0) spielefeldArray[x][y].setNord(spielefeldArray[x-1][y]);
                else spielefeldArray[x][y].setNord(null);
                if (x < spielefeldArray.length - 1) spielefeldArray[x][y].setSued(spielefeldArray[x + 1][y]);
                else spielefeldArray[x][y].setSued(null);
                if (y > 0) spielefeldArray[x][y].setWest(spielefeldArray[x][y-1]);
                else spielefeldArray[x][y].setWest(null);
                if (y < spielefeldArray[x].length - 1) spielefeldArray[x][y].setOst(spielefeldArray[x][y+1]);
                else spielefeldArray[x][y].setOst(null);
            }
        }
    }

    private void fuelleFarben() {
        for (int x = 0; x < spielefeldArray.length; x++) {
            for (int y = 0; y < spielefeldArray[x].length; y++) {
                spielefeldArray[x][y] = new Zelle(Farbe.randomFarbe(), x, y);
            }
        }
    }

    public void printSpielfeld() {
        for (int x = 0; x < spielefeldArray.length; x++) {
            System.out.println();
            for (int y = 0; y < spielefeldArray[x].length; y++) {
                System.out.print("\t" + spielefeldArray[x][y].getZellenFarbe());
            }
        }
    }

    public void updateSpielfeld() {

    }

    public Spielfeld() {
    }
}
