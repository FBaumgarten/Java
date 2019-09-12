package AE2.day01.vektor;

public class Vektor2 {
    private float x,y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Vektor2() {
        this(0.0f,0.0f);
    }

    public Vektor2(float x, float y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "( " + getX() + " | " + getY() + " )";
    }

    public Vektor2 addVektor(Vektor2 vektor2){
        return new Vektor2(this.getX() + vektor2.getX(),this.getY() + vektor2.getY());
    }

    public Vektor2 subVektor(Vektor2 vektor2){
        return new Vektor2(this.getX() - vektor2.getX(),this.getY() - vektor2.getY());
    }

    public Vektor2 multiVektor(Vektor2 vektor2){
        return new Vektor2(this.getX() * vektor2.getX(),this.getY() * vektor2.getY());
    }

    public Vektor2 multiVektor(float f) {
        return new Vektor2(this.getX() * f, this.getY() * f);
    }

    //Alternative statisch, ist vermutlich besser ?
    public static Vektor2 addVektor (Vektor2 v1, Vektor2 v2){
        return new Vektor2(v1.getX() + v2.getX(),v1.getY() + v2.getY());
    }
}
