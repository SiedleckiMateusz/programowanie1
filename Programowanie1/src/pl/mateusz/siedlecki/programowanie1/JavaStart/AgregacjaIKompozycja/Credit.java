package pl.mateusz.siedlecki.programowanie1.JavaStart.AgregacjaIKompozycja;

public class Credit {
    Person borrower;
    double cashBorowed;
    double cashReturned;
    double interestRate;
    int termMonths;

    @Override
    public String toString() {
        return (this.borrower.toString()+"\npożycznone pieniądze: "+this.cashBorowed+", oddano: "+cashReturned+", oprocentowanie: "+this.interestRate+", okres spłaty (mies): "+this.termMonths);
    }
}
