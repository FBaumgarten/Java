package AE.tag07.nachmittag.aufgabe01;

public class Video extends MediaAdapter {
    @Override
    public void play() {
        super.play();
        System.out.println(getClass() + ": Play Video");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println(getClass() + ": Stop Video");
    }

    @Override
    public void display() {
        super.display();
        System.out.println(getClass() + ": Display Video");
    }
}
