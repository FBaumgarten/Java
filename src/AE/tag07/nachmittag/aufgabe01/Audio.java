package AE.tag07.nachmittag.aufgabe01;

public class Audio extends MediaAdapter {
    @Override
    public void play() {
        super.play();
        System.out.println(getClass() + ": Play Audio");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println(getClass() + ": Stop Audio");
    }
}
