package pl.mateusz.siedlecki.programowanie1.JavaStart.AgregacjaIKompozycja;

public class Person {
    String firstName;
    String lastName;
    String pesel;
    String domicile;
    String placeOfResidence;

    @Override
    public String toString() {
        return (this.firstName+" "+this.lastName+", pesel: "+this.pesel+", miejsce zameldowania: "+this.domicile+", miejsce zamieszkania: "+placeOfResidence);
    }
}
