public class Main {
    public static void main(String[] args) {
        // test generic class Buckets
        Bucket<String> bucket1 = new Bucket<>();
        Bucket<Integer> bucket2 = new Bucket<>();

        bucket1.putInBucket("Hello world");
        bucket2.putInBucket(100);

        System.out.println(bucket1.fetchFromBucket());
        System.out.println(bucket2.fetchFromBucket());

        // test generic class with multi type parameters ComplexBucket
        ComplexBucket<Integer, String> complexBucket = new ComplexBucket<>(886,"bye");
        complexBucket.showTypes();
        System.out.println(complexBucket.getData1());
        System.out.println(complexBucket.getData2());

        // test generic class with bounded type parameters
        BoundedBucket<Integer> boundedBucket = new BoundedBucket<>(666);
        System.out.println(boundedBucket.getNumber());

        // test generic method printArr
        Printer printer = new Printer();
        Integer[] arr1 = {0,1,2,3};
        String[] arr2 = {"Hello","World"};
        Character[] arr3 = {'G','E','N','E','R','I','C'};

        printer.printArr(arr1);
        printer.printArr(arr2);
        printer.printArr(arr3);
    }
}