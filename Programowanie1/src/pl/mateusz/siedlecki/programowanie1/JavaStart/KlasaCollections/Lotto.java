package pl.mateusz.siedlecki.programowanie1.JavaStart.KlasaCollections;


import javax.swing.*;
import java.util.*;


public class Lotto {


    public static void main(String[] args) {

        List<Integer> lottoList = generateList();

        randomize(lottoList);

        List<Integer> myType = Arrays.asList(5, 14, 23, 9, 43, 1);

        showList(lottoList, "WYLOSOWANE LICZBY");
        showList(myType, "MOJE LICZBY");
        System.out.println("ILOŚĆ TRAFIEŃ: "+chceckResult(myType, lottoList));

    }

    public static void showList(List<Integer> list, String nazwaListy){
        System.out.print(nazwaListy+": ");
        for (int i = 0; i<6; i++){
            if (i!=5){
                System.out.print(list.get(i)+", ");
            }else{
                System.out.print(list.get(i));
            }
        }
        System.out.println();
    }

    public static List<Integer> generateList(){
        Integer[] numbers = new Integer[49];

        for (int i = 0; i<numbers.length; i++){
            numbers[i] = i+1;
        }
        return Arrays.asList(numbers);
    }

    public static void randomize(List<Integer> list){
        Collections.shuffle(list);
    }

    public static int chceckResult(List<Integer> myList, List<Integer> officalList){
        int ile = 0;
        for (int indexMyList = 0; indexMyList<myList.size(); indexMyList++){
            for (int i = 0; i<6;i++){
               if (myList.get(indexMyList).equals(officalList.get(i))){
                   ile++;
               }
            }
        }
        return ile;
    }
}
