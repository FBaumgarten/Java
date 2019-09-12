package AE2.day01.vektor;

public class Vektor3 extends Vektor2 {
    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Vektor3(float x, float y, float z) {
        super(x, y);
        setZ(z);
    }

    public Vektor3(){
        this(0.0f,0.0f,0.0f);
    }

    @Override
    public String toString() {
        return "( " + getX() + " | " + getY() + " | " + getZ() + " )";
    }
}
