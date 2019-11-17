package pl.mateusz.siedlecki.programowanie1.JavaStart.Strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Something {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = numbers.stream();

        List<Integer> someList = stream.filter(x -> x % 2 == 0 && x<5)
                .collect(Collectors.toList());

        System.out.println(someList.toString());
    }
}
