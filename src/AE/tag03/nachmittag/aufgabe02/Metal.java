package AE.tag03.nachmittag.aufgabe02;

public class Metal extends Element {
    private boolean halbmetal;
    private double leitfaehigkeit;

    public boolean isHalbmetal() {
        return halbmetal;
    }

    public void setHalbmetal(boolean halbmetal) {
        this.halbmetal = halbmetal;
    }

    public double getLeitfaehigkeit() {
        return leitfaehigkeit;
    }

    public void setLeitfaehigkeit(double leitfaehigkeit) {
        this.leitfaehigkeit = leitfaehigkeit;
    }

    public Metal(String name, String symbol, int ordnungszahl, char schale, int aggregat25c, boolean hauptgruppe, boolean halbmetal, double leitfaehigkeit) {
        super(name, symbol, ordnungszahl, schale, aggregat25c, hauptgruppe);
        setHalbmetal(halbmetal);
        setLeitfaehigkeit(leitfaehigkeit);
    }

    @Override
    public String toString() {
        return "Metal{" +
                "name='" + getName() + '\'' +
                ", symbol='" + getSymbol() + '\'' +
                ", ordnungszahl=" + getOrdnungszahl() +
                ", schale=" + getSchale() +
                ", aggregat25c=" + getAggregat25c() +
                ", hauptgruppe=" + isHauptgruppe() +
                ", halbmetal=" + isHalbmetal() +
                ", leitfaehigkeit=" + getLeitfaehigkeit() +
                '}';
    }
}
