package pl.mateusz.siedlecki.programowanie1.JavaStart.Polimorfizm;

public class Person {
    private String firstName;
    private String lastName;
    private int salary;

    public Person(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ("Imię i nazwisko: "+firstName+" "+lastName+", wypłata: "+salary+" zł");
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
