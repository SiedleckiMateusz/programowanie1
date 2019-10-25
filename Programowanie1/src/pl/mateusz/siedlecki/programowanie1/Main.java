package pl.mateusz.siedlecki.programowanie1;


import pl.mateusz.siedlecki.programowanie1.Sortowanie.QuickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        QuickSort<Integer> qs = new QuickSort<>();
        Integer[] tab = {9, 8, 6, 5, 4, 3, 2, 1, 7, 11, 1};

        qs.sort(tab);

        System.out.println();
        System.out.println(Arrays.toString(tab));

    }



}
