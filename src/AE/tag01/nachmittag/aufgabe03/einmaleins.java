package AE.tag01.nachmittag.aufgabe03;

public class einmaleins {
    public static void main(String[] args) {
        ausgabe(10);
    }

    private static void ausgabe(int limit) {
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println();

        }
    }
}
