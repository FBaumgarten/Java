package AE.tag03.nachmittag.aufgabe02;

import java.util.Arrays;

public class Perieodensystem {
    private  Element[] elements = new Element[118];

    public void addElement(Element e){
        elements[e.getOrdnungszahl() - 1] = e;
    }

    public boolean hasElement(Element e){
        if (getElement(e.getOrdnungszahl() - 1)!=null){
            return true;
        }
        return false;
    }

    public Element getElement(int oz){
        return elements[oz - 1];
    }

    public Element[] getElements(){
        return elements;
    }

    public void listElements(){
        for (Element e: elements) {
            if (e != null){
                System.out.println(e);
            }
        }
    }

    public void listMetals(){
        for (Element e: elements) {
            if (e != null && e.getClass().getSimpleName().equals("Metal")){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Perieodensystem perieodensystem = new Perieodensystem();
        perieodensystem.addElement(new Element("Wasserstoff","H", 1, 'K', 3, true));
        perieodensystem.addElement(new Element("Helium", "He", 2, 'K', 3, true));
        perieodensystem.addElement(new Metal("Natrium", "Na", 11, 'M', 1, true, false, 21000000));
        perieodensystem.addElement(new Metal("Eisen", "Fe", 26, 'N', 1, false, false, 10020000));
        perieodensystem.addElement(new Metal("Germanium", "Ge", 32, 'N', 1, false, true, 1.45));
        perieodensystem.addElement(new Element("Brom", "Br", 35, 'N', 2, true));
        perieodensystem.addElement(new Metal("Tellur", "Te", 52, 'O', 1, true, true, 0.005));
        perieodensystem.addElement(new Metal("Gold", "Au", 79, 'P', 1, false, false, 44000000));

        //perieodensystem.listElements();
        perieodensystem.listMetals();
        System.out.println(perieodensystem.getElement(79));
    }
}
