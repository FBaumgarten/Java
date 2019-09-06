package AE.tag06.nachmittag;

import java.util.Scanner;

public abstract class GrundFunktionen {
    private String value;

    public void eingabe(){
        Scanner scanner = new Scanner(System.in);
        setValue(scanner.nextLine());
        scanner.close();
    }

    public void ausgabe(){
        System.out.println(getValue());
    }

    protected String getValue() {
        return value;
    }

    protected void setValue(String value) {
        this.value = value;
    }

    public GrundFunktionen() {
        setValue("");
    }
}
