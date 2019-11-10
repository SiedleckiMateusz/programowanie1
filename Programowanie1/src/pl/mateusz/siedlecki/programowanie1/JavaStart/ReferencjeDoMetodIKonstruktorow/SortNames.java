package pl.mateusz.siedlecki.programowanie1.JavaStart.ReferencjeDoMetodIKonstruktorow;


import java.util.ArrayList;
import java.util.List;

public class SortNames {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mateusz");
        names.add("Karol");
        names.add("Amadeusz");
        names.add("Zygmunt");
        names.add("Bartosz");
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);
    }
}
