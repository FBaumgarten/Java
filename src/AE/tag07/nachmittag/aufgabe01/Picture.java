package AE.tag07.nachmittag.aufgabe01;

public class Picture extends MediaAdapter {
    @Override
    public void display() {
        super.display();
        System.out.println(getClass() + ": Display picture");

    }
}
