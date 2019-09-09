package AE.tag09.nachmittag;

public class Zelle {
    private Zelle nord, ost, sued, west;
    private Farbe zellenFarbe;
    private int xCoord,yCoord;

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public Zelle getNord() {
        return nord;
    }

    public void setNord(Zelle nord) {
        this.nord = nord;
    }

    public Zelle getOst() {
        return ost;
    }

    public void setOst(Zelle ost) {
        this.ost = ost;
    }

    public Zelle getSued() {
        return sued;
    }

    public void setSued(Zelle sued) {
        this.sued = sued;
    }

    public Zelle getWest() {
        return west;
    }

    public void setWest(Zelle west) {
        this.west = west;
    }

    public Farbe getZellenFarbe() {
        return zellenFarbe;
    }

    public void setZellenFarbe(Farbe zellenFarbe) {
        this.zellenFarbe = zellenFarbe;
    }

    public Zelle() {
        this(null,null,null,null,null,-1,-1);
    }

    public Zelle(Farbe zellenFarbe, int xCoord, int yCoord){
        this(null,null,null,null,zellenFarbe,xCoord,yCoord);
    }

    public Zelle(Zelle nord, Zelle ost, Zelle sued, Zelle west, Farbe zellenFarbe, int xCoord, int yCoord) {
       setNord(nord);
       setOst(ost);
       setSued(sued);
       setWest(west);
       setZellenFarbe(zellenFarbe);
       setxCoord(xCoord);
       setyCoord(yCoord);
    }

    /**
     * Überprüfung ob Nachbarn dieselbe Farbe haben wie diese Zelle, was der Fall ist für den mitlere Zelle von drei Gleiche in Reihe
     * @return true wenn Nord-Süd oder Ost-West Nachbarn dieselbe Farbe haben wie diese Zelle
     */
    public boolean pruefeZelle(){
        if ((getNord().getZellenFarbe().equals(this.getZellenFarbe()) && getSued().getZellenFarbe().equals(this.getZellenFarbe())) ||
                (getOst().getZellenFarbe().equals(this.getZellenFarbe()) && getWest().getZellenFarbe().equals(this.getZellenFarbe()))){
            return true; //wenn nord-sued oder ost-west dieselbe Farbe wie Zelle haben
        } else return false;
    }
}
