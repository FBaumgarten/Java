package AE.tag07.nachmittag.aufgabe01;

public class TestMedia {
    public static void main(String[] args) {
        Picture picture = new Picture();
        Video video = new Video();
        Audio audio = new Audio();
        picture.display();
        picture.play();
        picture.stop();
        video.display();
        video.play();
        video.stop();
        audio.display();
        audio.play();
        audio.stop();
    }
}
