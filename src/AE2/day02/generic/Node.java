package AE2.day02.generic;

public class Node <T>{
    private T value;
    private Node next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext(){
        return next != null;
    }

    public Node(T value, Node next) {
        setValue(value);
        setNext(next);
    }

    public Node() {
        this(null,null);
    }
}
