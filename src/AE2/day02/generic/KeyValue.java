package AE2.day02.generic;

public class KeyValue<K, T> {
    private K key;
    private T value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public KeyValue(){

    }

    public KeyValue(K key, T value){
        setKey(key);
        setValue(value);
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
