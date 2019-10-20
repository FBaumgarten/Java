package AE2.serialise;

import java.io.*;
import java.util.ArrayList;

public class SerialTest    {

    public static final String FILE = "serial.txt";

    public static void main(String[] args) {
        ArrayList<Test> list = new ArrayList<>();
        list.add(new Test("Anne",1,1));
        list.add(new Test("Hans",5,5));
        list.add(new Test("Peter",7,7));
        serialize(list);

        list.clear();
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));

        //ACHTUNG nicht abwärts kompatibel, ändern sich die Atribute der Datenklasse ist eine altes Datenfile nicht mehr lesbar
        list = deserialize();
        for (Test item:list) {
            System.out.println(item);
        }
    }

    public static void serialize(ArrayList<Test> list){
        try (OutputStream outputStream = new FileOutputStream(FILE)){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Test> deserialize(){
        ArrayList<Test> result = null;
        try (InputStream inputStream = new FileInputStream(FILE)){
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            result = (ArrayList<Test>) objectInputStream.readObject();
        } catch (IOException e){
            System.out.println(e);
        } catch (ClassNotFoundException e){
            System.out.println(e);
        }
        return result;
    }
}
