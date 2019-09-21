package app;

import com.google.common.collect.Streams;
import java.util.stream.Stream;

/**
 * @Author: Arkadiusz Brych
 */
public class StreamLesson {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.iterate(0, x -> x + 1);
        Stream<Integer> integerStream = numbers
                .filter(x -> x > 100)
                .filter(x -> x < 1000)
                .filter(x -> x % 5 == 0)
                .limit(10)
                .map(x -> x * 3);

        Streams.mapWithIndex(integerStream,(x, index) -> index + " = " + x)
                .forEach(System.out::println);
    }
}
