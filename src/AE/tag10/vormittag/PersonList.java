package AE.tag10.vormittag;

import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> personen = new ArrayList<>();

    public void hinzufuegen(Person person){
        personen.add(person);
    }

    public void loeschen(Person person){
        personen.remove(person);
    }

    public int suche(Person person){
        return personen.indexOf(person);
    }

    public void aendern(Person personAlt, Person personNeu){
        personen.set(suche(personAlt),personNeu);
    }

    public void menu(){
        System.out.println("Personenliste");
        System.out.println("(1) Person hinzufügen");
        System.out.println("(2) Person löschen");
        System.out.println("(3) Person suchen");
        System.out.println("(4) Person ändern");
    }

    @Override
    public String toString() {
        String s = "";
        for (Person person:personen) {
            s = s + person + "\n";
        }
        return s;
    }
}
