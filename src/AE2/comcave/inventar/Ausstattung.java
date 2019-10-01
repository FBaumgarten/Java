package AE2.comcave.inventar;

abstract class Ausstattung extends Resource{
    Raum standort;

    public Raum getStandort() {
        return standort;
    }

    public void setStandort(Raum standort) {
        this.standort = standort;
    }

}
