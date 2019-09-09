package AE.tag10.vormittag;

public class PersonTest {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        personList.hinzufuegen(new Person("Mustermann", "Max","01.01.1960"));
        personList.hinzufuegen(new Person("Müller", "Emil","01.02.1970"));
        personList.hinzufuegen(new Person("Meier", "Franz","01.03.1980"));
        personList.hinzufuegen(new Person("Schultz", "Karl","01.04.1950"));

        System.out.println(personList);
        personList.menu();
    }
}
