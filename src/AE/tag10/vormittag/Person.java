package AE.tag10.vormittag;

public class Person {
    private String name, vorname, geburtsdatum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public Person() {
        this("","","");
    }

    public Person(String name, String vorname, String geburtsdatum) {
        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        return  name + ", " + vorname + ", " + geburtsdatum;
    }
}
