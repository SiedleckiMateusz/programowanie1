package pl.mateusz.siedlecki.programowanie1.Search;

import pl.mateusz.siedlecki.programowanie1.Sortowanie.QuickSort;

import java.util.Arrays;

public class BinarySearch<T extends Comparable<T>> implements Search<T> {

    public static void main(String[] args) {
        BinarySearch<String> search = new BinarySearch<>();
        Integer[] tab = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] tabString = {"Mateusz", "Natalia", "Jan", "Ola", "Krzysztof", "Paweł", "Bigos"};


        QuickSort<String> quickSort = new QuickSort<>();
        quickSort.sort(tabString);
        System.out.println(Arrays.toString(tabString));


        System.out.println(search.find(tabString, "Jan"));
    }

    @Override
    public int find(T[] tab, T value) {
        return searching(tab, value, 0, tab.length - 1);
    }

    private int searching(T[] tab, T value, int start, int end) {
        int medium = (start + end) / 2;

        if (value.equals(tab[medium])) {
            return medium;
        }
        if (value.compareTo(tab[medium]) > 0) {
            //prawa połowa
            if ((end - start) != 1) {
                return searching(tab, value, medium, end);
            }
        }

        if (value.compareTo(tab[medium]) < 0) {
            //lewa połowa
            if ((end - start) != 1) {
                return searching(tab, value, start, medium);
            }
        }
        return -1;
    }
}
