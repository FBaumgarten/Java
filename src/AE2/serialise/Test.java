package AE2.serialise;

import java.io.Serializable;

public class Test implements Serializable {
    public String name;
    private  int alter;
    private  int platz;
    public int getPlatz() {
        return platz;
    }
    public void setPlatz(int platz) {
        this.platz = platz;
    }

    public Test(String name, int alter, int platz){
        this.name = name;
        this.alter = alter;
        this.platz = platz;
    }

    @Override
    public String toString() {
        return name + ", " + alter + ", " + platz;
    }
}
