package AE.tag07.nachmittag.aufgabe09;

public abstract class Mitarbeiter {
    int personalNr;
    String name;
    String datumEintritt;

    public String getName() {
        return name;
    }

    public int getPersonalNr() {
        return personalNr;
    }

    public Mitarbeiter() {
        this.personalNr = 0;
        this.name = "";
        this.datumEintritt = "";
    }

    public Mitarbeiter(int personalNr, String name, String datumEintritt) {
        this.personalNr = personalNr;
        this.name = name;
        this.datumEintritt = datumEintritt;
    }
}
