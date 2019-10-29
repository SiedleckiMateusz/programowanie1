package pl.mateusz.siedlecki.programowanie1.JavaStart.AgregacjaIKompozycja;

public class BankAccount2 {
    Person owner;
    double balance;

    @Override
    public String toString() {
        return this.owner.toString()+"\nStan konta: "+this.balance;
    }
}
