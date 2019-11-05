package pl.mateusz.siedlecki.programowanie1.JavaStart.OperacjeNATablicach;

public class TestPersonDatabase {

    public static void main(String[] args) {
        PersonDatabase bazaOsob = new PersonDatabase();
        Person p1 = new Person("Mateusz", "Siedlecki", "92042810518");
        Person p2 = new Person("Marek", "Sielski", "45686454548");
        Person p3 = new Person("Marcelina", "Lubelska", "454887748485");

        bazaOsob.add(p1);
        bazaOsob.add(p2);
        bazaOsob.add(p3);

        System.out.println("Moja tablica");
        presentMyTab(bazaOsob);

        System.out.println();
        System.out.println("Dodaje Paulinę i wyswietlam nową tablicę");
        Person p4 = new Person("PAulina", "Chujwiejaka", "5648566500000");
        bazaOsob.add(p4);
        presentMyTab(bazaOsob);

        System.out.println();
        System.out.println("Prubuję usunąć osobę której nie ma i wyświetlam tablice");
        bazaOsob.remove(new Person("a","b","c"));
        presentMyTab(bazaOsob);

        System.out.println();
        System.out.println("A teraz usuwam Marcelinę która istnieje w tablicy");
        bazaOsob.remove(p3);
        presentMyTab(bazaOsob);


    }

    public static void presentMyTab(PersonDatabase personDatabase){
        for (int i = 0; i<personDatabase.size; i++){
            System.out.println(personDatabase.get(i));
        }
    }

}
