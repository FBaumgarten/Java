package AE2.day02.generic;

public class GenArray <T> {
    public T[] values;

    public GenArray(T[] values) {
        this.values = values;
    }

    @SuppressWarnings("unchecked")
    public GenArray() {
        this.values = (T[]) new Object[5];
    }
}
