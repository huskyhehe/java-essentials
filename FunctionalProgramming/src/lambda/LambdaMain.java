package lambda;

public class LambdaMain {
    public static void main(String[] args) {
        /* lambda expression
         * with params:
         * (Parameter list) -> lambda body
         *
         * without params:
         * () -> {...}
         */

        // 1 implement lambda with SAM functional interface
        SAMInterface welcome = (name) -> name + ", hello";
        SAMInterface welcomeEveryone = welcome;

        String result1 = welcome.hello("Mike");
        String result2 = welcomeEveryone.hello("Mike");

        System.out.println(welcome);                        // Main$$Lambda$14/0x0000000800c013f8@3d075dc0
        System.out.println("SAM hello: " + result1);        // SAM hello: Mike, hello
        System.out.println(welcomeEveryone);                // Main$$Lambda$14/0x0000000800c013f8@3d075dc0
        System.out.println("SAM hello: " + result2);        // SAM hello: Mike, hello

        SAMInterface welcome2 = (name) -> {
            return name + ", hiiiii";
        };
        System.out.println("SAM hello: " + welcome2.hello("Carrie"));       // SAM hello: Carrie, hiiiii


        // 2 implement lambda with SAM (with anonymous class)
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable function interface");
            }
        }).start();


        // 3 implement lambda with generic functional interface
        GenericInterface<String> reverse = (word) -> {
            StringBuilder result = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i --) {
                result.append(word.charAt(i));
            };
            return result.toString();
        };
        System.out.println("Generic reverse: " + reverse.func("test word"));        // Generic reverse: drow tset

        GenericInterface<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Generic factorial: " + factorial.func(5));              // Generic factorial: 120
    }
}
