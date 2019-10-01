package AE2.comcave.inventar;

import java.util.ArrayList;

public class Resourcenverwaltung {
    ArrayList<Standort> standorte;

    public ArrayList<Mitarbeiter> generiereMitarbeiterListe(){
        ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
        for (Standort standort:standorte) {
            mitarbeiterListe.addAll(standort.generiereMitarbeiterListe());
        }
        return mitarbeiterListe;
    }

    public  ArrayList<Ausstattung> generiereInventar(){
        return null;
    }
}
