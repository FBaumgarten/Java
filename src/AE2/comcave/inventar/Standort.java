package AE2.comcave.inventar;

import java.util.ArrayList;

public class Standort extends Immobilie {
    ArrayList<Raum> raumListe;
    ArrayList<Mitarbeiter> mitarbeiterListe;

    public ArrayList<Mitarbeiter> generiereMitarbeiterListe(){
        return mitarbeiterListe;
    }

    public  ArrayList<Ausstattung> generiereInventar(){
        return null;
    }
}
