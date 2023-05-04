package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        /*
         * Stream Operations
         * 1. Creating Streams
                concat()
                empty()
                generate()
                iterate()
                of()
           2. Intermediate Operations
                filter()
                map()
                flatMap()
                distinct()
                sorted()
                peek()
                limit()
                skip()
           3. Terminal Operations
                forEach()
                forEachOrdered()
                toArray()
                reduce()
                collect()
                min()
                max()
                count()
                anyMatch()
                allMatch()
                noneMatch()
                findFirst()
                findAny()
         */

        // frequently used stream processing:
        List<String> stringList = Arrays.asList("apple", "banana", "orange");

        // 1. use map() and collect() to collect data into a table
        List<String> uppercaseList = stringList.stream()
                .map(String::toUpperCase)
                .toList();                  // collect(Collectors.toList()
        System.out.println("uppercaseList = " + uppercaseList);             // uppercaseList = [APPLE, BANANA, ORANGE]

        // 2. use collectors.groupBy() and collect()
        Map<Character, Long> countByFirstChar = stringList.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
        System.out.println("countByFirstChar = " + countByFirstChar);       // countByFirstChar = {a=1, b=1, o=1}


        /*
         * Parallel Streams
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println("Sum using serial stream: " + sum1);

        int sum2 = numbers.parallelStream().mapToInt(i -> i).sum();
        System.out.println("Sum using parallel stream: " + sum2);
    }
}
