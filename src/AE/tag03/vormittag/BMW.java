package AE.tag03.vormittag;

public class BMW extends Auto {
    public BMW(int baujahr, String farbe) {
        this.setBaujahr(baujahr);
        this.setFarbe(farbe);
    }

    @Override
    public void setBaujahr(int baujahr) {
        super.setBaujahr(baujahr >= 1929 && baujahr <= 2019 ? baujahr : -1);
    }
}
