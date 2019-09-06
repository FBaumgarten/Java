package AE.tag04.vormitttag;

public class Teilnehmer {
    private String name;
    private int erziehltePunkte;
    private int note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getErziehltePunkte() {
        return erziehltePunkte;
    }

    public void setErziehltePunkte(int erziehltePunkte) {
        this.erziehltePunkte = erziehltePunkte;
    }

    public Teilnehmer() {
        setName("");
        setNote(0);
        setErziehltePunkte(0);
    }

    public Teilnehmer(String name, int erziehltePunkte, int note) {
        setName(name);
        setErziehltePunkte(erziehltePunkte);
        setNote(note);



    }


}
