// Generic class with multi type parameters
public class ComplexBucket<T, V> {
    private T data1;
    private V data2;

    public ComplexBucket(T o1, V o2) {
        this.data1 = o1;
        this.data2 = o2;
    }

    public void showTypes() {
        System.out.println("Type of T is " + this.data1.getClass().getName());
        System.out.println("Type of V is " + this.data2.getClass().getName());
    }

    public void setData1(T o1) {
        this.data1 = o1;
    }

    public void setData2(V o2) {
        this.data2 = o2;
    }

    public T getData1() {
        return this.data1;
    }

    public V getData2() {
        return this.data2;
    }
}
