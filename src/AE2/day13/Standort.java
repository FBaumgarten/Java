package AE2.day13;

import java.util.ArrayList;

public class Standort {
    private String bezeichnung;
    ArrayList<String> raeume = null;

    public String getBezeichnug() { return bezeichnung; }
    public void setBezeichnung(String value) { bezeichnung = value; }

    public Standort() {
        raeume = new ArrayList<String>();
    }
    public Standort(String name) {
        this();
        this.setBezeichnung( name );
    }

    public void addRaum (String raum){
        raeume.add(raum);
    }

    @Override
    public String toString() {
        return getBezeichnug() + ", Räume: " + raeume;
    }
}
