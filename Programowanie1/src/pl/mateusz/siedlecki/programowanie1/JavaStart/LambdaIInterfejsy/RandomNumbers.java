package pl.mateusz.siedlecki.programowanie1.JavaStart.LambdaIInterfejsy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random r = new Random();
        randomNumber(numbers, 10, ()->r.nextInt(100));
        show(numbers, x-> System.out.print(x+", "));

        System.out.println();
        System.out.println("USUNIĘTO ELEMENTY PARZYSTE");
        doFor(numbers, n -> n%2==0);
        show(numbers, n-> System.out.print(n+", "));
    }

    private static <T> void randomNumber(List<T> list, int num, Supplier<T> sup) {
        for (int i = 0; i < num; i++) {
            list.add(sup.get());
        }
    }

    private static <T> void show(List<T> list, Consumer<T> consumer){
        for (T t:list){
            consumer.accept(t);
        }
    }

    private static <T> void doFor(List<T> list, Predicate<T> pre){
        for (int i = 0; i<list.size(); i++){
            if (pre.test(list.get(i))){
                list.remove(i);
                i--;
            }
        }
    }

}
