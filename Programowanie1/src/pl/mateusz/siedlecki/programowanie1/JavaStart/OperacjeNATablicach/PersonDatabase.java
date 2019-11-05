package pl.mateusz.siedlecki.programowanie1.JavaStart.OperacjeNATablicach;

import java.util.Arrays;

public class PersonDatabase {
    Person[] persons = new Person[DEFAULT_SIZE_OF_TAB];
    int size = 0;
    private static int DEFAULT_SIZE_OF_TAB = 10;

    public void add(Person person){
        if (persons.length<=size){
            persons = Arrays.copyOf(persons,persons.length+DEFAULT_SIZE_OF_TAB);
        }
        persons[size] = person;
        size++;
    }

    public void remove(Person person){
        int index = indexFor(person);
        if (index>=0){
            System.arraycopy(persons,index+1,persons,index,size);
            size--;
        }
    }

    public int indexFor(Person person){

        if (person!=null){
            for (int i=0; i<persons.length; i++){
                if (person.equals(persons[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    public Person get(int index){
        if (index<size){
            return persons[index];
        }
        return null;
    }

    public int size(){
        return this.size;
    }


}
