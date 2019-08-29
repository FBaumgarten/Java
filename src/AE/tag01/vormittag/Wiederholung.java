package AE.tag01.vormittag;

import java.util.Scanner;

public class Wiederholung {

    static int eingabe(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ganzzahl eingeben: ");
        return sc.nextInt();

    }

    static int verarbeitung( int zahl){
        return zahl += 10;
    }

    static void ausgabe(int zahl){
        System.out.println(zahl);
    }

    public static void main(String[] args) {
        ausgabe(verarbeitung(eingabe()));
    }
}
