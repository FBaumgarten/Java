package AE.tag03.vormittag;

public class Auto {
    private int baujahr;
    private String farbe;

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr >= 1886 && baujahr <= 2019 ? baujahr : -1;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public Auto(int baujahr, String farbe) {
        this.setBaujahr(baujahr);
        this.setFarbe(farbe);
    }

    public Auto() {
        this(0,"");
    }
}
