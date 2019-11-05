package pl.mateusz.siedlecki.programowanie1.JavaStart.OperacjeNATablicach;

import java.awt.event.PaintEvent;

public class Person {
    private String firstName;
    private String lastName;
    private String idNumber;

    public Person(String firstName, String lastName, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Person p;
        if (obj==null){
            return false;
        }
        if (obj==this){
            return true;
        }
        if (obj instanceof Person){
            p = (Person) obj;

            return (this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.idNumber.equals(p.idNumber));
        }
        return false;
    }

    @Override
    public String toString() {
        return ("Imie i nazwisko: "+firstName+" "+lastName+", PESEL: "+ idNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
