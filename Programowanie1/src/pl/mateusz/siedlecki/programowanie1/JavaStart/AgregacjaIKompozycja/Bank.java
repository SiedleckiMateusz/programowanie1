package pl.mateusz.siedlecki.programowanie1.JavaStart.AgregacjaIKompozycja;

public class Bank {


    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "5437584665";
        person1.domicile = "Warszawa";
        person1.placeOfResidence = "Lublin";


        BankAccount2 account1 = new BankAccount2();
        account1.owner = person1;
        account1.balance = 10000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorowed = 5000;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.10;
        credit1.termMonths = 12;

        System.out.println(account1);
        System.out.println(credit1);
    }
}
