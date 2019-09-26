package AE2.day02.generic;

public class Node <T>{
    private T value;
    private Node<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
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

    public void add(T value){
        if (hasNext()) getNext().add(value);
        else setNext(new Node<T>(value,null));
    }

    public Node() {
        this(null,null);
    }

    public Node(T value){
        this(value, null);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
