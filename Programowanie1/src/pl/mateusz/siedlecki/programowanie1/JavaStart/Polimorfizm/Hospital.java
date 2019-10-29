package pl.mateusz.siedlecki.programowanie1.JavaStart.Polimorfizm;

public class Hospital {
    private Person[] persons;
    private int index = 0;

    public Hospital(int size) {
        this.persons = new Person[size];
    }

    public void add(Person person) {
        this.persons[index] = person;
        index++;
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder("PRACOWNICY SZPITALA: \n");

        for (Person person : persons) {
            if (person!= null) {
                info.append(person.toString());
                info.append("\n");
            }
        }
        return String.valueOf(info);


    }
}
