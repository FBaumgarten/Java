package AE2.day02.generic;

public class GenericTest {
    public static void main(String[] args) {
//        KeyValue<Integer, String> kv1 = new KeyValue<>(1,"Hallo");
//        KeyValue<Float,Integer> kv2 = new KeyValue<>(1.5f, 88);
//        KeyValue<String, String> kv3 = new KeyValue<>("1A", "Karl-Gustaff");
//        System.out.println(kv1);
//        System.out.println(kv2);
//        System.out.println(kv3);

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
