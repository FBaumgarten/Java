package AE2.day02.generic;

public class Queue <T>{
    private Node startNode;

    public Node getStartNode() {
        return startNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public Queue(Node startNode) {
        setStartNode(startNode);
    }

    public Queue(){
        this(null);
    }

    public void enqueue(Node node){
        if (startNode == null) setStartNode(node);
        else {
            Node run = getStartNode();
            while (run.hasNext()){
                run = run.getNext();
            }
            run.setNext(node);
        }
    }

    public void enqueue(T  value){
        Node<T> node = new Node<>(value);
        enqueue(node);
    }

    public Node dequeue(){
        if (startNode == null) return null;
        else {
            Node oldStartNode = startNode;
            setStartNode(startNode.getNext());
            return oldStartNode;
        }
    }
}
