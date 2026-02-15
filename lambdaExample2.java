package stream.test.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class lambdaExample2 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        Stream<Integer> stream = numbers.stream();

        numbers.stream()
                .mapToInt(number -> (int) Math.pow(number , 2))
                .map(number -> number + 10)
                .forEach(number -> System.out.println(number));

    }
}
