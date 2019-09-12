package AE.tag11.vormittag;

public class Fehlerbehandlung {
    public static void main(String[] args) {
        try {
            Fehler.fehler1();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fehler1: " + e.toString());
            //e.printStackTrace();
        }
        try {
            Fehler.fehler2();
        } catch (ArithmeticException e){
            System.out.println("Fehler2: " + e.toString());
        }

    }
}
