// generic class with bounded type parameters
public class BoundedBucket<T extends Number> {
    private T number;
    public BoundedBucket(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
}
