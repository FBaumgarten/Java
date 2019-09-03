package AE.tag03.nachmittag.aufgabe02;

public class Element {
    private String name;
    private String symbol;
    private int ordnungszahl;
    private char schale;
    private int aggregat25c; //Fest=1, Flüssig=2, Gasförmig=3
    private boolean hauptgruppe;

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getOrdnungszahl() {
        return ordnungszahl;
    }

    public void setOrdnungszahl(int ordnungszahl) {
        this.ordnungszahl = ordnungszahl;
    }

    public char getSchale() {
        return schale;
    }

    public void setSchale(char schale) {
        this.schale = schale;
    }

    public int getAggregat25c() {
        return aggregat25c;
    }

    public void setAggregat25c(int aggregat25c) {
        this.aggregat25c = aggregat25c;
    }

    public boolean isHauptgruppe() {
        return hauptgruppe;
    }

    public void setHauptgruppe(boolean hauptgruppe) {
        this.hauptgruppe = hauptgruppe;
    }

    public Element(String name, String symbol, int ordnungszahl, char schale, int aggregat25c, boolean hauptgruppe) {
        setName(name);
        setSymbol(symbol);
        setOrdnungszahl(ordnungszahl);
        setSchale(schale);
        setAggregat25c(aggregat25c);
        setHauptgruppe(hauptgruppe);
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + getName() + '\'' +
                ", symbol='" + getSymbol() + '\'' +
                ", ordnungszahl=" + getOrdnungszahl() +
                ", schale=" + getSchale() +
                ", aggregat25c=" + getAggregat25c() +
                ", hauptgruppe=" + isHauptgruppe() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().getSimpleName().equals(this.getClass().getSimpleName())) {
            return ((Element) obj).getOrdnungszahl() == this.getOrdnungszahl();
        } return false;
    }
}
