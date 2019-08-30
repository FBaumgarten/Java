package AE.tag02.nachmittag.aufgabe01;

public class Radio {
    private boolean eingaschaltet;
    private int     lautstaerke;
    private double  frequenz;

    public boolean isEingaschaltet() {
        return eingaschaltet;
    }

    public void setEingaschaltet(boolean eingaschaltet) {
        this.eingaschaltet = eingaschaltet;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public double getFrequenz() {
        return frequenz;
    }

    public void setFrequenz(double frequenz) {
        this.frequenz = frequenz;
    }

    public Radio() {
        setLautstaerke(0);
        setEingaschaltet(false);
        setFrequenz(99.9f);
    }

    public Radio(boolean eingaschaltet, int lautstaerke, float frequenz) {
        this.eingaschaltet = eingaschaltet;
        this.lautstaerke = lautstaerke;
        this.frequenz = frequenz;
    }

    @Override
    public String toString() {
        return eingaschaltet ? "Radio an: Freq="+getFrequenz()+", Laut="+getLautstaerke() : "Radio aus: Freq="+getFrequenz()+", Laut="+getLautstaerke();
    }

    public void waehleSender(double frequenz){
        if (frequenz <= 110.0f && frequenz >= 85.0f) setFrequenz(frequenz);
        else setFrequenz(99.9f);
    }

    public void lauter(){
        if (getLautstaerke()<10)setLautstaerke(getLautstaerke()+1);
    }

    public void leiser(){
        if (getLautstaerke()>0) setLautstaerke(getLautstaerke() - 1);
    }

    public void an(){
        setEingaschaltet(true);
    }

    public void aus(){
        setEingaschaltet(false);
    }
}
