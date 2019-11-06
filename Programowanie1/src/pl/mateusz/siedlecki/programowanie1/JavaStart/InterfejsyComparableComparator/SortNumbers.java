package pl.mateusz.siedlecki.programowanie1.JavaStart.InterfejsyComparableComparator;

import java.util.Arrays;
import java.util.Comparator;

public class SortNumbers{



    public static void main(String[] args) {


        Integer[] integers = new Integer[]{4,2,67,3,121,43,654,32,121};
        System.out.println("Nieposortowane: ");
        for (Integer i: integers){
            System.out.print(i+", ");
        }

        Arrays.sort(integers);


        System.out.println();
        System.out.println("Posortowane rosnąco");
        System.out.println(Arrays.toString(integers));


        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });


        System.out.println();
        System.out.println("Posortowane malejąco");
        System.out.println(Arrays.toString(integers));
    }

}
