package stream.test.ex1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class lambdaExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "kim", "lee", "park"
        );

        Stream<String> stream = names.stream();
        names.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.println(name + "님"));
    }
}
