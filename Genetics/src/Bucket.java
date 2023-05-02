// Generic class with single type parametersS
class Bucket<T> {
    private T item;

    public void putInBucket(T item) {
        this.item = item;
    }

    public T fetchFromBucket() {
        return item;
    }
}
