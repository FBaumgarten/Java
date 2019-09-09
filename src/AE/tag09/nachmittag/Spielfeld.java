package AE.tag09.nachmittag;

public class Spielfeld {
    public static final int SIZE_X = 9, SIZE_Y = 9;
    private Zelle[][] spielefeldArray = new Zelle[SIZE_X][SIZE_Y];

    public void initSpielfeld() {
        for (int x = 0; x < spielefeldArray.length; x++) {
            for (int y = 0; y < spielefeldArray[y].length; y++) {
                spielefeldArray[x][y] = new Zelle(Farbe.randomFarbe(), x, y);
            }
        }

//        for (Zelle[] row:spielefeldArray) {
//            for (Zelle zelle:row) {
//                zelle = new Zelle();
//                zelle.setZellenFarbe(Farbe.randomFarbe());
//            }
//        }
    }

    public void printSpielfeld() {
        for (int y = 0; y < spielefeldArray.length; y++) {
            System.out.println();
            for (int x = 0; x < spielefeldArray[y].length; x++) {
                System.out.print("\t" + spielefeldArray[x][y].getZellenFarbe());
            }
        }
    }

    public void updateSpielfeld() {

    }

    public Spielfeld() {
    }
}
