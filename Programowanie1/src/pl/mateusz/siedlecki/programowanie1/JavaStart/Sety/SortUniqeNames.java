package pl.mateusz.siedlecki.programowanie1.JavaStart.Sety;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortUniqeNames {


    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<String> listOfNames = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -(o1.compareTo(o2));
            }
        });

        try(Scanner sc = new Scanner(new File("namespl.txt"))){
            while(sc.hasNextLine()){
                listOfNames.add(sc.nextLine());
            }
        }

        System.out.println("Ilość imion w zbiorze: "+listOfNames.size());
        System.out.println("Pierwsze imie w zbiorze: "+listOfNames.first());
        System.out.println("Ostatnie imie w zbiorze: "+listOfNames.last());

    }

}
