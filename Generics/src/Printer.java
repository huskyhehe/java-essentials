public class Printer {

    public Printer() {};

    // generic method
    public <T> void printArr(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }
}
