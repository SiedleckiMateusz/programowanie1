package pl.mateusz.siedlecki.programowanie1.JavaStart.Iterator;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class InfoAboutPeople {

    public static void main(String[] args) {
        Map<String, String> names = new TreeMap<>();

        names.put("Kowalski", "Jan Kowalski - 35");
        names.put("Adamiak", "Anna Adamiak - 21");
        names.put("Zaręba", "Adam Zaręba - 17");
        names.put("Piotrowkski", "Karol Piotrowski - 42");
        names.put("Bobrowska", "Michalina Bobrowska - 15");

        Iterator<String> valuesIterator = names.values().iterator();
        while (valuesIterator.hasNext()){
            System.out.println(valuesIterator.next());
        }
    }


}
