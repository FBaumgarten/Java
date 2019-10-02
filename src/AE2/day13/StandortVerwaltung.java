package AE2.day13;

import java.util.ArrayList;

public class StandortVerwaltung {
    private ArrayList<Standort> standorte = null;

    public StandortVerwaltung() {
        standorte = new ArrayList<Standort>();
    }

    public void addStandort(String bezeichnung){
        standorte.add( new Standort(bezeichnung));
    }

    public Standort getStandort(String bezeichnung){
        for (Standort standort:standorte) {
            if (bezeichnung.equals(standort.getBezeichnug())) {
                return standort;
            }
        }
        return null;
    }

    public int deleteStandort(String bezeichnung){
        ArrayList<Standort> toDelete = new ArrayList<>();
        for (Standort standort:standorte) {
            if (bezeichnung.equals(standort.getBezeichnug())) {
                toDelete.add(standort);
            }
        }
        standorte.removeAll(toDelete);
        return toDelete.size();
    }

    public ArrayList<Standort> getStandorte() {
        return standorte;
    }

    public void setStandorte(ArrayList<Standort> standorte) {
        this.standorte = standorte;
    }

    @Override
    public String toString() {
        return standorte.toString();
    }
}
