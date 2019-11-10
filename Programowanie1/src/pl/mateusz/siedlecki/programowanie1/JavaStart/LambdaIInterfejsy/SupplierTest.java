package pl.mateusz.siedlecki.programowanie1.JavaStart.LambdaIInterfejsy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Random r = new Random();
        generate(numberList, 50, ()->r.nextInt(1000));

        for (Integer i : numberList){
            System.out.print(i+", ");
        }
    }

    private static <T> void generate(List<T> list, int num, Supplier<T> sup){
        for (int i = 0; i<num; i++){
            list.add(sup.get());
        }
    }
}
